package com.ourteam.yippySMS.view;

/**
 *
 * @author dantheta
 */
import com.ourteam.yippySMS.controller.AbstractController;
import com.ourteam.yippySMS.controller.DefaultAdmissionController;
import com.ourteam.yippySMS.controller.DefaultUpdateController;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.*;
import com.ourteam.yippySMS.model.*;
import com.ourteam.yippySMS.model.Person.Gender;
import java.io.Serializable;
import com.ourteam.yippySMS.helpers.ComboPopulator;
import com.ourteam.yippySMS.helpers.ManagePicture;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.io.File;

public class StudentUpdateForm extends JDialog implements RootPaneContainer, Serializable {

    DefaultUpdateController controller;
    AbstractModel studentModel;
    //School school;
    String fName, mName, lName, religion, contactNo;
    java.util.Date dob;
    Gender genderOption;
    ClassRoom assignedClass;

    public StudentUpdateForm() {
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cancelButton.doClick();
            }
        });

        initComponents();
        School school = School.getUniqueInstance();
        ComboPopulator.populateComboBox(classLevelCombo, school.getClassLevels());   //combo at add new student window
        this.setLocationRelativeTo(null);

    }

    /** Creates new form addStudentFormKG1 */
    public StudentUpdateForm(JFrame frame, String str, DefaultUpdateController controller, AbstractModel studentModel) {
        this.controller = controller;
        this.studentModel = studentModel;
//	studentModel.addObserver((Observer)this);

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cancelButton.doClick();
            }
        });

        initComponents();
        School school = School.getUniqueInstance();
        ComboPopulator.populateComboBox(classLevelCombo, school.getClassLevels());   //combo at add new student window
        this.setLocationRelativeTo(null);
	localInit();
    }

    public void createDesiredBorder(JButton jbtn) {
        jbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED),
                javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createMatteBorder(
                2, 2, 2, 2, new java.awt.Color(0, 0, 0)),
                javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED))),
                javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED)));
    }

    /*
     * Initializes the fields with student's details for editing
     */
    private void localInit(){
	    Student student = (Student) studentModel;
	//setting view with teacher's information.
	    fNameTextBox.setText(student.getPerson().getFName());
	    mNameTextBox.setText(student.getPerson().getMName());
	    lNameTextBox.setText(student.getPerson().getLName());
	    gender.setSelectedItem(student.getPerson().getGender()); 
	    DOBChooser.setDate(student.getPerson().getDOB()); 
	    if(student.getPerson().getPicture() != null){

	    ManagePicture.display(student.getPerson().getPicture(), sImageLabel);//sets labels icon to teacher's photo
	    }else{
		    sImageLabel.setIcon(null);
	    }
	    
    }

//	public static void populateComboBox(JComboBox combo, List elements) {
//		for (Object cl : elements) {
//			combo.addItem(cl);
//		}
//		
//	}
//	public static void populateMultiClassCombo(CheckComboBox multiCombo, List elements){
//		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all classes selected");
//		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple classes *");
//		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no class selected");
//		for (Object cl : elements){
//			multiCombo.getModel().addElement(cl);
//		}
//	   BatchSelection bs = new BatchSelection.CheckBox();
//	   EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
//	   multiCombo.setEmbeddedComponent(comp);	
//		
//	}
//	public static void populateMultiSubjectsCombo(CheckComboBox multiCombo, List elements){
//		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all subjects selected");
//		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple subjects *");
//		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no subject selected");
//		for (Object cl : elements){
//			multiCombo.getModel().addElement(cl);
//		}
//		 BatchSelection bs = new BatchSelection.CheckBox();
//   EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
//   multiCombo.setEmbeddedComponent(comp);
//	} 
    public void display() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screen.width - 490) / 2, ((screen.height - 650) / 2));
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sImageChooser = new javax.swing.JFileChooser();
        updateStudentPanel = new javax.swing.JPanel();
        fNameTextBox = new javax.swing.JTextField();
        mNameTextBox = new javax.swing.JTextField();
        lNameTextBox = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox(Person.Gender.values());
        jScrollPane1 = new javax.swing.JScrollPane();
        physicalAddressTextBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxAddressTextBox = new javax.swing.JTextArea();
        parentNameTextBox = new javax.swing.JTextField();
        contactNumberTextBox = new javax.swing.JTextField();
        classLevelCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        religionCombo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        DOBChooser = new com.toedter.calendar.JDateChooser();
        classCombo1 = new javax.swing.JComboBox();
        sImageLabel = new javax.swing.JLabel();
        changeImageBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        editStudentBtn = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        addStdBannerLabel = new javax.swing.JLabel();

        setTitle("SCHOOL MANAGEMENT SYSTEM");
        setResizable(false);

        updateStudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        fNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextBoxActionPerformed(evt);
            }
        });
        fNameTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameTextBoxFocusLost(evt);
            }
        });

        lNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextBoxActionPerformed(evt);
            }
        });

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        physicalAddressTextBox.setColumns(20);
        physicalAddressTextBox.setRows(5);
        jScrollPane1.setViewportView(physicalAddressTextBox);

        boxAddressTextBox.setColumns(20);
        boxAddressTextBox.setRows(5);
        jScrollPane2.setViewportView(boxAddressTextBox);

        parentNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentNameTextBoxActionPerformed(evt);
            }
        });

        classLevelCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classLevelComboItemStateChanged(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Middle Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Class Level");

        jLabel7.setText("Guardian's Name");

        jLabel8.setText("Religion");

        jLabel9.setText("Physical Address");

        jLabel10.setText("Box Address");

        jLabel11.setText("Date of Birth");

        jLabel12.setText("Gender");

        religionCombo.setEditable(true);
        religionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CHRISTIAN", "MUSLIM" }));

        jLabel13.setText("Class");

        DOBChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DOBChooserPropertyChange(evt);
            }
        });

        sImageLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        changeImageBtn.setText("change");
        changeImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeImageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateStudentPanelLayout = new javax.swing.GroupLayout(updateStudentPanel);
        updateStudentPanel.setLayout(updateStudentPanelLayout);
        updateStudentPanelLayout.setHorizontalGroup(
            updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(contactNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(1, 1, 1)
                .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateStudentPanelLayout.createSequentialGroup()
                        .addComponent(religionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateStudentPanelLayout.createSequentialGroup()
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classLevelCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 216, Short.MAX_VALUE)
                            .addComponent(parentNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(mNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(DOBChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(fNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(changeImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        updateStudentPanelLayout.setVerticalGroup(
            updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateStudentPanelLayout.createSequentialGroup()
                        .addComponent(sImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(changeImageBtn))
                    .addGroup(updateStudentPanelLayout.createSequentialGroup()
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(mNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel10))
                            .addGroup(updateStudentPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(DOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(religionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(parentNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(classLevelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(updateStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contactNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        editStudentBtn.setText("Update");
        editStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBtnActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(editStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addStdBannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudentBanner.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStdBannerLabel, 0, 0, Short.MAX_VALUE)
                    .addComponent(updateStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStdBannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBtnActionPerformed
        if (fNameTextBox.getText().isEmpty() || lNameTextBox.getText().isEmpty() || gender.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please fill out required fields first", "Warning Message", JOptionPane.WARNING_MESSAGE);
            this.fNameTextBox.requestFocus();
        } else {
//		Student student = (Student) controller.getModel(Student.class);// get the model registered with the controller that is an instance of student class.
            Student student = (Student) this.studentModel; //the student that is displayed by the form view.
            School.manager.persist(student);
            fName = fNameTextBox.getText();
            mName = mNameTextBox.getText();
            lName = lNameTextBox.getText();
            religion = (String) religionCombo.getSelectedItem();
            genderOption = (Gender) gender.getSelectedItem();
            dob = DOBChooser.getDate();
            contactNo = contactNumberTextBox.getText();
            //  ClassLevel cl = (ClassLevel) classLevelCombo.getSelectedItem();
            assignedClass = (ClassRoom) classCombo1.getSelectedItem();

            File file = sImageChooser.getSelectedFile();


            //assigns null if no image loaded or byte converted image from file if otherwise
            byte[] imageInBytes = (file == null) ? null : ManagePicture.readBytesFromFile(file);
            boolean updated = controller.handleUpdateStudent(student, fName, mName, lName, religion, contactNo, genderOption, dob, assignedClass, imageInBytes);
            if (updated) {
                clearButtonActionPerformed(evt);  // clear input fields  

                JOptionPane.showMessageDialog(null, "Student Info Updated!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "Unable to Update Information", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_editStudentBtnActionPerformed

    private void parentNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentNameTextBoxActionPerformed

    private void fNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextBoxActionPerformed
        // TODO add your handling code here:
//        if(!fNameTextBox.getText().isEmpty()){
//
//        }
    }//GEN-LAST:event_fNameTextBoxActionPerformed

    private void lNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextBoxActionPerformed
        // TODO add your handling code he
    }//GEN-LAST:event_lNameTextBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.fNameTextBox.setText("");
        this.mNameTextBox.setText("");
        this.lNameTextBox.setText("");
        this.gender.setSelectedItem("");
        this.physicalAddressTextBox.setText("");
        this.boxAddressTextBox.setText("");
        this.religionCombo.setSelectedItem("");
        this.parentNameTextBox.setText("");
        this.classLevelCombo.setSelectedItem("");
        this.contactNumberTextBox.setText("");
        this.fNameTextBox.requestFocus();
	this.sImageLabel.setIcon(null); 
	this.DOBChooser.setDate(null); 
	this.gender.setSelectedItem(null); 
    }//GEN-LAST:event_clearButtonActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void DOBChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DOBChooserPropertyChange
        // TODO add your handling code here:
        // DOBChooser.setDate(DOBChooser.getDate());
    }//GEN-LAST:event_DOBChooserPropertyChange

    private void classLevelComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classLevelComboItemStateChanged
        // TODO add your handling code here:
        ClassLevel cl = (ClassLevel) evt.getItem();

        classCombo1.removeAllItems(); //empty all items already in the sub class combo
        for (ClassRoom cr : cl.getClassRooms()) { //refill subclass combobox.
            classCombo1.addItem(cr);
        }
    }//GEN-LAST:event_classLevelComboItemStateChanged

	private void changeImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeImageBtnActionPerformed

            int returnVal = sImageChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {

                File file = sImageChooser.getSelectedFile();
                byte[] imageData = ManagePicture.readBytesFromFile(file);
                sImageLabel.setIcon(new ImageIcon(imageData)); //sets the image label to the selected image file.
            }
	}//GEN-LAST:event_changeImageBtnActionPerformed

	private void fNameTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameTextBoxFocusLost
            // TODO add your handling code here:
            Student student = (Student) controller.getModel(Student.class);
            Person person = student.getPerson();
            controller.changeStudentPerson(person);//changes students person information to reflect change
	}//GEN-LAST:event_fNameTextBoxFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new addStudentFormKG1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOBChooser;
    private javax.swing.JLabel addStdBannerLabel;
    private javax.swing.JTextArea boxAddressTextBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeImageBtn;
    private javax.swing.JComboBox classCombo1;
    private javax.swing.JComboBox classLevelCombo;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactNumberTextBox;
    private javax.swing.JButton editStudentBtn;
    private javax.swing.JTextField fNameTextBox;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lNameTextBox;
    private javax.swing.JTextField mNameTextBox;
    private javax.swing.JTextField parentNameTextBox;
    private javax.swing.JTextArea physicalAddressTextBox;
    private javax.swing.JComboBox religionCombo;
    private javax.swing.JFileChooser sImageChooser;
    private javax.swing.JLabel sImageLabel;
    private javax.swing.JPanel updateStudentPanel;
    // End of variables declaration//GEN-END:variables

    public JDateChooser getDOBChooser() {
        return DOBChooser;
    }

    public void setDOBChooser(JDateChooser DOBChooser) {
        this.DOBChooser = DOBChooser;
    }

    public JButton getAddStudentButton() {
        return editStudentBtn;
    }

    public ClassRoom getAssignedClass() {
        return assignedClass;
    }

    public void setAssignedClass(ClassRoom assignedClass) {
        this.assignedClass = assignedClass;
    }

    public JTextArea getBoxAddressTextBox() {
        return boxAddressTextBox;
    }

    public void setBoxAddressTextBox(JTextArea boxAddressTextBox) {
        this.boxAddressTextBox = boxAddressTextBox;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JComboBox getClassCombo1() {
        return classCombo1;
    }

    public void setClassCombo1(JComboBox classCombo1) {
        this.classCombo1 = classCombo1;
    }

    public JComboBox getClassLevelCombo() {
        return classLevelCombo;
    }

    public void setClassLevelCombo(JComboBox classLevelCombo) {
        this.classLevelCombo = classLevelCombo;
    }

    public JTextField getContactNumberTextBox() {
        return contactNumberTextBox;
    }

    public void setContactNumberTextBox(JTextField contactNumberTextBox) {
        this.contactNumberTextBox = contactNumberTextBox;
    }

    public JTextField getfNameTextBox() {
        return fNameTextBox;
    }

    public void setfNameTextBox(JTextField fNameTextBox) {
        this.fNameTextBox = fNameTextBox;
    }

    public JComboBox getGender() {
        return gender;
    }

    public void setGender(JComboBox gender) {
        this.gender = gender;
    }

    public JTextField getlNameTextBox() {
        return lNameTextBox;
    }

    public void setlNameTextBox(JTextField lNameTextBox) {
        this.lNameTextBox = lNameTextBox;
    }

    public JTextField getmNameTextBox() {
        return mNameTextBox;
    }

    public void setmNameTextBox(JTextField mNameTextBox) {
        this.mNameTextBox = mNameTextBox;
    }

    public JTextField getParentNameTextBox() {
        return parentNameTextBox;
    }

    public void setParentNameTextBox(JTextField parentNameTextBox) {
        this.parentNameTextBox = parentNameTextBox;
    }

    public JComboBox getReligionCombo() {
        return religionCombo;
    }

    public void setReligionCombo(JComboBox religionCombo) {
        this.religionCombo = religionCombo;
    }

    /**
     * Called by the controller when it needs to pass along a property change
     * from a model.
     * @param evt The property change event
     */
    public void modelPropertyChange(PropertyChangeEvent evt) {

        if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_FNAME_PROPERTY)) {
            fNameTextBox.setText((String) evt.getNewValue());
        } else if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_MNAME_PROPERTY)) {
            mNameTextBox.setText((String) evt.getNewValue());

        } else if (evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_LNAME_PROPERTY)) {
            lNameTextBox.setText((String) evt.getNewValue());

        }


//        revalidate();
        repaint();

    }
}
