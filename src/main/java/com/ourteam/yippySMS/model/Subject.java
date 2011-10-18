/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

import java.io.Serializable;
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
public class Subject extends AbstractModel implements Serializable {

	@ManyToMany
	private List<ClassLevel> classLevels;
	@ManyToMany(mappedBy = "subjects")
	private List<Teacher> teachers;
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToOne
	private School School;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return School;
	}

	public void setSchool(School School) {
		this.School = School;
	}

	public List<ClassLevel> getLevels() {
		return classLevels;
	}

	public void setLevels(List<ClassLevel> levels) {
		this.classLevels = levels;
	}

	public void addClassLevel(ClassLevel level) {
		if (!this.classLevels.contains(level)) {
			this.classLevels.add(level);
		}
		if (!level.getSubjects().contains(this)) {
			level.getSubjects().add(this);
		}
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void addTeacher(Teacher teacher) {
		if (!this.teachers.contains(teacher)) {
			this.teachers.add(teacher);
		}
		if (!teacher.getSubjects().contains(this)) {
			teacher.getSubjects().add(this);
		}
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
		if (!(object instanceof Subject)) {
			return false;
		}
		Subject other = (Subject) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}
