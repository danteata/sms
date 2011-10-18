/*
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.Phone_Details;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Staff.Status;
import com.ourteam.yippySMS.model.Student;
import java.awt.Font;
import java.util.Date;

/**
 *
 * @author dantheta 
 */
public class DefaultUpdateController extends AbstractController {

    //  Properties this controller expects to be stored in one or more registered models
    public static final String STUDENT_FIRST_NAME_PROPERTY = "FName";
    public static final String STUDENT_MNAME_PROPERTY = "MName";
    public static final String STUDENT_LAST_NAME_PROPERTY = "LName";
    public static final String STUDENT_CLASSROOM_PROPERTY = "ClassRoom";
    public static final String STUDENT_WIDTH_PROPERTY = "Width";
    public static final String STUDENT_PICTURE_PROPERTY = "Picture";
    public static final String TEACHER_STATUS_PROPERTY = "Status";
    public static final String TEACHER_DOB_PROPERTY = "DOB";
    public static final String STUDENT_DOB_PROPERTY = "DOB";
    public static final String GENDER_PROPERTY = "Gender";
    public static final String PHONE_DETAILS_PROPERTY = "Phone_Details";
    private static final String STUDENT_PERSON_PROPERTY = "Person";

    /**
     * Change the firstName name in the model
     * @param newName The new document name
     */
    public void changeStudentFirstName(String newFName) {
        setModelProperty(STUDENT_FIRST_NAME_PROPERTY, newFName);
    }

    public void changeStudentLastName(String newLName) {
        setModelProperty(STUDENT_LAST_NAME_PROPERTY, newLName);
    }

    public void changeStudentMiddleName(String newMName) {
        setModelProperty(STUDENT_LAST_NAME_PROPERTY, newMName);
    }

    public void changeStudentDOB(Date dob) {
        setModelProperty(STUDENT_DOB_PROPERTY, dob);
    }

    public void changeTeacherDOB(Date dob) {
        setModelProperty(STUDENT_DOB_PROPERTY, dob);
    }

    public void changeStudentClassroom(ClassRoom newClassRoom) {
        setModelProperty(STUDENT_CLASSROOM_PROPERTY, newClassRoom);
    }

    public void changeStudentPicture(byte[] picture) {
        setModelProperty(STUDENT_PICTURE_PROPERTY, picture);
    }

    public void changeTeacherStatus(Status status) {
        setModelProperty(TEACHER_STATUS_PROPERTY, status);
    }

    public void changeGenderProperty(Gender gender) {
        setModelProperty(GENDER_PROPERTY, gender);
    }

    public void changePhoneDetails(Phone_Details phoneDetails) {
        setModelProperty(PHONE_DETAILS_PROPERTY, phoneDetails);
    }

    public void changeStudentPerson(Person person) {
        setModelProperty(STUDENT_PERSON_PROPERTY, person);
    }

    /*
     * delegates the student update process to the student model.
     */
    public boolean handleUpdateStudent(Student student, String fName, String mName,
            String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {

        return student.update(fName, mName, lName, religion, contactNo, gender, dob, assignedClass, image);
    }
}
