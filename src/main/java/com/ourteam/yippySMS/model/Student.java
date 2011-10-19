/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.model;

import com.ourteam.yippySMS.model.Person.Gender;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Query;
import javax.persistence.Transient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dantheta
 */
@Entity
public class Student extends AbstractModel implements Serializable {
    private static final String PERSON_PROP = Student.class.getName() + "Person";
	@Transient  //not persisted
	ArrayList<Observer> observers;
    @ManyToOne
    private ClassRoom classRoom;
  //  @ManyToMany(mappedBy = "student")
  //  @ManyToMany
    @ManyToMany
    private List<Guardian> guardians;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @Cascade({CascadeType.ALL, CascadeType.DELETE_ORPHAN})
    private Person person;
    @ManyToOne
    private School school;
	@OneToOne
	@Cascade({CascadeType.ALL, CascadeType.DELETE_ORPHAN})
	private Admission admission;
	@OneToOne
	@Cascade({CascadeType.ALL, CascadeType.DELETE_ORPHAN})
	private ClassEnrollment enrollment;
 
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        registerChildModel(person, PERSON_PROP);
        Person oldPerson = this.person;
        this.person = person;
	//notifies listening objects of change
	firePropertyChange("Person", oldPerson, person);
	
    }

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
        
	public Admission getAdmission(){
		return this.admission;
	}
		
    


	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

	public ClassEnrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(ClassEnrollment enrollment) {
		this.enrollment = enrollment;
	}



    public List<Guardian> getGuardians() {
        return guardians;
    }

    public void setGuardians(List<Guardian> guardians) {
	    List<Guardian> oldParents = this.guardians;

        this.guardians = guardians;
	firePropertyChange("Parents", oldParents, guardians);
    }

    public void addGuardian(Guardian guardian){
	    this.guardians.add(guardian);
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getPerson().toString();
    }
    




     public ArrayList<Student> findAllStudents() {
    Query query = School.manager.createQuery("SELECT s FROM Student s");
    return (ArrayList<Student>) query.getResultList();
  } 

     public Student findByName(String name){
	     Query query = School.manager.createQuery("SELECT s FROM Student s where s.person.fName = :fName").setParameter("fName", name);
	     return (Student) query.getSingleResult();
     }

     /*
      * Searches for a student using his or her name
      * @param fullName the name of the student or list of students being searched for
      */
     public static List findByFullName(String fullName){

		    //processes and breaks name into firstName, middleName and LastName
                String[] names = fullName.trim().replaceAll("\\s+", " ").split(" ");
                Query query = null;
                String fName = names[0];
                School.manager.getTransaction().begin();
                if (names.length == 1) {//represents first name which is very unlikely
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName LIKE :fName").setParameter("fName", fName);
                } else if (names.length == 2) {//2 names represent first and last names
                    String lName = names[1];
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName =:fName AND s.person.lName = :lName").setParameter("fName", fName).setParameter("lName", lName);

                } else if (names.length == 3) { // if student has a middle name.
                    String mName = names[1];
                    String lName = names[2];
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName =:fName AND s.person.lName = :lName AND s.person.mName = :mName").setParameter("fName", fName).setParameter("lName", lName).setParameter("mName", mName);
                    System.out.println("query returned: " + query.getResultList().size());
     }
		School.manager.getTransaction().commit();
		return query.getResultList(); //returns the list of students obtained from query.
     }

    public void update(String fName, String mName, String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {
        this.getPerson().setfName(fName);
       this.getPerson().setmName(mName);
       this.getPerson().setlName(lName);
       this.getPerson().setReligion(religion);
       this.getPerson().setGender(gender);
       this.getPerson().setDOB(dob);

       if(image != null){//set picture only if 1 was uploaded.
	       this.getPerson().setPicture(image);
       }
       if(assignedClass != null){// a classroom was selected from the combo box in the edit form.
	       
       assignedClass.enrollStudent(this);
       this.setClassRoom(assignedClass);
       assignedClass.getStudents().add(this);
       School.manager.persist(assignedClass);
       }
       
       School.manager.persist(this);
       
    }

}
