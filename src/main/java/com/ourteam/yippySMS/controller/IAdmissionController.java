/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.Staff.Status;
import java.util.Date;

/**
 *
 * @author dantheta
 */
public interface IAdmissionController {
	
	/*
	 * Handles the admission of a new student into the school
	 */
	public boolean handleAddStudent(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Date dob, ClassRoom assignedClass, byte[] image); 

	
	/*
	 * Handles the admission of a new teacher into the school.
	 */
	public boolean handleAddTeacher(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption, Status status, Date dob, byte[] image);

	
	
}
