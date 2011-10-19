/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

import com.ourteam.yippySMS.model.Person.Gender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author dantheta
 */
@Entity
public class Teacher extends AbstractModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Staff staff;
	@OneToOne
	private Admission admission;
//	@ManyToMany
//	private List<Subject> preferredSubjects = new ArrayList<Subject>();
	@ManyToMany
	private List<Subject> subjects = new ArrayList<Subject>();
	@ManyToOne
	private School school;
	@ManyToMany
	private List<ClassRoom> classRooms = new ArrayList<ClassRoom>();
	@OneToOne
	private Person person;

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
		Person oldPerson = this.person;
		this.person = person;
		firePropertyChange("Person", oldPerson, person);
	}

//    public List<ClassRoom> getAssignedClass() {
//        return classLevels;
//    }
//    public void setAssignedClass(List<ClassRoom> classLevels) {
//        this.classLevels = classLevels;
//    }
	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}

	public void addClassRoom(ClassRoom classRoom) {
		if (!this.classRooms.contains(classRoom)) {
			this.classRooms.add(classRoom);
		}
		if (!classRoom.getTeachers().contains(this)) {
			classRoom.getTeachers().add(this);
		}
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		Admission oldAdmission = this.admission;
		this.admission = admission;
		firePropertyChange("Admissoin", oldAdmission, admission);
	}

//	public List<Subject> getPreferredSubjects() {
//		return preferredSubjects;
//	}
//
//	public void setPreferredSubjects(List<Subject> preferredSubjects) {
//		List<Subject> oldPreferedSubjects = this.preferredSubjects;
//		this.preferredSubjects = preferredSubjects;
//		firePropertyChange("PreferredSubjects", oldPreferedSubjects, preferredSubjects);
//	}
//
//	public void addPreferredSubjects(Subject subject) {
//		this.preferredSubjects.add(subject);
//	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
		firePropertyChange("subjects", this.subjects, this.subjects = subjects);
	}

	/*
	 * Adds a subject to teacher's list of subjects assigned and teacher to subject's list of teachers
	 * @param subject the subject the teacher is to be assigned to.
	 */
	public void addSubject(Subject subject) {
		if (!this.subjects.contains(subject)) {
			this.subjects.add(subject);
		}
		if (!subject.getTeachers().contains(this)) {
			subject.getTeachers().add(this);
		}
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		Staff oldStaff = this.staff;
		this.staff = staff;
		firePropertyChange("Staff", oldStaff, staff);
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
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
		if (!(object instanceof Teacher)) {
			return false;
		}
		Teacher other = (Teacher) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getStaff().getPerson().toString();
	}
	
    public void update(String fName, String mName, String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {
        this.getPerson().setfName(fName);
       this.getPerson().setmName(mName);
       this.getPerson().setlName(lName);
       this.getPerson().setReligion(religion);
       this.getPerson().setGender(gender);
       this.getPerson().setDOB(dob);
       this.getPerson().setPicture(image);
       
       School.manager.persist(this);
       
    }
}
