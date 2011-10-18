/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author dantheta
 */
@Entity
public class ClassEnrollment implements Serializable {
//    @ManyToOne
//    private ClassRoom classRoom;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date enrollmentDate;
    @OneToOne(mappedBy="enrollment") 
    private Student student;
    @OneToOne
    private ClassRoom classRoom;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public ClassRoom getClassRoom() {
//        return classRoom;
//    }

//    public void setClassRoom(ClassRoom classRoom) {
//        this.classRoom = classRoom;
//    }



    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
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
        if (!(object instanceof ClassEnrollment)) {
            return false;
        }
        ClassEnrollment other = (ClassEnrollment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "business.ClassEnrollment[ id=" + id + " ]";
    }

}
