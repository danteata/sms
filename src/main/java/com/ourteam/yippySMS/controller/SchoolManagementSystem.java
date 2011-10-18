/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.view.AccessControl;
import com.ourteam.yippySMS.view.AdminMainView;
import com.ourteam.yippySMS.model.*;
import com.ourteam.yippySMS.model.Person.Gender;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author dantheta
 */
public class SchoolManagementSystem implements Serializable {
	public static void main(String[] args){
		
	 AdminMainView c = new AdminMainView();
        c.setVisible(true);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        AccessControl accessControlForm = new AccessControl();
        accessControlForm.setLocation((screen.width - 400) / 2, ((screen.height - 350) / 2));
        accessControlForm.setVisible(true);
	}
    /*
     * creates a new school for the sms
     * @returns school the new school that has been created.
     */
    public School createNewSchool(EntityManagerFactory emf, EntityManager em, String schoolName, String location, String motto, String email) {
        School school = School.getUniqueInstance(); // create a new school
        school.setName(schoolName); // set parameters for school
        school.setLocation(location);
        school.setMotto(motto);
        school.setAddress("p.o.box 4, Inchaban"); //TODO: will replace it later.
        school.setEmail(email);
        em.persist(school); // save school
        System.out.println(school.getName());
        return school;
    }

    public School retrieveSchool(EntityManagerFactory emf, EntityManager em, String schoolName) {
        Query query = em.createQuery("SELECT s FROM School s WHERE s.name = :name").setParameter("name", schoolName);
        School school = (School) query.getSingleResult();
        System.out.println(school.getName());
        return school;
    }

    /*
     * creates a new person for the school
     * @returns person the new person created.
     */
    public Person createNewPerson( String fName, String mName, String lName, String religion, String contactNo, Gender gender, Date dob, School school) {
        Person person = new Person();
        person.setfName(fName);
        person.setmName(mName);
        person.setlName(lName);
        person.setGender(gender);
        Phone_Details phoneDetails = new Phone_Details();
        phoneDetails.setPerson(person);
        phoneDetails.setContactNo(contactNo);
        School.manager.persist(phoneDetails);
        //  person.getPhoneDetails().add(phoneDetails);
       School.manager.refresh(person);  // updates person to include his phone details
//        Calendar calendar = Calendar.getUniqueInstance();
//        calendar.set(1987, 03, 18);  //TODO:Will replace it later.
//        person.setDOB(calendar.getTime());
        person.setDOB(dob);
        person.setReligion(religion);
        person.setSchool(school);
        School.manager.persist(person);
        School.manager.refresh(school); // updates school to include newly created student.
        return person;
    }

    public void listStudents(EntityManagerFactory emf, EntityManager em) {
        Query q = em.createQuery("select s from Student s");
        for (Student s : (List<Student>) q.getResultList()) {
            System.out.println(s.getPerson().getFName() + " " + (s.getPerson().getMName() == null ? "" : s.getPerson().getMName()) + " " + s.getPerson().getLName());
        }
    }

    /*
     * creates a new person from his person object.
     * @returns student the student object created from the person object.
     *
     */
    public Student createNewStudent(Person person) {
        Student student = new Student();
        student.setPerson(person);
        return student;
    }

    /*
     * creates a new person from his person object.
     * @returns student the student object created from the person object.
     *
     */
    public Teacher createNewTeacher(Person person, Subject preferredSubject) {
        Teacher teacher = new Teacher(); 
        teacher.setPerson(person);
//        teacher.getPreferredSubjects().add(preferredSubject);
//        teacher.getAssignedClass().add(assignedClass);
        return teacher;
    }

    /*
     * creates a new parent from his person object.
     * @returns parent the parent object created from the person object.
     *
     */
    public Guardian createNewParent(Person person) {
        Guardian parent = new Guardian();
        parent.setPerson(person);
        return parent;
    }

    public void assignParent(EntityManagerFactory emf, EntityManager em, Guardian parent, Student student) {
        parent.getStudents().add(student);
        em.refresh(student);
    }

    public void admit() {
        Admission admision = new Admission();
    }

//    public void admitStudent(EntityManagerFactory emf, EntityManager em) {
//        Person person = createNewPerson(emf, em, null, null, null, null, Gender.MALE, null, null);   // create new person for student
//        Student student = createNewStudent(person);  // create new student from the person object
//
//        Person person1 = createNewPerson(emf, em, null, null, null, null, Gender.MALE, null, null);  //create new person for a parent
//        Parent father = createNewParent(person1); //create  new parent from the person object
//        assignParent(emf, em, father, student);
//        Person person2 = createNewPerson(emf, em, null, null, null, null, Gender.MALE, null, null); // create new person for a parent object.
//        Parent mother = createNewParent(person2); // create a new parent from the person object.
//        assignParent(emf, em, mother, student); //assign the parent to the student.
//
//    }

    /*
     * creates a class level for the school.
     * @return classLevel the class level that is created.
     */
    public ClassLevel createNewClassLevel(EntityManagerFactory emf, EntityManager em, String levelName, School school) {
        ClassLevel classLevel = new ClassLevel(); //create a new class level eg. class 2
        classLevel.setSchool(school);
        classLevel.setLevelName(levelName);
        return classLevel;
    }

    /*
     * creates a sub class for a classlevel in the school.
     * @return classroom the sub class that is created.
     */
    public ClassRoom createNewClassRoom(EntityManagerFactory emf, EntityManager em, ClassLevel classLevel, String classroomName, int classroomCapacity) {
        ClassRoom classroom = new ClassRoom();
        classroom.setCapacity(classroomCapacity);
        classroom.setName(classroomName);
        classroom.setClassLevel(classLevel); // assigns sub class to the class level

//        classLevel.getClassRooms().add(classroom);
//        em.refresh(classLevel); // updates classLevel to include newly created class.

        return classroom;
    }

    public ArrayList<ClassLevel> retrieveAllClassLevels(EntityManagerFactory emf, EntityManager em) {
        Query query = em.createQuery("select cl from ClassLevel as cl");

        List<ClassLevel> results = query.getResultList();
        return (ArrayList) results;

    }

    public void admitTeacher(EntityManagerFactory emf, EntityManager em) {
    }
}
