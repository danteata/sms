/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.Staff.Status;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Persistence;

/**
 *The School that is being managed
 * 
 * @author dantheta
 */
@Entity
public class School extends AbstractModel implements Serializable {

    public static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("smsPU");
    public static EntityManager manager = factory.createEntityManager();
    @OneToMany(mappedBy = "School")
    private List<Subject> subjects = new ArrayList<Subject>();
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    @OrderBy("levelName")
    private List<ClassLevel> classLevels = new ArrayList<ClassLevel>();
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String address;
    //private Phone_Details phoneDetails;
    private String email;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Person> persons = new ArrayList<Person>();
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<Student>();
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Admission> admissions = new ArrayList<Admission>();
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Teacher> teachers = new ArrayList<Teacher>();
    @Column(length = 45)
    private String location;
    private String motto;
    private volatile static School uniqueSchool;// the single school that is always called when a school is created.

    public static School getUniqueInstance() {  // returns uniqueInstance or creates a new one if not already created.
        if (uniqueSchool == null) {
            synchronized (School.class) {
                if (uniqueSchool == null) {    //create a new school if a school has not been created before.
                    //retrieves the only school.	
                    uniqueSchool = manager.find(School.class, 1L);
                }
            }
        }
        return uniqueSchool;   // the already created or newly created school.
    }

    /*
     * constructor for the single school. Prevents creating another instance of the school
     * in the program.
     */
    protected School() {
    }

    /*
     * creates a new person for the school
     * @returns person the new person created.
     */
    public Person createNewPerson(String fName, String mName, String lName, String religion, String contactNo, Gender gender, Date dob) {
        Person person = new Person();
        person.setfName(fName);
        person.setmName(mName);
        person.setlName(lName);
        person.setGender(gender);
        person.setDOB(dob);
        person.setReligion(religion);
        School school = School.getUniqueInstance();
        person.setSchool(school);
//		School.manager.getTransaction().begin();
        School.manager.persist(person);
        Phone_Details phoneDetails = new Phone_Details();
        phoneDetails.setPerson(person);
        phoneDetails.setContactNo(contactNo);
        School.manager.persist(phoneDetails);
        //  person.getPhoneDetails().add(phoneDetails);
        School.manager.refresh(person);  // updates person to include his phone details
        //


        School.manager.refresh(school); // updates school to include newly created student.
//		School.manager.getTransaction().commit();
        return person;
    }

    /*
     * records the admission process of a new student
     * @params student the student to be admitted.
     * @return admission the admission object of the process
     */
    private Admission admitStudent(Student student) {
        Admission admission = new Admission();  // record the admission process.
        admission.setDate_enrolled(new java.util.Date()); // sets the date of admission to the current date.
        admission.setStudent(student); //assign the person to be admitted.
        student.setAdmission(admission);
        getAdmissions().add(admission);

        return admission;
    }

    /*
     * Adds a new student to the school
     * @params the details of the student to be admitted.
     * @return true if the processs is successful
     */
    public boolean AddNewStudent(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Date dob, ClassRoom assignedClass, byte[] image) {
        try {
            School.manager.getTransaction().begin();
            School school = School.getUniqueInstance();
            Person person = school.createNewPerson(fName, mName, lName, religion, contactNo, genderOption, dob);  // create a new person from the details
            if (image != null) {
                person.setPicture(image); // adding his photo
            }
            Student student = school.createNewStudent(person); // create a new student from the person admitted.
            Admission admission = school.admitStudent(student); // record the admission process.

            System.out.println(student.getPerson().getFName());  //check
            School.manager.persist(school);
            School.manager.persist(admission);
            School.manager.persist(person);
            School.manager.persist(student);

            School.manager.getTransaction().commit();

            System.out.println(school.getName() + " is my name. FINALLY WORKS WOOHOO!!!");
            return true; //on successfull addition
        } catch (Exception e) {
            e.printStackTrace();
            School.manager.getTransaction().rollback();
            return false; // on failure

        } finally {
            //   Skuul.manager.close();
            // Skuul.manager.close();
        }
    }

    /*
     * Adds a new staff to the school
     * @params the details of the staff to be employed
     * @return true if the process is successful
     */
    public boolean AddNewStaff(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Status status, Date dob, byte[] image) {
        try {
            School.manager.getTransaction().begin();
            School school = School.getUniqueInstance();
            Person person = school.createNewPerson(fName, mName, lName, religion, contactNo, genderOption, dob);  // create a new person from the details
            if (image != null) {
                person.setPicture(image); // adding his photo
            }
            //make new person a staff
            Staff staff = new Staff();
            staff.setPerson(person);
            staff.setStatus(status);
            Employment employment = school.employStaff(staff); // record the employment process.

            Teacher teacher = school.createNewTeacher(staff); // create a new student from the person admitted.


            System.out.println(teacher.getStaff().getPerson().getFName());  //check
            School.manager.persist(employment);
            School.manager.persist(person);
            School.manager.persist(staff);
            School.manager.persist(teacher);
            School.manager.persist(school);

            School.manager.getTransaction().commit();

            System.out.println(school.getName() + " is my name. FINALLY WORKS WOOHOO!!!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            School.manager.getTransaction().rollback();
            return false;

        } finally {
            //   Skuul.manager.close();
            // Skuul.manager.close();
        }
    }

    /*
     * records the employment process of a staff and assigns the employment process to the staff
     * @params staff the staff to be employed.
     * @return employment the employment process
     */
    private Employment employStaff(Staff staff) {
        Employment employment = new Employment();  // record the admission process.
        employment.setDateEmployed(new java.util.Date()); // sets the date of admission to the current date.
        employment.setStaff(staff); //assign the person to be admitted.
        staff.setEmployment(employment);

        return employment;
    }

    /*
     * creates a new teacher from his staff object.
     * @params staff the staff object to be assigned to the teacher 
     * @returns teacher the teacher obtained from the staff object.
     *
     */
    private Teacher createNewTeacher(Staff staff) {
        Teacher teacher = new Teacher();
        teacher.setStaff(staff);
        teacher.setSchool(this);
        this.getTeachers().add(teacher);

        return teacher;
    }

    /*
     * creates a new student from his person object and sets relationship with school.
     * @returns student the student object created from the person object.
     *
     */
    private Student createNewStudent(Person person) {
        Student student = new Student();
        student.setPerson(person);
        student.setSchool(this);
        this.getStudents().add(student);

        return student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Subject> addSubject(Subject s) {
        List<Subject> oldSubjects = this.subjects;
        this.subjects.add(s);
        List<Subject> newSubjects = this.subjects;
        this.subjects.add(s);
        firePropertyChange("subjects", oldSubjects, newSubjects);
        return this.subjects;
    }

    public List<ClassLevel> addClassLevel(ClassLevel cl) {
        List<ClassLevel> oldClasses = this.classLevels;
        this.classLevels.add(cl);
        List<ClassLevel> newClasses = this.classLevels;
        firePropertyChange("classLevels", oldClasses, newClasses);
        return this.classLevels;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<ClassLevel> getClassLevels() {
        return classLevels;
    }

    public void setClassLevels(List<ClassLevel> classLevels) {
        this.classLevels = classLevels;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Admission> getAdmissions() {
        return admissions;
    }

    public void setAdmissions(List<Admission> admissions) {
        this.admissions = admissions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof School)) {
            return false;
        }
        School other = (School) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.name;

    }

    public  boolean createClassLevel(String levelName) {
        try {
            manager.getTransaction().begin();

            ClassLevel classLevel = new ClassLevel();
            classLevel.setLevelName(levelName);
            classLevel.setSchool(this);
            this.addClassLevel(classLevel);
            manager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            School.manager.getTransaction().rollback();
            return false;
        } finally { // close entity tools
//                    em.close();
            //                  emf.close();
        }
    }
}
