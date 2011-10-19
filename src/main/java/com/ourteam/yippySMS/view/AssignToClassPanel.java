/*
 *
 */
package com.ourteam.yippySMS.view;

import com.ourteam.yippySMS.controller.AbstractController;
import com.ourteam.yippySMS.controller.DefaultAdmissionController;
import com.ourteam.yippySMS.controller.DefaultEnrollmentController;
import com.ourteam.yippySMS.controller.DefaultUpdateController;
import com.ourteam.yippySMS.helpers.AutoCompleteDocument;
import com.ourteam.yippySMS.helpers.ComboPopulator;
import com.ourteam.yippySMS.helpers.ManagePicture;
import com.ourteam.yippySMS.helpers.ModelCompletionService;
import com.ourteam.yippySMS.model.ClassLevel;
import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Student;
import com.ourteam.yippySMS.model.Subject;
import com.ourteam.yippySMS.model.Teacher;
import com.ourteam.yippySMS.model.TeacherClassAssignment;
import com.ourteam.yippySMS.model.TeacherSubjectAssignment;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import org.japura.gui.CheckComboBox;

/**
 * This is a custom view panel that respond to changes
 * in the model state.
 *
 * @author dantheta
 */
public class AssignToClassPanel extends AbstractViewPanel {

	//  The controller used by this view
	private DefaultEnrollmentController controller;

	//  A local copy of the current Font which can be passed to the 
	//  constructor of JFontChooserDialog.
	/**
	 * Creates new form StudentAdmissionPanel
	 * @param controller An object implementing the controller interface that
	 *        this view can use to process GUI actions
	 */
	public AssignToClassPanel(DefaultEnrollmentController controller) {

		this.controller = controller;

		initComponents();
		localInitialization();

	}

	//setting up comboboxes for display
	private void localInitialization() {
		ComboPopulator.populateComboBox(teacherCombobox, School.getUniqueInstance().getTeachers()); //teacher combobox at assignn teacher to class.
		ComboPopulator.populateComboBox(sClassLevelComboBox, School.getUniqueInstance().getClassLevels());// class level combobox at assign teacher to class.
		ComboPopulator.populateComboBox(tClassLevelComboBox, School.getUniqueInstance().getClassLevels()); // class level combobox at assign teacher to class.
		ComboPopulator.populateMultiSubjectsCombo(subjectCheckComboBox, School.getUniqueInstance().getSubjects());  // subjects list to be assigned to teacher.
	}

	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc=" Model Event Handling Code ">
	/**
	 * Called by the controller when it needs to pass along a property change
	 * from a model. Note that the method checks each GUI parameter to determine
	 * if the current value is already equal to the incoming value. If it is, 
	 * the method will not reset the value. This is done to prevent looping from
	 * occurring when a model property is reset.
	 * @param evt The property change event
	 */
	public void modelPropertyChange(final PropertyChangeEvent evt) {
//        if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_FNAME_PROPERTY)) {
//            
//            String newStringValue = evt.getNewValue().toString();
//            
//            if (!fNameLabel.getText().equals(newStringValue))// checks to see if there is truely a property change
//                fNameLabel.setText(newStringValue);
//            
//        }
//	else if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_MNAME_PROPERTY)) {
//            
//            String newStringValue = evt.getNewValue().toString();
//            
//            if (!fNameLabel.getText().equals(newStringValue))// checks to see if there is truely a property change
//                fNameLabel.setText(newStringValue);
//            
//        }
//	else if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_LNAME_PROPERTY)) {
//            
//            String newStringValue = evt.getNewValue().toString();
//            
//            if (!lNameLabel.getText().equals(newStringValue))// checks to see if there is truely a property change
//                lNameLabel.setText(newStringValue);
//            
//        }	
//	else if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_DOB_PROPERTY)) {
//            
//            String newStringValue = evt.getNewValue().toString();
//            
//            if (!DOBLabel.getText().equals(newStringValue))// checks to see if there is truely a property change
//                DOBLabel.setText(newStringValue);
//        }	
	}

	// </editor-fold>  
	/** This method is called from within the constructor to
	 * initialize the form.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        jSeparator2 = new javax.swing.JSeparator();
        assignTabbedPane = new javax.swing.JTabbedPane();
        assignTeacherPanel = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        classLevelLabel7 = new javax.swing.JLabel();
        classLevelLabel8 = new javax.swing.JLabel();
        subClassLabel = new javax.swing.JLabel();
        teacherCombobox = new javax.swing.JComboBox();
        teacherLabel = new javax.swing.JLabel();
        tSubClassCheckComboBox = new org.japura.gui.CheckComboBox();
        subjectCheckComboBox = new org.japura.gui.CheckComboBox();
        tClassLevelComboBox = new javax.swing.JComboBox();
        jPanel57 = new javax.swing.JPanel();
        assignTeacherBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        assignTeacherDisplayPanel = new javax.swing.JPanel();
        teacherDetailsDisplayPanel1 = new javax.swing.JPanel();
        fNameLabelTitle2 = new javax.swing.JLabel();
        tFNameLabel = new javax.swing.JLabel();
        mNameLabelTitle2 = new javax.swing.JLabel();
        tMNameLabel = new javax.swing.JLabel();
        lNameLabelTitle4 = new javax.swing.JLabel();
        tLNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dobLabelTitle = new javax.swing.JLabel();
        tDOBLabel = new javax.swing.JLabel();
        assignedClassTitleLabel = new javax.swing.JLabel();
        tAssignedSubjectsLabel = new javax.swing.JLabel();
        tAssignedClassesLabel = new javax.swing.JLabel();
        tStatusLabel = new javax.swing.JLabel();
        dobLabelTitle1 = new javax.swing.JLabel();
        teacherImageLabel = new javax.swing.JLabel();
        assignedClassTitleLabel3 = new javax.swing.JLabel();
        manageTeacherControl = new javax.swing.JPanel();
        deleteTeacherBtn = new javax.swing.JButton();
        editTeacherBtn = new javax.swing.JButton();
        assignStudentsPanel = new javax.swing.JPanel();
        assignStudentControlPanel = new javax.swing.JPanel();
        assignStudentSubControlPanel = new javax.swing.JPanel();
        classLevelLabel9 = new javax.swing.JLabel();
        teacherLabel1 = new javax.swing.JLabel();
        subClassComboBox = new javax.swing.JComboBox();
        subClassLabel1 = new javax.swing.JLabel();
        sClassLevelComboBox = new javax.swing.JComboBox();
        findStudentPanel = new javax.swing.JPanel();
        findStudentBtn = new javax.swing.JButton();
        List<Student> students = (List<Student>)School.getUniqueInstance().getStudents();
        ModelCompletionService nameService = new ModelCompletionService(students);
        studentSearchField = new javax.swing.JTextField();
        assignStudentActionPanel = new javax.swing.JPanel();
        assignStudentBtn = new javax.swing.JButton();
        assignStudentHeadLabel = new javax.swing.JLabel();
        singleStudentDisplayPanel = new javax.swing.JPanel();
        studentDetailsDisplayPanel = new javax.swing.JPanel();
        fNameLabelTitle3 = new javax.swing.JLabel();
        sFNameLabel = new javax.swing.JLabel();
        mNameLabelTitle3 = new javax.swing.JLabel();
        sMNameLabel = new javax.swing.JLabel();
        lNameLabelTitle5 = new javax.swing.JLabel();
        sLNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dobLabelTitle2 = new javax.swing.JLabel();
        sDOBLabel = new javax.swing.JLabel();
        assignedClassTitleLabel1 = new javax.swing.JLabel();
        sAssignedClassLabel = new javax.swing.JLabel();
        studentImageLabel = new javax.swing.JLabel();
        assignedClassTitleLabel2 = new javax.swing.JLabel();
        sGenderLabel = new javax.swing.JLabel();
        manageStudentControl = new javax.swing.JPanel();
        deleteStudent = new javax.swing.JButton();
        editStudent = new javax.swing.JButton();

        setBackground(new java.awt.Color(90, 191, 242));

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 204, 255))); // NOI18N

        classLevelLabel7.setText("Subject");

        classLevelLabel8.setText("Class Level");

        subClassLabel.setText("Class Name");

        teacherCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherComboboxItemStateChanged(evt);
            }
        });
        teacherCombobox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teacherComboboxKeyPressed(evt);
            }
        });

        teacherLabel.setText("Teacher");

        tSubClassCheckComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tSubClassCheckComboBoxPropertyChange(evt);
            }
        });

        tClassLevelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tClassLevelComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(teacherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(teacherCombobox, 0, 211, Short.MAX_VALUE))
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel56Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(classLevelLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(classLevelLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tClassLevelComboBox, 0, 211, Short.MAX_VALUE)
                                    .addComponent(subjectCheckComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(subClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(tSubClassCheckComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectCheckComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLevelLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLevelLabel8)
                    .addComponent(tClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subClassLabel)
                    .addComponent(tSubClassCheckComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        assignTeacherBtn.setText("Add Teacher");
        assignTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTeacherBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(assignTeacherBtn)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignTeacherBtn)
        );

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacherClass.png"))); // NOI18N

        assignTeacherDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        assignTeacherDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        assignTeacherDisplayPanel.setName("singleTeacherDisplay"); // NOI18N

        teacherDetailsDisplayPanel1.setBackground(new java.awt.Color(238, 236, 232));
        teacherDetailsDisplayPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher's Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 255))); // NOI18N
        teacherDetailsDisplayPanel1.setForeground(new java.awt.Color(51, 153, 255));

        fNameLabelTitle2.setText("First Name");

        tFNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mNameLabelTitle2.setText("Middle Name");

        tMNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lNameLabelTitle4.setText("Last Name");

        tLNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(185, 185, 203));
        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 17));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DETAILS");

        dobLabelTitle.setText("Date Of Birth");

        tDOBLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel.setText("Classes Assigned");

        tAssignedSubjectsLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tAssignedClassesLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tStatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dobLabelTitle1.setText("Status");

        teacherImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel3.setText("Classes Assigned");

        javax.swing.GroupLayout teacherDetailsDisplayPanel1Layout = new javax.swing.GroupLayout(teacherDetailsDisplayPanel1);
        teacherDetailsDisplayPanel1.setLayout(teacherDetailsDisplayPanel1Layout);
        teacherDetailsDisplayPanel1Layout.setHorizontalGroup(
            teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addComponent(assignedClassTitleLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(tAssignedClassesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dobLabelTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dobLabelTitle))
                            .addComponent(assignedClassTitleLabel))
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tStatusLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tDOBLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(teacherImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tAssignedSubjectsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                            .addComponent(lNameLabelTitle4)
                            .addGap(41, 41, 41)
                            .addComponent(tLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                            .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fNameLabelTitle2)
                                .addComponent(mNameLabelTitle2))
                            .addGap(32, 32, 32)
                            .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tMNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tFNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        teacherDetailsDisplayPanel1Layout.setVerticalGroup(
            teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLabelTitle2)
                            .addComponent(tFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mNameLabelTitle2)
                            .addComponent(tMNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNameLabelTitle4)
                            .addComponent(tLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobLabelTitle)
                            .addComponent(tDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobLabelTitle1)))
                    .addComponent(teacherImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tAssignedClassesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(assignedClassTitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(teacherDetailsDisplayPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addComponent(assignedClassTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDetailsDisplayPanel1Layout.createSequentialGroup()
                        .addComponent(tAssignedSubjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        manageTeacherControl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deleteTeacherBtn.setText("Delete");
        deleteTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeacherBtnActionPerformed(evt);
            }
        });

        editTeacherBtn.setText("Edit");
        editTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeacherBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageTeacherControlLayout = new javax.swing.GroupLayout(manageTeacherControl);
        manageTeacherControl.setLayout(manageTeacherControlLayout);
        manageTeacherControlLayout.setHorizontalGroup(
            manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageTeacherControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editTeacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(deleteTeacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        manageTeacherControlLayout.setVerticalGroup(
            manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeacherControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteTeacherBtn)
                    .addComponent(editTeacherBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout assignTeacherDisplayPanelLayout = new javax.swing.GroupLayout(assignTeacherDisplayPanel);
        assignTeacherDisplayPanel.setLayout(assignTeacherDisplayPanelLayout);
        assignTeacherDisplayPanelLayout.setHorizontalGroup(
            assignTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignTeacherDisplayPanelLayout.createSequentialGroup()
                .addGroup(assignTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignTeacherDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(teacherDetailsDisplayPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(assignTeacherDisplayPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(manageTeacherControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        assignTeacherDisplayPanelLayout.setVerticalGroup(
            assignTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignTeacherDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherDetailsDisplayPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageTeacherControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout assignTeacherPanelLayout = new javax.swing.GroupLayout(assignTeacherPanel);
        assignTeacherPanel.setLayout(assignTeacherPanelLayout);
        assignTeacherPanelLayout.setHorizontalGroup(
            assignTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(assignTeacherPanelLayout.createSequentialGroup()
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(assignTeacherDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        assignTeacherPanelLayout.setVerticalGroup(
            assignTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(assignTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignTeacherPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignTeacherPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(assignTeacherDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        assignTabbedPane.addTab("Assign Teacher", assignTeacherPanel);

        assignStudentControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        assignStudentSubControlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 204, 255))); // NOI18N

        classLevelLabel9.setText("Class Level");

        teacherLabel1.setText("Student");

        subClassComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subClassComboBoxItemStateChanged(evt);
            }
        });

        subClassLabel1.setText("Class Name");

        sClassLevelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sClassLevelComboBoxItemStateChanged(evt);
            }
        });
        sClassLevelComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sClassLevelComboBoxPropertyChange(evt);
            }
        });

        findStudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        findStudentBtn.setText("Find");
        findStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findStudentBtnActionPerformed(evt);
            }
        });

        Document autoDoc = new AutoCompleteDocument(nameService, studentSearchField);
        studentSearchField.setDocument(autoDoc);

        javax.swing.GroupLayout findStudentPanelLayout = new javax.swing.GroupLayout(findStudentPanel);
        findStudentPanel.setLayout(findStudentPanelLayout);
        findStudentPanelLayout.setHorizontalGroup(
            findStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
        );
        findStudentPanelLayout.setVerticalGroup(
            findStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findStudentPanelLayout.createSequentialGroup()
                .addGroup(findStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findStudentBtn)
                    .addComponent(studentSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout assignStudentSubControlPanelLayout = new javax.swing.GroupLayout(assignStudentSubControlPanel);
        assignStudentSubControlPanel.setLayout(assignStudentSubControlPanelLayout);
        assignStudentSubControlPanelLayout.setHorizontalGroup(
            assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentSubControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(assignStudentSubControlPanelLayout.createSequentialGroup()
                        .addGroup(assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classLevelLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subClassLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(findStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        assignStudentSubControlPanelLayout.setVerticalGroup(
            assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentSubControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLevelLabel9)
                    .addComponent(sClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(assignStudentSubControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subClassComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subClassLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        assignStudentActionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        assignStudentBtn.setText("Assign Student");
        assignStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignStudentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignStudentActionPanelLayout = new javax.swing.GroupLayout(assignStudentActionPanel);
        assignStudentActionPanel.setLayout(assignStudentActionPanelLayout);
        assignStudentActionPanelLayout.setHorizontalGroup(
            assignStudentActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentActionPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(assignStudentBtn)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        assignStudentActionPanelLayout.setVerticalGroup(
            assignStudentActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignStudentBtn)
        );

        javax.swing.GroupLayout assignStudentControlPanelLayout = new javax.swing.GroupLayout(assignStudentControlPanel);
        assignStudentControlPanel.setLayout(assignStudentControlPanelLayout);
        assignStudentControlPanelLayout.setHorizontalGroup(
            assignStudentControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignStudentControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignStudentSubControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignStudentActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        assignStudentControlPanelLayout.setVerticalGroup(
            assignStudentControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentControlPanelLayout.createSequentialGroup()
                .addComponent(assignStudentSubControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignStudentActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        assignStudentHeadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudentBanner.png"))); // NOI18N

        singleStudentDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        singleStudentDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        singleStudentDisplayPanel.setName("singleStudentDisplay"); // NOI18N

        studentDetailsDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        studentDetailsDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 255))); // NOI18N

        fNameLabelTitle3.setText("First Name");

        sFNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mNameLabelTitle3.setText("Middle Name");

        sMNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lNameLabelTitle5.setText("Last Name");

        sLNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(185, 185, 203));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 17));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DETAILS");

        dobLabelTitle2.setText("Date Of Birth");

        sDOBLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel1.setText("Class");

        sAssignedClassLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        studentImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel2.setText("Gender");

        sGenderLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout studentDetailsDisplayPanelLayout = new javax.swing.GroupLayout(studentDetailsDisplayPanel);
        studentDetailsDisplayPanel.setLayout(studentDetailsDisplayPanelLayout);
        studentDetailsDisplayPanelLayout.setHorizontalGroup(
            studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(assignedClassTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignedClassTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(dobLabelTitle2)
                    .addComponent(fNameLabelTitle3)
                    .addComponent(lNameLabelTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mNameLabelTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sGenderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sAssignedClassLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sDOBLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sFNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sLNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sMNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(studentImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        studentDetailsDisplayPanelLayout.setVerticalGroup(
            studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentDetailsDisplayPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                                .addComponent(sFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sMNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(fNameLabelTitle3)
                                .addGap(18, 18, 18)
                                .addComponent(mNameLabelTitle3)))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameLabelTitle5))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobLabelTitle2)
                            .addComponent(sDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignedClassTitleLabel1)
                            .addComponent(sAssignedClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignedClassTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(studentImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        manageStudentControl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        editStudent.setText("Edit");
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageStudentControlLayout = new javax.swing.GroupLayout(manageStudentControl);
        manageStudentControl.setLayout(manageStudentControlLayout);
        manageStudentControlLayout.setHorizontalGroup(
            manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStudentControlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(editStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(deleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        manageStudentControlLayout.setVerticalGroup(
            manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStudentControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStudent)
                    .addComponent(deleteStudent))
                .addContainerGap())
        );

        javax.swing.GroupLayout singleStudentDisplayPanelLayout = new javax.swing.GroupLayout(singleStudentDisplayPanel);
        singleStudentDisplayPanel.setLayout(singleStudentDisplayPanelLayout);
        singleStudentDisplayPanelLayout.setHorizontalGroup(
            singleStudentDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleStudentDisplayPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(studentDetailsDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleStudentDisplayPanelLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(manageStudentControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        singleStudentDisplayPanelLayout.setVerticalGroup(
            singleStudentDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleStudentDisplayPanelLayout.createSequentialGroup()
                .addComponent(studentDetailsDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageStudentControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout assignStudentsPanelLayout = new javax.swing.GroupLayout(assignStudentsPanel);
        assignStudentsPanel.setLayout(assignStudentsPanelLayout);
        assignStudentsPanelLayout.setHorizontalGroup(
            assignStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(assignStudentHeadLabel, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(assignStudentControlPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(singleStudentDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        assignStudentsPanelLayout.setVerticalGroup(
            assignStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignStudentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignStudentHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assignStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignStudentsPanelLayout.createSequentialGroup()
                        .addComponent(singleStudentDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(assignStudentsPanelLayout.createSequentialGroup()
                        .addComponent(assignStudentControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(157, 157, 157))))
        );

        assignTabbedPane.addTab("Assign Student", assignStudentsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(assignTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(assignTabbedPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void sClassLevelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sClassLevelComboBoxItemStateChanged
		ClassLevel cl = (ClassLevel) evt.getItem();
		

		subClassComboBox.removeAllItems(); //empty all items already in the sub class combo
		for (ClassRoom cr : cl.getClassRooms()) { //refill subclass combobox.
			subClassComboBox.addItem(cr);
		}
	}//GEN-LAST:event_sClassLevelComboBoxItemStateChanged

	private void sClassLevelComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sClassLevelComboBoxPropertyChange
	}//GEN-LAST:event_sClassLevelComboBoxPropertyChange

	private void assignStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignStudentBtnActionPerformed
		//Student teacher = school.createNewStudent(person); // create a new teacher from the person admitted.
		Student student = (Student) controller.getModel(Student.class); //gets the teacher model registered previously to the controller.
		ClassRoom assignedClass = (ClassRoom) subClassComboBox.getSelectedItem();

		//returns true if teacher is assigned.
		boolean assigned = controller.handleAssignStudent(student, assignedClass);

		if (assigned) {
			sAssignedClassLabel.setText(assignedClass.toString());
			JOptionPane.showMessageDialog(null, "Student Assigned Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

		} else {

			JOptionPane.showMessageDialog(null, "Unable to assign student", "Information", JOptionPane.INFORMATION_MESSAGE);
		}

	}//GEN-LAST:event_assignStudentBtnActionPerformed

	private void assignTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTeacherBtnActionPerformed
		List<Object> subjects = this.subjectCheckComboBox.getModel().getCheckeds();
		Teacher teacher = (Teacher) teacherCombobox.getSelectedItem();
		ClassLevel classLevel = (ClassLevel) this.tClassLevelComboBox.getSelectedItem();
		List<Object> classRooms = tSubClassCheckComboBox.getModel().getCheckeds();
		boolean assigned = controller.handleAssignTeacher(classRooms, subjects);
		
		if (assigned) {
			clearPrevDisplayView(); // clears previously assigned classes and subjects from display view
			setTeacherDisplayView(teacher); //update teacher's display view to show assigned classes and subjects
			JOptionPane.showMessageDialog(null, "Teacher assigned Successfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Unable to assign teacher ", "FAILURE MESSAGE", JOptionPane.WARNING_MESSAGE);

	}//GEN-LAST:event_assignTeacherBtnActionPerformed
	}
	private void teacherComboboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacherComboboxKeyPressed
//		ComboPopulator.populateComboBox(teacherCombobox, School.getUniqueInstance().getPersons());
	}//GEN-LAST:event_teacherComboboxKeyPressed

	private void teacherComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherComboboxItemStateChanged

		Teacher teacher = (Teacher) evt.getItem();
		// TODO: remove previous model of teacher class.
		controller.addModel(teacher);// adds the teacher model to the controllers registered models.
		School.manager.refresh(teacher); //sync with database content of teacher to update info on display
		clearPrevDisplayView();
		setTeacherDisplayView(teacher);

	}//GEN-LAST:event_teacherComboboxItemStateChanged
	/*
	 * clears previously loaded content from subjects and classes label
	 */

	private void clearPrevDisplayView() {
		this.tAssignedClassesLabel.setText("");
		this.tAssignedSubjectsLabel.setText("");
	}

	private void setStudentDisplayView(Student student) {
		this.sFNameLabel.setText(student.getPerson().getFName());
		this.sMNameLabel.setText(student.getPerson().getMName() == null ? "" : student.getPerson().getMName());
		this.sLNameLabel.setText(student.getPerson().getLName());
		this.sDOBLabel.setText(student.getPerson().getDOB() == null ? "" : student.getPerson().getDOB().toString());
		this.sAssignedClassLabel.setText(student.getClassRoom() == null ? "Not Assigned" : student.getClassRoom().toString());
		this.sGenderLabel.setText(student.getPerson().getGender().toString());

			ManagePicture.display(student.getPerson().getPicture(), studentImageLabel); //setting label's with teacher's picture 
//		 Icon defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
	    if(studentImageLabel.getIcon() == null){
		    studentImageLabel.setText("<html><p ><b>PHOTO <I>NOT</I></b><br><br>AVAILABLE</p></html>");
		    studentImageLabel.setForeground(Color.RED);
	    }
//		 sPictureLabel.setIcon(defaultIcon);
//		if (student.getPerson().getPicture() != null) {//set's teacher's picture only he has one.
//
//			ManagePicture.display(student.getPerson().getPicture(), studentImageLabel); //setting label's with teacher's picture 
//		} else {//set a default icon for students with no pictures
//			Icon defaultIcon = null;
//			if (student.getPerson().getGender() == Gender.MALE) {
//
//				defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
//			} else {
//				defaultIcon = new ImageIcon(getClass().getResource("/images/female_student_icon.png"));
//			}
////			sPictureLabel.setIcon(defaultIcon);
////			sPictureLabel.revalidate();
////                        sPictureLabel.repaint();
//		}

	}


	/*
	 * sets the display details of a selected teacher
	 * @params teacher the teacher whose information is to be displayed.
	 */
	private void setTeacherDisplayView(Teacher teacher) {
		this.tFNameLabel.setText(teacher.getStaff().getPerson().getFName());
		this.tMNameLabel.setText(teacher.getStaff().getPerson().getMName() == null ? "" : teacher.getStaff().getPerson().getMName());
		this.tLNameLabel.setText(teacher.getStaff().getPerson().getLName());
		this.tDOBLabel.setText(teacher.getStaff().getPerson().getDOB().toString());
		this.tStatusLabel.setText(teacher.getStaff().getStatus().toString());

                ManagePicture.display(teacher.getStaff().getPerson().getPicture(), teacherImageLabel);

	    if(teacherImageLabel.getIcon() == null){
		    teacherImageLabel.setText("<html><p ><b>PHOTO <I>NOT</I></b><br><br>AVAILABLE</p></html>");
		    teacherImageLabel.setForeground(Color.RED);
	    }
		//loops through all classes assigned to teacher and appends to label for display
		for (ClassRoom classRoom : teacher.getClassRooms()) {
			appendToLabel(this.tAssignedClassesLabel, classRoom);
		}

		//loops through teachers assigned subjects and appends them to subjects label for display
		for (Subject subject : teacher.getSubjects()) {
			appendToLabel(this.tAssignedSubjectsLabel, subject);
		}

	}

	private void appendToLabel(JLabel label, Object object) {
		String prevLabelText = (label.getText().equals("")) ? "" : label.getText() + ", ";
		label.setText(prevLabelText + object);

	}
private void tClassLevelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tClassLevelComboBoxItemStateChanged
	tSubClassCheckComboBox.setTextFor(CheckComboBox.CheckState.NONE, "* class room selected");
	tSubClassCheckComboBox.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple classrooms");
	tSubClassCheckComboBox.setTextFor(CheckComboBox.CheckState.ALL, "* all classrooms selected");

	ClassLevel cl = (ClassLevel) evt.getItem();
	while (tSubClassCheckComboBox.getModel().getSize() > 0) {
		tSubClassCheckComboBox.getModel().removeElement(tSubClassCheckComboBox.getModel().getElementAt(0));
	}
	ComboPopulator.populateMultiClassCombo(tSubClassCheckComboBox, cl.getClassRooms());
}//GEN-LAST:event_tClassLevelComboBoxItemStateChanged

	private void deleteTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeacherBtnActionPerformed
		// TODO add your handling code here:}//GEN-LAST:event_deleteTeacherBtnActionPerformed
		
				Teacher teacher = (Teacher) controller.getModel(Teacher.class);
				School.manager.getTransaction().begin();
			try {
                            School.manager.remove(teacher);
//				Query query = School.manager.createQuery("SELECT s from Student s where s.id = :id").setParameter("id", teacher.getId());

//				int deleted = query.executeUpdate();
				School.manager.getTransaction().commit();
				JOptionPane.showMessageDialog(null, "Teacher successfully deleted.", "Information", JOptionPane.INFORMATION_MESSAGE); // show operation success. 		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Unable to complete deletion process.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				e.printStackTrace();
//				School.manager.getTransaction().rollback();

			} finally { // close entity tools 			
				//  em.close(); 			
				// emf.close(); 		
			}
	}

		private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
				Student student = (Student) controller.getModel(Student.class);
				School.manager.getTransaction().begin();
			try {
                            School.manager.remove(student);
//				Query query = School.manager.createQuery("SELECT s from Student s where s.id = :id").setParameter("id", teacher.getId());

//				int deleted = query.executeUpdate();
				School.manager.getTransaction().commit();
				JOptionPane.showMessageDialog(null, "Student successfully deleted.", "Information", JOptionPane.INFORMATION_MESSAGE); // show operation success. 		
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Unable to complete deletion process.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				e.printStackTrace();
//				School.manager.getTransaction().rollback();

			} finally { // close entity tools 			
				//  em.close(); 			
				// emf.close(); 		
			}
	}//GEN-LAST:event_deleteStudentActionPerformed

private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
//	School school = School.getUniqueInstance();
	DefaultUpdateController updateController = new DefaultUpdateController();
	Student student = (Student) controller.getModel(Student.class);
	updateController.addModel(student); //adds the school model to list of registered models

	updateController.displayStudentUpdateView();

}//GEN-LAST:event_editStudentActionPerformed

	private void findStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findStudentBtnActionPerformed
		
            if (studentSearchField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out required fields first", "Warning Message", JOptionPane.WARNING_MESSAGE);
                this.studentSearchField.requestFocus();

            } else {
		    List<Student> students = Student.findByFullName(studentSearchField.getText());
                    System.out.println("query returned: " + students.size());
                
                if (!students.isEmpty()) {//query returned student(s)
			if(students.size() == 1){
				
                    Student student = (Student) students.get(0);
                    controller.addModel(student);// registers the found student to the controller
//			School.manager.getTransaction().commit();
//                    clearStudentDisplayContents();
                    setStudentDisplayView(student);
		    
			}else{//if multiple students resulted from search.
                    JOptionPane.showMessageDialog(null, "Please enter unique identifier.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);
//				controller.setStudentsTable(studentTable, students); 
//			    CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());

//			    cl.show(studentDisplayCard, "multipleStudentsDisplay");// displays the students' table with list of students
				
			}
                 
                } else {//query returned no resulting student(s)

                    JOptionPane.showMessageDialog(null, "Student not found.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);

	}                                              
        }
	}//GEN-LAST:event_findStudentBtnActionPerformed
		private void subClassComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subClassComboBoxItemStateChanged
			ClassRoom classRoom = (ClassRoom) evt.getItem();
			if (!sFNameLabel.getText().equals("")) { //when a teacher has already been selected
				sAssignedClassLabel.setText(classRoom.toString()); //display the choice selected in display view.
			}
	}//GEN-LAST:event_subClassComboBoxItemStateChanged

	private void tSubClassCheckComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tSubClassCheckComboBoxPropertyChange
		// TODO add your handling code here:
	}//GEN-LAST:event_tSubClassCheckComboBoxPropertyChange

	private void editTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeacherBtnActionPerformed
		
		 DefaultUpdateController updateController = new DefaultUpdateController();
                    Teacher teacher = (Teacher) controller.getModel(Teacher.class);

                    updateController.addModel(teacher); //adds the school model to list of registered models 

		updateController.displayTeacherUpdateView();
	}//GEN-LAST:event_editTeacherBtnActionPerformed

	/*
	 * 
	 * sets contents of update form with details to be edited.
	 */
	private void setFormParams(StudentUpdateForm studentForm, String sFName, String sMName, String sLName, String sDOB) {

		studentForm.getfNameTextBox().setText(sFName);
		studentForm.getmNameTextBox().setText(sMName);
		studentForm.getlNameTextBox().setText(sLName);
		studentForm.getDOBChooser().setDateFormatString(sDOB);


	}
	// </editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignStudentActionPanel;
    private javax.swing.JButton assignStudentBtn;
    private javax.swing.JPanel assignStudentControlPanel;
    private javax.swing.JLabel assignStudentHeadLabel;
    private javax.swing.JPanel assignStudentSubControlPanel;
    private javax.swing.JPanel assignStudentsPanel;
    private javax.swing.JTabbedPane assignTabbedPane;
    private javax.swing.JButton assignTeacherBtn;
    private javax.swing.JPanel assignTeacherDisplayPanel;
    private javax.swing.JPanel assignTeacherPanel;
    private javax.swing.JLabel assignedClassTitleLabel;
    private javax.swing.JLabel assignedClassTitleLabel1;
    private javax.swing.JLabel assignedClassTitleLabel2;
    private javax.swing.JLabel assignedClassTitleLabel3;
    private javax.swing.JLabel classLevelLabel7;
    private javax.swing.JLabel classLevelLabel8;
    private javax.swing.JLabel classLevelLabel9;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JButton deleteTeacherBtn;
    private javax.swing.JLabel dobLabelTitle;
    private javax.swing.JLabel dobLabelTitle1;
    private javax.swing.JLabel dobLabelTitle2;
    private javax.swing.JButton editStudent;
    private javax.swing.JButton editTeacherBtn;
    private javax.swing.JLabel fNameLabelTitle2;
    private javax.swing.JLabel fNameLabelTitle3;
    private javax.swing.JButton findStudentBtn;
    private javax.swing.JPanel findStudentPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel lNameLabelTitle4;
    private javax.swing.JLabel lNameLabelTitle5;
    private javax.swing.JLabel mNameLabelTitle2;
    private javax.swing.JLabel mNameLabelTitle3;
    private javax.swing.JPanel manageStudentControl;
    private javax.swing.JPanel manageTeacherControl;
    private javax.swing.JLabel sAssignedClassLabel;
    public static javax.swing.JComboBox sClassLevelComboBox;
    private javax.swing.JLabel sDOBLabel;
    private javax.swing.JLabel sFNameLabel;
    private javax.swing.JLabel sGenderLabel;
    private javax.swing.JLabel sLNameLabel;
    private javax.swing.JLabel sMNameLabel;
    private javax.swing.JPanel singleStudentDisplayPanel;
    private javax.swing.JPanel studentDetailsDisplayPanel;
    private javax.swing.JLabel studentImageLabel;
    private javax.swing.JTextField studentSearchField;
    private javax.swing.JComboBox subClassComboBox;
    private javax.swing.JLabel subClassLabel;
    private javax.swing.JLabel subClassLabel1;
    private org.japura.gui.CheckComboBox subjectCheckComboBox;
    private javax.swing.JLabel tAssignedClassesLabel;
    private javax.swing.JLabel tAssignedSubjectsLabel;
    private javax.swing.JComboBox tClassLevelComboBox;
    private javax.swing.JLabel tDOBLabel;
    private javax.swing.JLabel tFNameLabel;
    private javax.swing.JLabel tLNameLabel;
    private javax.swing.JLabel tMNameLabel;
    private javax.swing.JLabel tStatusLabel;
    private org.japura.gui.CheckComboBox tSubClassCheckComboBox;
    private javax.swing.JComboBox teacherCombobox;
    private javax.swing.JPanel teacherDetailsDisplayPanel1;
    private javax.swing.JLabel teacherImageLabel;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JLabel teacherLabel1;
    // End of variables declaration//GEN-END:variables
}
