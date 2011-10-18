/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TeacherUpdateForm.java
 *
 * Created on Sept 6, 2011, 1:40:05 PM
 */
package com.ourteam.yippySMS.view;

/**
 *
 * @author dantheta
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.ourteam.yippySMS.model.*;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.controller.ITeacherAdmissionController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.ourteam.yippySMS.controller.SchoolManagementSystem;
import com.ourteam.yippySMS.helpers.ComboPopulator;
import java.util.Observable;
import java.util.List;

public class TeacherUpdateForm extends JDialog implements RootPaneContainer {

    //School school;
    String fName, mName, lName, religion;
    Subject preferredSubject;
    ClassRoom assignedClass;
    String contactNo;
    java.util.Date dob;
    Gender genderOption;

    ITeacherAdmissionController teacherAdmissionController;
    Observable teacherModel;

    //private static Connection con = null;
    /** Creates new form addStudentForm */
    public TeacherUpdateForm(JFrame frame, String str, ITeacherAdmissionController teacherAdmissoinController, Observable teacherModel) {
	this.teacherModel = teacherModel;
	this.teacherAdmissionController = teacherAdmissoinController;
		
        addWindowListener(new WindowAdapter()  {

			@Override
            public void windowClosing(WindowEvent e) {
                cancelButton.doClick();
            }
        });

        initComponents();
	 
       School school = School.getUniqueInstance();
        if(preferredSubjectComboBox.getSelectedObjects().length == 0 && !school.getSubjects().isEmpty()){ //populates preferredsubject combobox if not already populated.
            ComboPopulator.populateComboBox(preferredSubjectComboBox, school.getSubjects());
            ComboPopulator.populateComboBox(assignedClassCombo, school.getClassLevels());
	    ComboPopulator.populateMultiClassCombo(multiClassCombo, school.getClassLevels());
	    ComboPopulator.populateMultiSubjectsCombo(multiSubjectsCombo, school.getSubjects());
        }
        this.setLocationRelativeTo(null);
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
    
    public void display(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screen.width - 490) / 2, ((screen.height - 650) / 2));
        this.setVisible(true);
    } 

//    public void populateCombo() {
//        if (assignedClassCombo.getSelectedObjects().length == 0) {   //checks if combobox has not been already populated.
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("smsprojectPU2");
//            EntityManager em = emf.createEntityManager();
//            try {
//
//                em.getTransaction().begin();
//                School school = em.find(School.class, 1L);
//                Query query = em.createQuery("select cr from ClassRoom as cr");
//
//                java.util.List cl = (java.util.List<ClassRoom>) query.getResultList();  //populate classlevelcombo with all created class levels
//// CheckComboBox ccb = new CheckComboBox(); 
//		multiClassCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all item selected");
//		multiClassCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple items *");
//		multiClassCombo.setTextFor(CheckComboBox.CheckState.NONE, "* any item selected");
// ccb.setTextFor(CheckComboBox.NONE, "* any item selected *"); 
// ccb.setTextFor(CheckComboBox.MULTIPLE, "* multiple items *"); 
// ccb.setTextFor(CheckComboBox.ALL, "* all selected *"); 
//  
// ListCheckModel model = ccb.getModel(); 
// for (ClassRoom c : (java.util.List<ClassRoom>) cl) { 
//   model.addElement(c); 
// } 
//                for (ClassRoom a : (java.util.List<ClassRoom>) cl) {
//                    assignedClassCombo.addItem(a);
//                }
//
//                Query query1 = em.createQuery("select s from Subject as s");
//
//                java.util.List s = (java.util.List<Subject>) query1.getResultList();  //populates preferred subject combo with all subjects available
//                for (Subject a : (java.util.List<Subject>) s) {
//                    preferredSubjectComboBox.addItem(a);
//                }
//
//                em.getTransaction().commit();
//                //  SubjectCombobox.setModel(new javax.swing.DefaultComboBoxModel(obj));
//            } catch (Exception e) {
//                e.printStackTrace();
//                em.getTransaction().rollback();
//            } finally { // close entity tools
//                em.close();
//                emf.close();
//            }
//        }
//    }

    public void createDesiredBorder(JButton jbtn) {
        jbtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateTeacherPanel = new javax.swing.JPanel();
        fNameTextBox = new javax.swing.JTextField();
        mNameTextBox = new javax.swing.JTextField();
        lNameTextBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        physicalAddressTextBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxAddressTextBox = new javax.swing.JTextArea();
        contactNumberTextBox = new javax.swing.JTextField();
        assignedClassCombo = new javax.swing.JComboBox();
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
        subjectAreaTextBox = new javax.swing.JTextField();
        DOBChooser = new com.toedter.calendar.JDateChooser();
        religionCombo = new javax.swing.JComboBox();
        religionLabel = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox(Person.Gender.values());
        preferredSubjectComboBox = new javax.swing.JComboBox();
        multiClassCombo = new org.japura.gui.CheckComboBox();
        multiSubjectsCombo = new org.japura.gui.CheckComboBox();
        jPanel2 = new javax.swing.JPanel();
        addTeacherButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);

        updateTeacherPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        fNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextBoxActionPerformed(evt);
            }
        });

        lNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextBoxActionPerformed(evt);
            }
        });

        physicalAddressTextBox.setColumns(20);
        physicalAddressTextBox.setRows(5);
        jScrollPane1.setViewportView(physicalAddressTextBox);

        boxAddressTextBox.setColumns(20);
        boxAddressTextBox.setRows(5);
        jScrollPane2.setViewportView(boxAddressTextBox);

        jLabel2.setText("First Name");

        jLabel3.setText("Middle Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Contact Number");

        jLabel6.setText("Assigned Class");

        jLabel7.setText("Prefered Subject");

        jLabel8.setText("Subject Areas");

        jLabel9.setText("Physical Address");

        jLabel10.setText("Box Address");

        jLabel11.setText("Date of Birth");

        jLabel12.setText("Gender");

        religionCombo.setEditable(true);
        religionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Christian", "Islamic", "Traditional", "Bhudist", "Rastafariasm" }));

        religionLabel.setText("Religion");

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateTeacherPanelLayout = new javax.swing.GroupLayout(updateTeacherPanel);
        updateTeacherPanel.setLayout(updateTeacherPanelLayout);
        updateTeacherPanelLayout.setHorizontalGroup(
            updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(religionLabel)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(assignedClassCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(contactNumberTextBox)
                        .addComponent(subjectAreaTextBox)
                        .addComponent(lNameTextBox)
                        .addComponent(mNameTextBox)
                        .addComponent(fNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(DOBChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(religionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiSubjectsCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multiClassCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(preferredSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        updateTeacherPanelLayout.setVerticalGroup(
            updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12))
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(religionLabel)
                    .addComponent(religionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(DOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(subjectAreaTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10))
                    .addGroup(updateTeacherPanelLayout.createSequentialGroup()
                        .addComponent(preferredSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(assignedClassCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(updateTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumberTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiClassCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(multiSubjectsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        addTeacherButton.setText("Add Teacher");
        addTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTeacherButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addTeacherBanner.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99))
                    .addComponent(updateTeacherPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateTeacherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed

        SchoolManagementSystem sms = new SchoolManagementSystem();

        if (fNameTextBox.getText().isEmpty() || lNameTextBox.getText().isEmpty() || gender.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please fill out required fields first", "Warning Message", JOptionPane.WARNING_MESSAGE);
            this.fNameTextBox.requestFocus();
        } else {
                fName = fNameTextBox.getText();
                mName = mNameTextBox.getText();
                lName = lNameTextBox.getText();
                religion = (String) religionCombo.getSelectedItem();
                genderOption = (Gender) gender.getSelectedItem();
                dob = DOBChooser.getDate();
                contactNo = contactNumberTextBox.getText();
		preferredSubject = (Subject)preferredSubjectComboBox.getSelectedItem();
		
		teacherAdmissionController.handleAddTeacher(fName, mName, lName, religion, contactNo, genderOption, dob, assignedClass, preferredSubject);

    }//GEN-LAST:event_addTeacherButtonActionPerformed
    }
    private void fNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextBoxActionPerformed

    private void lNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.fNameTextBox.setText("");
        this.mNameTextBox.setText("");
        this.lNameTextBox.setText("");
        this.gender.setSelectedItem("");
        this.physicalAddressTextBox.setText("");
        this.boxAddressTextBox.setText("");
        this.subjectAreaTextBox.setText("");
        this.assignedClassCombo.setSelectedItem("");
        this.contactNumberTextBox.setText("");
        this.contactNumberTextBox.setText("");
        this.fNameTextBox.requestFocus();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_genderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()  {

            public void run() {
                // new TeacherUpdateForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOBChooser;
    private javax.swing.JButton addTeacherButton;
    private javax.swing.JComboBox assignedClassCombo;
    private javax.swing.JTextArea boxAddressTextBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactNumberTextBox;
    private javax.swing.JTextField fNameTextBox;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private org.japura.gui.CheckComboBox multiClassCombo;
    private org.japura.gui.CheckComboBox multiSubjectsCombo;
    private javax.swing.JTextArea physicalAddressTextBox;
    public static javax.swing.JComboBox preferredSubjectComboBox;
    private javax.swing.JComboBox religionCombo;
    private javax.swing.JLabel religionLabel;
    private javax.swing.JTextField subjectAreaTextBox;
    private javax.swing.JPanel updateTeacherPanel;
    // End of variables declaration//GEN-END:variables
}
