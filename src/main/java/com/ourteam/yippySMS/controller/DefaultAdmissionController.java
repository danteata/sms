/*
 * DefaultAdmissionController.java
 *
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Staff.Status;
import com.ourteam.yippySMS.model.Student;
import java.util.Date;

/**
 * This controller implements the required methods and provides the properties
 * necessary to work with the School admission views. Each of
 * methods in this class can be called upon by the views to update to state of the
 * registered models.
 *
 * @author dantheta
 */
public class DefaultAdmissionController extends AbstractController implements IAdmissionController {

	//  Properties this controller expects to be stored in one or more registered models
	public static final String STUDENT_FNAME_PROPERTY = "FName";
	public static final String STUDENT_MNAME_PROPERTY = "MName";
	public static final String STUDENT_LNAME_PROPERTY = "LName";
	public static final String STUDENT_DOB_PROPERTY = "DOB";
	public static final String STUDENT_PERSON_PROPERTY = "Person";

	public void changeStudentFName(String newFName) {
		setModelProperty(STUDENT_FNAME_PROPERTY, newFName);
	}

	public void changeStudentPerson(Person person){
		setModelProperty(STUDENT_PERSON_PROPERTY, person);
	}

	public void changeStudentMName(String newMName) {
		setModelProperty(STUDENT_MNAME_PROPERTY, newMName);
	}

	public void changeStudentLName(String newLName) {
		setModelProperty(STUDENT_MNAME_PROPERTY, newLName);
	}

	public void changeStudentDOB(Date newDOB) {
		setModelProperty(STUDENT_DOB_PROPERTY, newDOB);
	}


	public boolean handleAddStudent(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Date dob, ClassRoom assignedClass, byte[] image) {
		School school = School.getUniqueInstance();
		
		return school.AddNewStudent(fName, mName, lName, religion, contactNo, genderOption, dob, assignedClass, image); 
	}

	public boolean handleAddTeacher(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Status status, Date dob, byte[] image) {
		School school = School.getUniqueInstance();
		
		return school.AddNewStaff(fName, mName, lName, religion, contactNo, genderOption, status, dob, image);
	}


}
