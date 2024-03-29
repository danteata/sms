
package com.ourteam.yippySMS.view;

/**
 *
 * @author dantheta 
 */
import com.ourteam.yippySMS.controller.DefaultAdmissionController;
import com.ourteam.yippySMS.controller.DefaultClassController;
import com.ourteam.yippySMS.controller.DefaultEnrollmentController;
import com.ourteam.yippySMS.controller.DefaultUpdateController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import com.ourteam.yippySMS.model.*;
import java.io.Serializable;
import java.util.ArrayList;

public final class AdminMainView extends javax.swing.JFrame implements Serializable {

    SplashScreen FormSplash = new SplashScreen();
    Thread ThFormSplash = new Thread(FormSplash);
    JButton btn1;
    ArrayList cardNames = new ArrayList<String>();

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

    public AdminMainView() {
        addWindowListener(new WindowAdapter()  {

            @Override
            public void windowClosing(WindowEvent e) {
            }
        });
        initComponents();
        btn1 = new JButton();
        btn1.setVisible(false);
        setVisible(true);
        setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        defaultPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        medCheckLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addStudentMainButton = new javax.swing.JButton();
        createClassMainButton = new javax.swing.JButton();
        enrollPersonMainBtn = new javax.swing.JButton();
        createSubjectMainButton = new javax.swing.JButton();
        addTeacherMainButton = new javax.swing.JButton();
        manageRecordsMainBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        exitOption = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        adminMenu = new javax.swing.JMenu();
        addStudentMenu = new javax.swing.JMenuItem();
        addTeacherMenu = new javax.swing.JMenuItem();
        manageRecordMenu = new javax.swing.JMenuItem();
        newAcctMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpTopic = new javax.swing.JMenuItem();
        aboutUs = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCHOOL MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(51, 153, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        setResizable(false);

        defaultPanel.setBackground(new java.awt.Color(90, 191, 242));
        defaultPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SMSBANNER2.png"))); // NOI18N
        jLabel1.setText(" ");
        defaultPanel.add(jLabel1, "card2");

        medCheckLabel.setText(" ");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addStudentMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addstudent.png"))); // NOI18N
        addStudentMainButton.setText("Add Student      ");
        addStudentMainButton.setToolTipText("Adding of Students");
        addStudentMainButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addStudentMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentMainButtonActionPerformed(evt);
            }
        });

        createClassMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedulling.png"))); // NOI18N
        createClassMainButton.setText("Create Class");
        createClassMainButton.setToolTipText("Schedulling of Events");
        createClassMainButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        createClassMainButton.setPreferredSize(new java.awt.Dimension(149, 72));
        createClassMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassMainButtonActionPerformed(evt);
            }
        });

        enrollPersonMainBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addstudent.png"))); // NOI18N
        enrollPersonMainBtn.setText("Enroll Person");
        enrollPersonMainBtn.setToolTipText("Things admin can also do on students");
        enrollPersonMainBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        enrollPersonMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollPersonMainBtnActionPerformed(evt);
            }
        });

        createSubjectMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portfolio.png"))); // NOI18N
        createSubjectMainButton.setText("Create Subject");
        createSubjectMainButton.setToolTipText("Viewing of students");
        createSubjectMainButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        createSubjectMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSubjectMainButtonActionPerformed(evt);
            }
        });

        addTeacherMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addteacher.png"))); // NOI18N
        addTeacherMainButton.setText("Add Teacher         ");
        addTeacherMainButton.setToolTipText("Add of teachers");
        addTeacherMainButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addTeacherMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherMainButtonActionPerformed(evt);
            }
        });

        manageRecordsMainBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LaST (Cobalt) Control Panel.png"))); // NOI18N
        manageRecordsMainBtn.setText("Manage Records");
        manageRecordsMainBtn.setToolTipText("Printing of Report cards");
        manageRecordsMainBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        manageRecordsMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecordsMainBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(addStudentMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addTeacherMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(enrollPersonMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(createClassMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(createSubjectMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(manageRecordsMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageRecordsMainBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTeacherMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enrollPersonMainBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(createClassMainButton, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(createSubjectMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(120, 32769));

        exitOption.setText("File");

        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        exitOption.add(jMenuItem6);

        jMenuBar1.add(exitOption);

        adminMenu.setText("Administrator");
        adminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMenuActionPerformed(evt);
            }
        });

        addStudentMenu.setText("Add Student");
        addStudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentMenuActionPerformed(evt);
            }
        });
        adminMenu.add(addStudentMenu);

        addTeacherMenu.setText("Add Teacher");
        addTeacherMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherMenuActionPerformed(evt);
            }
        });
        adminMenu.add(addTeacherMenu);

        manageRecordMenu.setText("Manage System");
        manageRecordMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecordMenuActionPerformed(evt);
            }
        });
        adminMenu.add(manageRecordMenu);

        newAcctMenu.setText("New Account");
        newAcctMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAcctMenuActionPerformed(evt);
            }
        });
        adminMenu.add(newAcctMenu);

        jMenuBar1.add(adminMenu);

        helpTopic.setText("Help Topic");
        helpTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpTopicActionPerformed(evt);
            }
        });
        helpMenu.add(helpTopic);

        aboutUs.setText("About Us");
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        helpMenu.add(aboutUs);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1628, 1628, 1628)
                .addComponent(medCheckLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(defaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medCheckLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentMainButtonActionPerformed
	    //gets the layout of the default panel for latter switching of panels
	   CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("studentCard")){ //add to cardPanel if not already existent.
		   DefaultAdmissionController studController = new DefaultAdmissionController();
		   
		   studController.addModel(new Student());  //register a new student object with empty params.

		   StudentAdmissionPanel studentPanel = new StudentAdmissionPanel(studController);
	   defaultPanel.add(studentPanel, "studentCard"); 
	   cardNames.add("studentCard");// add panel identifier to cardNames collection to avoid duplication later
	   studController.addView(studentPanel); // registers student admission panel to the controller
//	   CardLayout clayout = (CardLayout)teacherPanel.getAdmissionDisplayCard().getLayout();
		   
//	   StudentAdmissionDisplayPanel propertyView = new StudentAdmissionDisplayPanel(teacherController); //to be added to default display card panel.

//	   teacherPanel.getAdmissionDisplayCard().add(propertyView); //alternative to pre-adding panel from the gui builder.
		   
		   
//	   studController.addView(studentPanel.getAdmissionDisplayView()); // registers admitted student's details panel to the controller
//	   teacherController.addModel(null);
	  
    }
cl.show(defaultPanel, "studentCard"); //now show the panel

    }//GEN-LAST:event_addStudentMainButtonActionPerformed

    private void addTeacherMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherMenuActionPerformed
//	addTeacherMainButton.doClick(); //simulate the same process as clicking on the add teacher button
	    addTeacherMainButtonActionPerformed(evt);
    }//GEN-LAST:event_addTeacherMenuActionPerformed

 

    private void addStudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentMenuActionPerformed
//	    addStudentMainButton.doClick(); //simulate the same process as clicking on add student main button
	    addStudentMainButtonActionPerformed(evt); 

    }//GEN-LAST:event_addStudentMenuActionPerformed

    private void createClassMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassMainButtonActionPerformed
	    CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("classCard")){ //add to cardPanel if not already existent.
		   DefaultClassController classController = new DefaultClassController();
		   
//		   classController.addModel(new ClassRoom());  //register a new student object with empty params.

           ClassPanel classPanel = new ClassPanel(classController);
	   defaultPanel.add(classPanel, "classCard"); 
	   cardNames.add("classCard");// add panel identifier to cardNames collection to avoid duplication later
	   classController.addView(classPanel); // registers student admission panel to the controller
           classController.addModel(School.getUniqueInstance()); // registers the school model
//	   CardLayout clayout = (CardLayout)teacherPanel.getAdmissionDisplayCard().getLayout();
		   
//	   StudentAdmissionDisplayPanel propertyView = new StudentAdmissionDisplayPanel(teacherController); //to be added to default display card panel.

//	   teacherPanel.getAdmissionDisplayCard().add(propertyView); //alternative to pre-adding panel from the gui builder.
		   
		   
//	   studController.addView(subjectCard.getDisplayView()); // registers admitted student's details panel to the controller
//	   teacherController.addModel(null);
	  
    }
cl.show(defaultPanel, "classCard"); //now show the panel 
    }//GEN-LAST:event_createClassMainButtonActionPerformed

    private void enrollPersonMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollPersonMainBtnActionPerformed
	   CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("AssignClassCard")){ //add to cardPanel if not already existent.
		   DefaultEnrollmentController teacherController = new DefaultEnrollmentController(); //TODO: change to enrollment controller.
		   
		   teacherController.addModel(new Person());  //register a new student object with empty params.
 	 	   AssignToClassPanel assignClassPanel = new AssignToClassPanel(teacherController);
	   defaultPanel.add(assignClassPanel, "AssignClassCard"); 
	   
	   teacherController.addView(assignClassPanel); // registers student admission panel to the controller
    }
cl.show(defaultPanel, "AssignClassCard");   

    }//GEN-LAST:event_enrollPersonMainBtnActionPerformed

    private void addTeacherMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherMainButtonActionPerformed
	   	   CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("teacherCard")){ //add to cardPanel if not already existent.
		   DefaultAdmissionController teacherController = new DefaultAdmissionController();
		   
		   teacherController.addModel(new Person());  //register a new student object with empty params.

//		   StudentAdmissionPanel teacherPanel = new StudentAdmissionPanel(teacherController);
		   TeacherAdmissionPanel teacherPanel = new TeacherAdmissionPanel(teacherController);
	   defaultPanel.add(teacherPanel, "teacherCard"); 
	   cardNames.add("teacherCard");// add panel identifier to cardNames collection to avoid duplication later
	   teacherController.addView(teacherPanel); // registers student admission panel to the controller
//	   CardLayout clayout = (CardLayout)teacherPanel.getAdmissionDisplayCard().getLayout();
		   
//	   StudentAdmissionDisplayPanel propertyView = new StudentAdmissionDisplayPanel(teacherController); //to be added to default display card panel.

//	   teacherPanel.getAdmissionDisplayCard().add(propertyView); //alternative to pre-adding panel from the gui builder.
		   
		   
//	   teacherController.addView(teacherPanel.getAdmissionDisplayView()); // registers admitted student's details panel to the controller
//	   teacherController.addModel(null);
	  
    }
cl.show(defaultPanel, "teacherCard");  
		School school = School.getUniqueInstance();
	DefaultAdmissionController schoolCon = new DefaultAdmissionController();
//this.addTeacherPanel = new TeacherAdmissionPanel(schoolCon);	
	schoolCon.addModel(school); //adds the school model to list of registered models
    }//GEN-LAST:event_addTeacherMainButtonActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(AdminMainView.this, "Are you sure you really want to exit the application", "SCHOOL MANAGEMENT SYSTEM", 0);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void manageRecordsMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecordsMainBtnActionPerformed
  	   CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("manageRecordsCard")){ //add to cardPanel if not already existent.
		   DefaultUpdateController teacherController = new DefaultUpdateController();
		   
		   teacherController.addModel(new Person());  //register a new student object with empty params.

//		   TeacherAdmissionPanel teacherPanel = new TeacherAdmissionPanel(teacherController);
		   ManageRecordsPanel manageRecordsPanel = new ManageRecordsPanel(teacherController);
	   defaultPanel.add(manageRecordsPanel, "manageRecordsCard"); 
	   cardNames.add("manageRecordsCard");// add panel identifier to cardNames collection to avoid duplication later
	   teacherController.addView(manageRecordsPanel); // registers student admission panel to the controller
//	   CardLayout clayout = (CardLayout)teacherPanel.getAdmissionDisplayCard().getLayout();
		   
//	   StudentAdmissionDisplayPanel propertyView = new StudentAdmissionDisplayPanel(teacherController); //to be added to default display card panel.

//	   teacherPanel.getAdmissionDisplayCard().add(propertyView); //alternative to pre-adding panel from the gui builder.
		   
		   
//	   teacherController.addView(teacherPanel.getAdmissionDisplayView()); // registers admitted student's details panel to the controller
//	   teacherController.addModel(null);
	  
    }
cl.show(defaultPanel, "manageRecordsCard"); 
//        JFrame frame1 = new JFrame();
//        classTeacherLogin form = new classTeacherLogin(frame1, "School Management System");
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        form.setLocation((screen.width - 400) / 2, ((screen.height - 350) / 2));
//        form.setVisible(true);
    }//GEN-LAST:event_manageRecordsMainBtnActionPerformed

    private void helpTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpTopicActionPerformed
        //JFrame frame1 = new JFrame();
    }//GEN-LAST:event_helpTopicActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
    }//GEN-LAST:event_aboutUsActionPerformed

    private void createSubjectMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSubjectMainButtonActionPerformed
	    CardLayout cl = (CardLayout)(defaultPanel.getLayout());

	   if(cardNames.isEmpty() || !cardNames.contains("subjectCard")){ //add to cardPanel if not already existent.
		   DefaultAdmissionController studController = new DefaultAdmissionController();
		   
		   studController.addModel(new Subject());  //register a new student object with empty params.

		   SubjectPanel subjectCard = new SubjectPanel(studController);
	   defaultPanel.add(subjectCard, "subjectCard"); 
	   cardNames.add("subjectCard");// add panel identifier to cardNames collection to avoid duplication later
	   studController.addView(subjectCard); // registers student admission panel to the controller
//	   CardLayout clayout = (CardLayout)teacherPanel.getAdmissionDisplayCard().getLayout();
		   
//	   StudentAdmissionDisplayPanel propertyView = new StudentAdmissionDisplayPanel(teacherController); //to be added to default display card panel.

//	   teacherPanel.getAdmissionDisplayCard().add(propertyView); //alternative to pre-adding panel from the gui builder.
		   
		   
//	   studController.addView(subjectCard.getDisplayView()); // registers admitted student's details panel to the controller
//	   teacherController.addModel(null);
	  
    }
cl.show(defaultPanel, "subjectCard"); //now show the panel  

    }//GEN-LAST:event_createSubjectMainButtonActionPerformed

    private void adminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminMenuActionPerformed

    private void manageRecordMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecordMenuActionPerformed
	    manageRecordsMainBtnActionPerformed(evt);
        // TODO add your handling code here:
//        JFrame frame1 = new JFrame();
//        AdminTasks adminTaskForm = new AdminTasks(frame1, "School Management System");
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        adminTaskForm.setLocation((screen.width - 1160) / 2, ((screen.height - 700) / 2));
//        adminTaskForm.setVisible(true);
    }//GEN-LAST:event_manageRecordMenuActionPerformed

    private void newAcctMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAcctMenuActionPerformed
        // TODO add your handling code here:
        JFrame frame1 = new JFrame();
        NewAccountForm acctForm = new NewAccountForm(frame1, "School Management System");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        acctForm.setLocation((screen.width - 400) / 2, ((screen.height - 350) / 2));
        acctForm.setVisible(true);
    }//GEN-LAST:event_newAcctMenuActionPerformed
    public boolean bool1;

    public boolean getBtnEnabled() {
        return bool1;
    }

    public void btnEnabled() {
        addStudentMainButton.setEnabled(true);
        addTeacherMainButton.setEnabled(true);
        //reportCardMainButton.setEnabled(true);
        enrollPersonMainBtn.setEnabled(true);
        createClassMainButton.setEnabled(true);
        createSubjectMainButton.setEnabled(true);
    }

    public void teacherBtnsEnabled() {
        addStudentMainButton.setEnabled(true);
        addTeacherMainButton.setEnabled(true);
        manageRecordsMainBtn.setEnabled(true);
        createClassMainButton.setEnabled(true);
        //scheduleMainButton.setEnabled(true);
        createSubjectMainButton.setEnabled(true);
    }

    protected void loadSplashScreen() {

        ThFormSplash.start();
        while (!FormSplash.isShowing()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }

//    public static void main(String args[]) {
////        AdminMainView c = new AdminMainView();
////        c.setVisible(true);
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        AccessControl accessControlForm = new AccessControl();
//        accessControlForm.setLocation((screen.width - 400) / 2, ((screen.height - 350) / 2));
//        accessControlForm.setVisible(true);
//        //c.btnEnabled();
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutUs;
    private javax.swing.JButton addStudentMainButton;
    private javax.swing.JMenuItem addStudentMenu;
    private javax.swing.JButton addTeacherMainButton;
    private javax.swing.JMenuItem addTeacherMenu;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JButton createClassMainButton;
    private javax.swing.JButton createSubjectMainButton;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JButton enrollPersonMainBtn;
    private javax.swing.JMenu exitOption;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpTopic;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem manageRecordMenu;
    private javax.swing.JButton manageRecordsMainBtn;
    private javax.swing.JLabel medCheckLabel;
    private javax.swing.JMenuItem newAcctMenu;
    // End of variables declaration//GEN-END:variables
}
