/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import java.util.Date;
import com.ourteam.yippySMS.view.TeacherUpdateForm;
import com.ourteam.yippySMS.model.*;
import com.ourteam.yippySMS.model.Person.Gender;

/**
 *
 * @author dantheta
 */
public interface ITeacherAdmissionController {

	public void handleAddTeacher(String fName, String mName, String lName, String religion, String contactNo, Gender genderOption,Date dob, ClassRoom assignedClass, Subject prefSubject);

	public School getSchool(); 

	public TeacherUpdateForm getTeacherFormView(); 
	public void displayView();
}
