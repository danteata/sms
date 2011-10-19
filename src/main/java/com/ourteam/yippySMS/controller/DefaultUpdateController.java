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
import com.ourteam.yippySMS.model.Teacher;
import com.ourteam.yippySMS.view.StudentUpdateForm;
import com.ourteam.yippySMS.view.TeacherUpdateForm;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author dantheta 
 */
public class DefaultUpdateController extends AbstractController implements IUpdateController {

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
	 * delegates the teacher update process to the teacher model.
	 */
	public boolean handleUpdateStudent(Student student, String fName, String mName,
		String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {
		School.manager.getTransaction().begin();
		try {
			student.update(fName, mName, lName, religion, contactNo, gender, dob, assignedClass, image);
			School.manager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			School.manager.getTransaction().rollback();
			return false;
		}
	}

	/*
	 * delegates the teacher's update process to the teacher model.
	 */
	public boolean handleUpdateTeacher(String fName, String mName,
		String lName, String religion, String contactNo, Gender gender, Date dob, ClassRoom assignedClass, byte[] image) {
		Teacher teacher = (Teacher) getModel(Student.class);// retrieves the teacher model registered with controller.

		School.manager.getTransaction().begin();
		try {
			teacher.update(fName, mName, lName, religion, contactNo, gender, dob, assignedClass, image);
			School.manager.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			School.manager.getTransaction().rollback();
			return false;
		}
	}

	public void displayStudentUpdateView() {

	JFrame frame1 = new JFrame();
	Student student =(Student) getModel(Student.class);
	StudentUpdateForm studentForm = new StudentUpdateForm(frame1, "Skuul Management System", this, student);
//	addView(teacherForm); 
	studentForm.display();
	
	}

	public void displayTeacherUpdateView() {
	JFrame frame1 = new JFrame();
	Teacher teacher =(Teacher) getModel(Teacher.class);
	TeacherUpdateForm teacherForm = new TeacherUpdateForm(frame1, "Skuul Management System", this, teacher);
//	addView(teacherForm); 
	teacherForm.display();//makes the form visible for editing
	}

	/*
	 * Populates the students' table with list of student
	 * @params studentTable the jtable to be populated
	 * @params students the list of students used to populate table
	 */
	public void setStudentsTable(JTable studentTable, List<Student> students){

            int li_row = 0;
            if (!students.isEmpty()) {
                for (Student s : students) {
                    studentTable.setValueAt(li_row+1, li_row, 0);
                    studentTable.setValueAt(s.getPerson().getFName(), li_row, 1);
                    studentTable.setValueAt(s.getPerson().getMName(), li_row, 2);
                    studentTable.setValueAt(s.getPerson().getLName(), li_row, 3);
                    li_row++;
                }
            }
	}

	public void setTeachersTable(JTable teacherTable, List<Teacher> teachers) {
		
            int li_row = 0;
            if (!teachers.isEmpty()) {
                for (Teacher t : teachers) {
                    teacherTable.setValueAt(li_row+1, li_row, 0);
                    teacherTable.setValueAt(t.getPerson().getFName(), li_row, 1);
                    teacherTable.setValueAt(t.getPerson().getMName(), li_row, 2);
                    teacherTable.setValueAt(t.getPerson().getLName(), li_row, 3);
                    li_row++;
                }
            }
	}

}
