/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 *
 * @author dantheta
 */
@Entity
public class ClassLevel extends AbstractModel implements Serializable {

    private static final long serialVersionUID = 1L;
//    @ManyToMany
    @ManyToMany(mappedBy = "classLevels")
    private List<Subject> subjects;
    @OneToMany(mappedBy = "classLevel")
    private List<ClassRoom> classRooms;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String levelName;
    @ManyToOne
    private School school;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
	    Long oldId = this.id;
        this.id = id;
	firePropertyChange("Id", oldId, id);
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
	    String oldLevelName = this.levelName;
        this.levelName = levelName;
	firePropertyChange("LevelName", oldLevelName, levelName);
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
	    School oldSchool = this.school;
        this.school = school;
	firePropertyChange("School", oldSchool, school);
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(List<ClassRoom> classRooms) {
	    List<ClassRoom> oldClassRooms = this.classRooms;
        this.classRooms = classRooms;
	firePropertyChange("ClassRooms", oldClassRooms, classRooms);
    }

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		
		firePropertyChange("subjects", this.subjects, this.subjects = subjects);
	}

	public void addSubject(Subject subject){
		List<Subject> oldSubjects = this.subjects;

		if(!this.subjects.contains(subject)){// checking to avoid duplicate entries
			this.subjects.add(subject);
		}if(!subject.getLevels().contains(this)){
			List<ClassLevel> oldClassLevels = subject.getLevels();
			subject.getLevels().add(this);
			subject.firePropertyChange("ClassLevels", oldClassLevels, subject.getLevels()); //notifies listeners of change in it's classlevel list.
		}
		this.subjects.add(subject);
		firePropertyChange("Subjects", oldSubjects, this.subjects);
	}

    

   // public List<SubjectLevel> getSubjectLevels() {
   //     return subjectLevels;
   // }

  //  public void setSubjectLevels(List<SubjectLevel> subjectLevels) {
   //     this.subjectLevels = subjectLevels;
 //   }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassLevel)) {
            return false;
        }
        ClassLevel other = (ClassLevel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getLevelName();
    }
    
    
    public boolean createClassRoom(String className, int capacity){
         try {
                    
                    School.manager.getTransaction().begin();

                    ClassRoom subClass = new ClassRoom();
                    subClass.setName(className);
                    subClass.setCapacity(capacity);
                    subClass.setClassLevel(this);

                    School.manager.persist(subClass);
                    School.manager.persist(this); //update classLevel to include new class in its list of classes.
                    School.manager.persist(school);

                    School.manager.getTransaction().commit();

                    System.out.println("class level is: " + this.getLevelName());
                    System.out.println("class room is: " + subClass.getName());
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    School.manager.getTransaction().rollback();
                    return false;
                } finally { // close entity tools
                    //  em.close();
                    // emf.close();
                }
    }
}
