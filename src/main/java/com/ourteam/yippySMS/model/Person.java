/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Transient;

/**
 *
 * @author dantheta
 */
@Entity
public class Person extends AbstractModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 25)
    private String fName;
    @Column(length = 25)
    private String lName;
    @Column(length = 25)
    private String mName;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dOB;
    @ManyToOne
    private School school;
    @OneToMany(mappedBy = "person")
    private List<Phone_Details> phoneDetails;
    @Column(length = 25)
    private String religion;
    @Lob
    @Column(length = 17000000)
    private byte[] picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Phone_Details> getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(List<Phone_Details> phoneDetails) {
	    List<Phone_Details> oldPhoneDetails = this.phoneDetails;

        this.phoneDetails = phoneDetails;
	firePropertyChange("PhoneDetails", oldPhoneDetails, phoneDetails);
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
	    String oldReligion = this.religion;

        this.religion = religion;
	firePropertyChange("Religion", oldReligion,religion);
    }

    public Date getDOB() {
        return dOB;
    }

    public void setDOB(Date dOB) {
	    Date oldDOB = this.dOB;
        this.dOB = dOB;
	firePropertyChange("DOB", oldDOB, dOB);
    }

    public String getFName() {
        return fName;
    }

    public void setfName(String fName) {
	    String oldFName = this.fName;

        this.fName = fName;
	firePropertyChange("FName", oldFName, fName);
    }

    public String getLName() {
        return lName;
    }

    public void setlName(String lName) {
	    String oldLName = this.lName;

        this.lName = lName;
	firePropertyChange("LName", oldLName, lName);
    }

    public String getMName() {
        return mName;
    }

    public void setmName(String mName) {
	    String oldMName = this.mName;
        this.mName = mName;
	firePropertyChange("MName", oldMName, mName);
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
	    Gender oldGender = this.gender;
        this.gender = gender;
	firePropertyChange("Gender", oldGender, gender);
    }

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}



    

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
	    School oldSchool = this.school;

        this.school = school;
	firePropertyChange("School", oldSchool, school);
    }

    public enum Gender {

        MALE, FEMALE; 
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String middleName = mName.equals("") ? "": mName + " ";
        return fName + " " + middleName + lName;
    }
}
