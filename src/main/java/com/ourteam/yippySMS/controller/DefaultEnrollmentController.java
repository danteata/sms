/*
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Student;
import java.awt.Font;

/**
 *
 * @author dantheta 
 */
public class DefaultEnrollmentController extends AbstractController
{

    //  Properties this controller expects to be stored in one or more registered models
    
    /**
     * The document's name
     */
    public static final String STUDENT_FIRST_NAME_PROPERTY = "FirstName";
    public static final String STUDENT_LAST_NAME_PROPERTY = "LastName";
    public static final String STUDENT_CLASSROOM_PROPERTY = "ClassRoom"; 
    public static final String STUDENT_ENROLLMENT_PROPERTY = "Enrollment";
    public static final String TEACHER_CLASSROOMS_PROPERTY = "ClassRooms";
    public static final String TEACHER_SUBJECT_PROPERTY = "Subjects";
    
    /**
     * 
     * Change the classRoom in the model
     * @param newName The new document name
     */
    public void changeStudentClassRoom(String newClassRoom) {
        setModelProperty(STUDENT_CLASSROOM_PROPERTY, newClassRoom);                                 
    }

    public void changeStudentEnrollment(String newClassEnrollment){
	    setModelProperty(STUDENT_ENROLLMENT_PROPERTY, newClassEnrollment);
    }

    public void changeTeacherAssignedClasses(String newClass){
	    setModelProperty(TEACHER_CLASSROOMS_PROPERTY, newClass);
   
    }

    public void changeTeacherAssignedSubject(String newSubject){
	    setModelProperty(TEACHER_SUBJECT_PROPERTY, newSubject);
    }
    /*
     * Change the Last name of a student
     */
    public void changeStudentLastName(String newFName) {
        setModelProperty(STUDENT_LAST_NAME_PROPERTY, newFName);                                 
    }
    
 
    
	public boolean handleAssignStudent(Student student, ClassRoom assignedClass) {
		
		return assignedClass.enrollStudent(student) != null;// returns true if the student is rightfully assignned.
	}
	public boolean handleAssignStudent(ClassRoom assignedClass) {
		Student student = (Student) getModel(Student.class);
		
		return assignedClass.enrollStudent(student) != null;// returns true if the student is rightfully assignned.
	}

	public boolean handleAssignTeacher(){
		return true;
	}
 
    
}