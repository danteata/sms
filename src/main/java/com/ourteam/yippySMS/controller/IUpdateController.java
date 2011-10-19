/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.Student;
import com.ourteam.yippySMS.model.Teacher;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author dantheta
 */
public interface IUpdateController {

	
	/*
	 * Handles students information update process
	 */
	public boolean handleUpdateStudent(Student student, String fName, String mName,
		String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image);

	/*
	 * Handles teachers' information update process
	 */
	public boolean handleUpdateTeacher(String fName, String mName,
		String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image);
		
	/*
	 * Sets up the table that displays list of students
	 * @param studentsTable the table that contains the list of students
	 * @param students the list of students to be displayed.
	 */
      public void setStudentsTable(JTable studentsTable, List<Student> students);	

      /*
       * Sets up the table that displays list of teachers
       * @param teacherTable the table to contain the list of teachers
       * @param teachers the list of teachers to be displayed.
       */
	public void setTeachersTable(JTable teacherTable, List<Teacher> teachers);
	
}
