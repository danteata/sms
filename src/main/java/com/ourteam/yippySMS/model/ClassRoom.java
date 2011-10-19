/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

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

/**
 *
 * @author dantheta
 */
@Entity
public class ClassRoom extends AbstractModel implements Serializable {

	@ManyToMany(mappedBy = "classRooms")
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "classRoom")
	private List<Student> students = new ArrayList<Student>();
	private int capacity;
	@ManyToOne
	private ClassLevel classLevel;

    @OneToMany(mappedBy = "classRoom")
    private List<ClassEnrollment> classEnrollments = new ArrayList<ClassEnrollment>();
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		int oldCapacity = this.capacity;
		this.capacity = capacity;
		firePropertyChange("Capacity", oldCapacity, capacity);
	}

//    public List<ClassEnrollment> getClassEnrollments() {
//        return classEnrollments;
//    }
//
//    public void setClassEnrollments(List<ClassEnrollment> classEnrollments) {
//	    List<ClassEnrollment> oldClassEnrollments = this.classEnrollments;
//        this.classEnrollments = classEnrollments;
//	firePropertyChange("ClassEnrollements", oldClassEnrollments, classEnrollments);
//    }
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		List<Student> oldStudents = this.students;
		this.students = students;
		firePropertyChange("Students", oldStudents, students);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void addTeacher(Teacher teacher) {
		List<Teacher> oldTeacherList = this.teachers;
		if(!this.teachers.contains(teacher)){
			this.teachers.add(teacher);
		}if(!teacher.getClassRooms().contains(this)){
			List<ClassRoom> oldClassRooms = teacher.getClassRooms();
			teacher.getClassRooms().add(this);
			teacher.firePropertyChange("ClassRoom", oldClassRooms, teacher.getClassRooms());
		}
		List<Teacher> newTeacherList = this.teachers;
		firePropertyChange("Teachers", oldTeacherList, newTeacherList);
	}

	public ClassLevel getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(ClassLevel classLevel) {
		ClassLevel oldClassLevel = this.classLevel;
		this.classLevel = classLevel;
		firePropertyChange("ClassLevel", oldClassLevel, classLevel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String oldName = this.name;
		this.name = name;
		firePropertyChange("Name", oldName, name);
	}

	public ClassEnrollment enrollStudent(Student student) {
//            if(!School.manager.getTransaction().isActive())
//                School.manager.getTransaction().begin();
		this.students.add(student);
		ClassEnrollment enrollment = new ClassEnrollment();
      //        enrollment.setClassRoom(this);
		enrollment.setEnrollmentDate(new Date());
		enrollment.setStudent(student);
		enrollment.setClassRoom(this);
                student.setClassRoom(this);
                student.setEnrollment(enrollment);
                
                School.manager.persist(enrollment);
                School.manager.persist(this);
                School.manager.persist(student);
                //School.manager.getTransaction().commit();
		return enrollment;

	}

	public List<ClassEnrollment> getClassEnrollments() {
		return classEnrollments;
	}

	public void setClassEnrollments(List<ClassEnrollment> classEnrollments) {
		this.classEnrollments = classEnrollments;
	}


	public void addClassEnrollment(ClassEnrollment enrollment){
		this.classEnrollments.add(enrollment); 
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
		if (!(object instanceof ClassRoom)) {
			return false;
		}
		ClassRoom other = (ClassRoom) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getClassLevel() + " " + this.getName();
	}
}
