/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.model;

import com.ourteam.yippySMS.model.Person.Gender;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
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

    public boolean update(String fName, String mName, String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {
       School.manager.getTransaction().begin();
       try{
        this.getPerson().setfName(fName);
       this.getPerson().setmName(mName);
       this.getPerson().setlName(lName);
       this.getPerson().setReligion(religion);
       this.getPerson().setGender(gender);
       this.getPerson().setDOB(dob);
       assignedClass.enrollStudent(this);
       School.manager.getTransaction().begin();//transaction ended in enrollStudent method and so has to be restarted.
       this.setClassRoom(assignedClass);
       assignedClass.getStudents().add(this);
       this.getPerson().setPicture(image);
       
       School.manager.persist(this);
       School.manager.persist(assignedClass);
       
       School.manager.getTransaction().commit();
       return true;
       }catch(Exception e){
           e.printStackTrace();
           School.manager.getTransaction().rollback();
           return false;
       }
    }

}
