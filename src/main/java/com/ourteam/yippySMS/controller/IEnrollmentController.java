/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Student;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author dantheta
 */
public interface IEnrollmentController {

	/*
	 * Handle assignment of student to class
	 */
	public boolean handleAssignStudent(ClassRoom assignedClass);

	
	/*
	 * Handles assignment of teachers to classes and subjects
	 */
	public boolean handleAssignTeacher(List<Object> classRooms, List<Object> subjects);
	
	/*
	 * Populates the students' table with list of student
	 * @params studentTable the jtable to be populated
	 * @params students the list of students used to populate table
	 */
	public void setStudentsTable(JTable studentTable, List<Student> students);
}
