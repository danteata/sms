package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Student;
import com.ourteam.yippySMS.model.Subject;
import com.ourteam.yippySMS.model.Teacher;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author dantheta 
 */
public class DefaultEnrollmentController extends AbstractController implements IEnrollmentController {

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

	public void changeStudentEnrollment(String newClassEnrollment) {
		setModelProperty(STUDENT_ENROLLMENT_PROPERTY, newClassEnrollment);
	}

	public void changeTeacherAssignedClasses(String newClass) {
		setModelProperty(TEACHER_CLASSROOMS_PROPERTY, newClass);

	}

	public void changeTeacherAssignedSubject(String newSubject) {
		setModelProperty(TEACHER_SUBJECT_PROPERTY, newSubject);
	}



	
	public boolean handleAssignStudent(Student student, ClassRoom assignedClass) {

		return assignedClass.enrollStudent(student) != null;// returns true if the student is rightfully assignned.
	}

	/*
	 * Assigns a student to a classroom
	 * @params assignedClass the class the student is to be assigned
	 * @return true if the student is successfully assigned.
	 */
	public boolean handleAssignStudent(ClassRoom assignedClass) {
		Student student = (Student) getModel(Student.class);
                School.manager.getTransaction().begin();
		try{
		 assignedClass.enrollStudent(student);// returns true if the student is rightfully assignned.
                School.manager.getTransaction().commit();
		return true; //if transaction is commited successfully
		}catch(Exception e){
			
			e.printStackTrace();
			School.manager.getTransaction().rollback(); //undo all the activities if something goes wrong
			return false;
		}
	}

	/*
	 * Assigns a teacher to various classes and subjects
	 * @params classRooms the list of classes the teacher teaches
	 * @params subjects the list of subjects the teacher teaches
	 * @return true if the teacher is successfully assigned.
	 */
	public boolean handleAssignTeacher(List<Object> classRooms, List<Object> subjects) {
		try {
			School.manager.getTransaction().begin(); // starts a new transaction.
			Teacher teacher = (Teacher) getModel(Teacher.class);

			//loops through all the classrooms and delegates classroom addition to teacher model
			for (Object cr : classRooms) {
				teacher.addClassRoom((ClassRoom) cr); //adding classroom to teacher's list of assigned classes and teacher to classrooms list of teachers	
				School.manager.persist(cr); // updates classrooms list of teachers
				School.manager.persist(teacher); // refreshes teacher object to contain new classroom
			}

			//loops through all the subjects and delegates subject assignment to teacher model.
			for (Object subj : subjects) { //loops through all the subjects selected and updates teacher's list of assigned subjects. 
				teacher.addSubject((Subject) subj); // adds the subject to the teacher's subjects whiles adding teacher to subjects list of teachers.
				School.manager.persist(subj); // updates subjects list of teachers to contain current teacher.
				School.manager.persist(teacher); // refreshes teacher object to contain new subject.

			}
			School.manager.getTransaction().commit(); //commits all the transactions after successful assignment
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			School.manager.getTransaction().rollback(); //undo all the activities if something goes wrong
			return false;
		} finally { // close entity tools
//                    em.close();
			//                  emf.close();
		}
//		return false;
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
}
