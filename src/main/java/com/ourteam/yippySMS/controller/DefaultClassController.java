/*
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassLevel;
import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Student;
import com.ourteam.yippySMS.model.Subject;
import com.ourteam.yippySMS.model.Teacher;
import java.awt.Font;
import java.util.List;

/**
 *
 * @author dantheta 
 */
public class DefaultClassController extends AbstractController implements IClassController{

    //  
    
   /**
    *Properties this controller expects to deal with in one or more registered model
    */
    public static final String STUDENT_CLASSROOM_PROPERTY = "ClassRoom"; 
    public static final String STUDENT_ENROLLMENT_PROPERTY = "Enrollment";
    public static final String TEACHER_CLASSROOMS_PROPERTY = "ClassRooms";
    public static final String TEACHER_SUBJECT_PROPERTY = "Subjects";
    public static final String SCHOOL_CLASS_LEVEL_PROPERTY = "ClassLevels";
    
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
         * delegates class level creation process to the School.
         * @params levelName the name of the level to be created.
         */
        public boolean handleCreateClassLevel(String levelName){
            
             
                    School school = School.getUniqueInstance();
                  return  school.createClassLevel(levelName);
                   
        }
        
        /*
         * delegates the class creation process to the selected classLevel.
         * @params classLevel the selected classlevel.
         * @params className the name of the new class room to be created.
         * @params capacity the capacity of the new class as specified by academic admin.
         * @return true if the process is successful
         */
        public boolean handleCreateClassRoom(ClassLevel classLevel, String className, int capacity){
             
                     return classLevel.createClassRoom(className, capacity);
        }  
 
    
}
