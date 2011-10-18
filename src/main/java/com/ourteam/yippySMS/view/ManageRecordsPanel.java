/*
 *
 */
package com.ourteam.yippySMS.view;

import com.ourteam.yippySMS.controller.DefaultAdmissionController;
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
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import org.japura.gui.CheckComboBox;

/**
 * This is a custom view panel that display properties for both the document
 * and text element. Both the document and the text element respond to changes
 * in the model state.
 *@author dantheta
 */
public class ManageRecordsPanel extends AbstractViewPanel {

    //  The controller used by this view
    private DefaultAdmissionController controller;
    String[] studentTableHeader = new String[4];

    //  A local copy of the current Font which can be passed to the 
    //  constructor of JFontChooserDialog.
    /**
     * Creates new form StudentAdmissionPanel
     * @param controller An object implementing the controller interface that
     *        this view can use to process GUI actions
     */
    public ManageRecordsPanel(DefaultAdmissionController controller) {

        this.controller = controller;

        initComponents();
        localInitialization();

    }

    private void localInitialization() {
        //on manage teacher panel
        ComboPopulator.populateComboBox(teacherCombobox, School.getUniqueInstance().getTeachers()); //teacher combobox at assignn teacher to class.
        ComboPopulator.populateComboBox(tByClassLevelComboBox, School.getUniqueInstance().getClassLevels()); // class level combobox at assign teacher to class.
        ComboPopulator.populateComboBox(tBySubjectComboBox, School.getUniqueInstance().getSubjects()); // class level combobox at assign teacher to class.

        //on manage student panel
        ComboPopulator.populateComboBox(sByClassLevelComboBox, School.getUniqueInstance().getClassLevels());// class level combobox at assign student to class.
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
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        jSeparator2 = new javax.swing.JSeparator();
        manageRecordsTabbedPane = new javax.swing.JTabbedPane();
        manageTeacherPanel = new javax.swing.JPanel();
        tManageCotrol = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        subjectLabel = new javax.swing.JLabel();
        tBySubjectComboBox = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        findTeacherBtn = new javax.swing.JButton();
        teacherCombobox = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        showAllTeachersBtn = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        classLevelLabel13 = new javax.swing.JLabel();
        subClassLabel3 = new javax.swing.JLabel();
        tByClassLevelComboBox = new javax.swing.JComboBox();
        tSubClassComboBox = new javax.swing.JComboBox();
        manageTeacherHeadLabel = new javax.swing.JLabel();
        teacherDisplayCard = new javax.swing.JPanel();
        singleTeacherDisplayPanel = new javax.swing.JPanel();
        teacherDetailsDisplayPanel = new javax.swing.JPanel();
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
        tPictureLabel = new javax.swing.JLabel();
        assignedClassTitleLabel2 = new javax.swing.JLabel();
        tGenderLabel = new javax.swing.JLabel();
        assignedClassTitleLabel4 = new javax.swing.JLabel();
        manageTeacherControl = new javax.swing.JPanel();
        editTeacher = new javax.swing.JButton();
        deleteTeacherBtn = new javax.swing.JButton();
        multipleTeachersDisplayPanel = new DefaultVIewPanel();
        teacherTableScrollPane = new javax.swing.JScrollPane();
        teacherTable = new javax.swing.JTable();
        editTeacherPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tFNameTextBox = new javax.swing.JTextField();
        tFNameTitleLabel = new javax.swing.JLabel();
        tMNameTitleLabel = new javax.swing.JLabel();
        tMNameTextBox = new javax.swing.JTextField();
        tLNameTextBox = new javax.swing.JTextField();
        tLastNameTitleLabel = new javax.swing.JLabel();
        genderLabel1 = new javax.swing.JLabel();
        tGenderCombo = new javax.swing.JComboBox(Person.Gender.values());
        religionLabel1 = new javax.swing.JLabel();
        tReligionCombo = new javax.swing.JComboBox();
        tDOBChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        editControlsPanel1 = new javax.swing.JPanel();
        cancelButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        updateTeacherBtn = new javax.swing.JButton();
        editStudentHeadLabel1 = new javax.swing.JLabel();
        manageClassAndSubjectPanel = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        classLevelLabel10 = new javax.swing.JLabel();
        classLevelLabel11 = new javax.swing.JLabel();
        subClassLabel2 = new javax.swing.JLabel();
        teacherCombobox2 = new javax.swing.JComboBox();
        teacherLabel2 = new javax.swing.JLabel();
        tSubClassCheckComboBox1 = new org.japura.gui.CheckComboBox();
        subjectCheckComboBox1 = new org.japura.gui.CheckComboBox();
        tClassLevelComboBox1 = new javax.swing.JComboBox();
        jPanel60 = new javax.swing.JPanel();
        assignTeacherBtn1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        fNameLabelTitle1 = new javax.swing.JLabel();
        fNameLabel1 = new javax.swing.JLabel();
        mNameLabelTitle1 = new javax.swing.JLabel();
        mNameLabel1 = new javax.swing.JLabel();
        lNameLabelTitle2 = new javax.swing.JLabel();
        lNameLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lNameLabelTitle3 = new javax.swing.JLabel();
        lNameLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        manageStudentPanel = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        showByClassPanel = new javax.swing.JPanel();
        classLevelLabel12 = new javax.swing.JLabel();
        subClassLabel1 = new javax.swing.JLabel();
        sSubClassComboBox = new javax.swing.JComboBox();
        sByClassLevelComboBox = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        findStudentBTn = new javax.swing.JButton();
        List<Student> students = (List<Student>)School.getUniqueInstance().getStudents();
        ModelCompletionService nameService = new ModelCompletionService(students);
        studentSearchField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        showAllStudentsBtn = new javax.swing.JButton();
        manageStudentsHeadLabel = new javax.swing.JLabel();
        studentDisplayCard = new com.ourteam.yippySMS.view.DefaultVIewPanel();
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
        sAssignedClassLabel = new javax.swing.JLabel();
        sPictureLabel = new javax.swing.JLabel();
        assignedClassTitleLabel1 = new javax.swing.JLabel();
        sGenderLabel = new javax.swing.JLabel();
        assignedClassTitleLabel3 = new javax.swing.JLabel();
        manageStudentControl = new javax.swing.JPanel();
        editStudent = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        multipleStudentsDisplayPanel = new javax.swing.JPanel();
        studentTableScrolPanel = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        editStudentPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        sFNameTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sMNameTextBox = new javax.swing.JTextField();
        sLNameTextBox = new javax.swing.JTextField();
        sLastNameTitleLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        sGenderCombo = new javax.swing.JComboBox(Person.Gender.values());
        religionLabel = new javax.swing.JLabel();
        formerSchoolTitleLabel = new javax.swing.JLabel();
        subjectAreaTextBox = new javax.swing.JTextField();
        sReligionCombo = new javax.swing.JComboBox();
        sDOBChooser = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        editControlsPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        UpdateStudentBtn = new javax.swing.JButton();
        editStudentHeadLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(90, 191, 242));

        manageRecordsTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageRecordsTabbedPaneMouseClicked(evt);
            }
        });

        tManageCotrol.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 204, 255))); // NOI18N

        subjectLabel.setText("Subject");

        tBySubjectComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tBySubjectComboBoxItemStateChanged(evt);
            }
        });
        tBySubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBySubjectComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tBySubjectComboBox, 0, 207, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectLabel)
                    .addComponent(tBySubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 204, 255))); // NOI18N

        jPanel61.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        findTeacherBtn.setText("Find");
        findTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTeacherBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(teacherCombobox, 0, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findTeacherBtn))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findTeacherBtn)
                    .addComponent(teacherCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        showAllTeachersBtn.setText("Show All");
        showAllTeachersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllTeachersBtnActionPerformed(evt);
            }
        });

        jRadioButton1.setText("By Subject");

        jRadioButton2.setText("By Class");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(61, 61, 61))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(showAllTeachersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(12, 12, 12)
                .addComponent(showAllTeachersBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        classLevelLabel13.setText("Class Level");

        subClassLabel3.setText("Class Name");

        tByClassLevelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tByClassLevelComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classLevelLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subClassLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tSubClassComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tByClassLevelComboBox, 0, 164, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(classLevelLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(subClassLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tByClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tSubClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tManageCotrolLayout = new javax.swing.GroupLayout(tManageCotrol);
        tManageCotrol.setLayout(tManageCotrolLayout);
        tManageCotrolLayout.setHorizontalGroup(
            tManageCotrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tManageCotrolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tManageCotrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tManageCotrolLayout.setVerticalGroup(
            tManageCotrolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tManageCotrolLayout.createSequentialGroup()
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        manageTeacherHeadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tasksandportfolio.png"))); // NOI18N

        teacherDisplayCard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        teacherDisplayCard.setLayout(new java.awt.CardLayout());

        singleTeacherDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        singleTeacherDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        singleTeacherDisplayPanel.setName("singleTeacherDisplay"); // NOI18N

        teacherDetailsDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        teacherDetailsDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        assignedClassTitleLabel.setText("Subjects Assigned");

        tAssignedSubjectsLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tAssignedClassesLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tStatusLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dobLabelTitle1.setText("Status");

        tPictureLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel2.setText("Classes Assigned");

        tGenderLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel4.setText("Gender");

        javax.swing.GroupLayout teacherDetailsDisplayPanelLayout = new javax.swing.GroupLayout(teacherDetailsDisplayPanel);
        teacherDetailsDisplayPanel.setLayout(teacherDetailsDisplayPanelLayout);
        teacherDetailsDisplayPanelLayout.setHorizontalGroup(
            teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE))
                            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                        .addComponent(assignedClassTitleLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tGenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(dobLabelTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dobLabelTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                        .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fNameLabelTitle2)
                                            .addComponent(mNameLabelTitle2))
                                        .addGap(32, 32, 32)
                                        .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tMNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tFNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                        .addComponent(lNameLabelTitle4)
                                        .addGap(46, 46, 46)
                                        .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tDOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(assignedClassTitleLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(tPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tAssignedSubjectsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(assignedClassTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tAssignedClassesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)))
                .addContainerGap())
        );
        teacherDetailsDisplayPanelLayout.setVerticalGroup(
            teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fNameLabelTitle2)
                                    .addComponent(tFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mNameLabelTitle2)
                                    .addComponent(tMNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lNameLabelTitle4)
                                    .addComponent(tLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dobLabelTitle)
                                    .addComponent(tDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobLabelTitle1))
                                .addGap(15, 15, 15)
                                .addGroup(teacherDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tGenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(assignedClassTitleLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                                .addComponent(tPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(tAssignedClassesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assignedClassTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAssignedSubjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teacherDetailsDisplayPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(assignedClassTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        manageTeacherControl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        editTeacher.setText("Edit");
        editTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeacherActionPerformed(evt);
            }
        });

        deleteTeacherBtn.setText("Delete");
        deleteTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeacherBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageTeacherControlLayout = new javax.swing.GroupLayout(manageTeacherControl);
        manageTeacherControl.setLayout(manageTeacherControlLayout);
        manageTeacherControlLayout.setHorizontalGroup(
            manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeacherControlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(editTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(deleteTeacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        manageTeacherControlLayout.setVerticalGroup(
            manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeacherControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(editTeacher)
                .addComponent(deleteTeacherBtn))
        );

        javax.swing.GroupLayout singleTeacherDisplayPanelLayout = new javax.swing.GroupLayout(singleTeacherDisplayPanel);
        singleTeacherDisplayPanel.setLayout(singleTeacherDisplayPanelLayout);
        singleTeacherDisplayPanelLayout.setHorizontalGroup(
            singleTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleTeacherDisplayPanelLayout.createSequentialGroup()
                .addGroup(singleTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singleTeacherDisplayPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(manageTeacherControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singleTeacherDisplayPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(teacherDetailsDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        singleTeacherDisplayPanelLayout.setVerticalGroup(
            singleTeacherDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleTeacherDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherDetailsDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageTeacherControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        teacherDisplayCard.add(singleTeacherDisplayPanel, "singleTeacherDisplay");

        multipleTeachersDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        multipleTeachersDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Teachers List"));
        multipleTeachersDisplayPanel.setName("multipleTeachersDisplay"); // NOI18N

        teacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "First Name", "Other Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        teacherTableScrollPane.setViewportView(teacherTable);

        javax.swing.GroupLayout multipleTeachersDisplayPanelLayout = new javax.swing.GroupLayout(multipleTeachersDisplayPanel);
        multipleTeachersDisplayPanel.setLayout(multipleTeachersDisplayPanelLayout);
        multipleTeachersDisplayPanelLayout.setHorizontalGroup(
            multipleTeachersDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleTeachersDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
        multipleTeachersDisplayPanelLayout.setVerticalGroup(
            multipleTeachersDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleTeachersDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teacherTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        teacherDisplayCard.add(multipleTeachersDisplayPanel, "multipleTeachersDisplay");

        editTeacherPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editTeacherPanel.setName("editTeacherPanel"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tFNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNameTextBoxActionPerformed(evt);
            }
        });
        tFNameTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFNameTextBoxFocusLost(evt);
            }
        });

        tFNameTitleLabel.setText("First Name");

        tMNameTitleLabel.setText("Middle Name");

        tLNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLNameTextBoxActionPerformed(evt);
            }
        });

        tLastNameTitleLabel.setText("Last Name");

        genderLabel1.setText("Gender");

        tGenderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGenderComboActionPerformed(evt);
            }
        });

        religionLabel1.setText("Religion");

        sReligionCombo.setEditable(true);
        tReligionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Christian", "Muslim", "Traditional" }));

        jLabel12.setText("Date of Birth");

        editControlsPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        clearButton1.setText("Clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        updateTeacherBtn.setText("Update Details");
        updateTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeacherBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editControlsPanel1Layout = new javax.swing.GroupLayout(editControlsPanel1);
        editControlsPanel1.setLayout(editControlsPanel1Layout);
        editControlsPanel1Layout.setHorizontalGroup(
            editControlsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editControlsPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateTeacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        editControlsPanel1Layout.setVerticalGroup(
            editControlsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editControlsPanel1Layout.createSequentialGroup()
                .addGroup(editControlsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTeacherBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLastNameTitleLabel)
                            .addComponent(tMNameTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tMNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tFNameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(tFNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel1)
                            .addComponent(jLabel12)
                            .addComponent(religionLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tDOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tGenderCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tReligionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addComponent(editControlsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFNameTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tFNameTextBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tMNameTitleLabel)
                    .addComponent(tMNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tLNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tLastNameTitleLabel)))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(genderLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(religionLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tReligionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGap(18, 18, 18)
                .addComponent(editControlsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        editStudentHeadLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudentBanner.png"))); // NOI18N

        javax.swing.GroupLayout editTeacherPanelLayout = new javax.swing.GroupLayout(editTeacherPanel);
        editTeacherPanel.setLayout(editTeacherPanelLayout);
        editTeacherPanelLayout.setHorizontalGroup(
            editTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editTeacherPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(editTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editStudentHeadLabel1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        editTeacherPanelLayout.setVerticalGroup(
            editTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editStudentHeadLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        teacherDisplayCard.add(editTeacherPanel, "card4");
        editTeacherPanel.getAccessibleContext().setAccessibleName("editTeacherPanel");

        javax.swing.GroupLayout manageTeacherPanelLayout = new javax.swing.GroupLayout(manageTeacherPanel);
        manageTeacherPanel.setLayout(manageTeacherPanelLayout);
        manageTeacherPanelLayout.setHorizontalGroup(
            manageTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeacherPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(manageTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tManageCotrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageTeacherHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146)
                .addComponent(teacherDisplayCard, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageTeacherPanelLayout.setVerticalGroup(
            manageTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherDisplayCard, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(manageTeacherPanelLayout.createSequentialGroup()
                        .addComponent(manageTeacherHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tManageCotrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        manageRecordsTabbedPane.addTab("Manage Teachers", manageTeacherPanel);

        jPanel58.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign Teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 204, 255))); // NOI18N

        classLevelLabel10.setText("Subject");

        classLevelLabel11.setText("Class Level");

        subClassLabel2.setText("Class Name");

        teacherCombobox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherCombobox2ItemStateChanged(evt);
            }
        });
        teacherCombobox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teacherCombobox2KeyPressed(evt);
            }
        });

        teacherLabel2.setText("Teacher");

        tClassLevelComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tClassLevelComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(subClassLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tSubClassCheckComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(teacherLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(teacherCombobox2, 0, 211, Short.MAX_VALUE))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(classLevelLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(classLevelLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tClassLevelComboBox1, 0, 211, Short.MAX_VALUE)
                            .addComponent(subjectCheckComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherCombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectCheckComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLevelLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLevelLabel11)
                    .addComponent(tClassLevelComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subClassLabel2)
                    .addComponent(tSubClassCheckComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel60.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        assignTeacherBtn1.setText("Add Teacher");
        assignTeacherBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTeacherBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(assignTeacherBtn1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignTeacherBtn1)
        );

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel6.setBackground(new java.awt.Color(238, 236, 232));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fNameLabelTitle1.setText("First Name");

        fNameLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mNameLabelTitle1.setText("Middle Name");

        mNameLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lNameLabelTitle2.setText("Last Name");

        lNameLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(185, 185, 203));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 17));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETAILS");

        lNameLabelTitle3.setText("Date Of Birth");

        lNameLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lNameLabelTitle2)
                            .addGap(46, 46, 46)
                            .addComponent(lNameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fNameLabelTitle1)
                                .addComponent(mNameLabelTitle1))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lNameLabelTitle3)
                            .addGap(33, 33, 33)
                            .addComponent(lNameLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabelTitle1)
                    .addComponent(fNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(mNameLabelTitle1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabelTitle2)
                    .addComponent(lNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameLabelTitle3)
                    .addComponent(lNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tasksandportfolio.png"))); // NOI18N

        javax.swing.GroupLayout manageClassAndSubjectPanelLayout = new javax.swing.GroupLayout(manageClassAndSubjectPanel);
        manageClassAndSubjectPanel.setLayout(manageClassAndSubjectPanelLayout);
        manageClassAndSubjectPanelLayout.setHorizontalGroup(
            manageClassAndSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageClassAndSubjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageClassAndSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageClassAndSubjectPanelLayout.setVerticalGroup(
            manageClassAndSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageClassAndSubjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageClassAndSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(226, 226, 226))
        );

        manageRecordsTabbedPane.addTab("Manage Classes and Subjects", manageClassAndSubjectPanel);

        jPanel57.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        showByClassPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 204, 255))); // NOI18N

        classLevelLabel12.setText("Class Level");

        subClassLabel1.setText("Class Name");

        sSubClassComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sSubClassComboBoxItemStateChanged(evt);
            }
        });

        sByClassLevelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sByClassLevelComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout showByClassPanelLayout = new javax.swing.GroupLayout(showByClassPanel);
        showByClassPanel.setLayout(showByClassPanelLayout);
        showByClassPanelLayout.setHorizontalGroup(
            showByClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showByClassPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(showByClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(showByClassPanelLayout.createSequentialGroup()
                        .addComponent(classLevelLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sByClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showByClassPanelLayout.createSequentialGroup()
                        .addComponent(subClassLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sSubClassComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        showByClassPanelLayout.setVerticalGroup(
            showByClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showByClassPanelLayout.createSequentialGroup()
                .addGroup(showByClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLevelLabel12)
                    .addComponent(sByClassLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(showByClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subClassLabel1)
                    .addComponent(sSubClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 204, 255))); // NOI18N

        jPanel63.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        findStudentBTn.setText("Find");
        findStudentBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findStudentBTnActionPerformed(evt);
            }
        });

        Document autoDoc = new AutoCompleteDocument(nameService, studentSearchField);
        studentSearchField.setDocument(autoDoc);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(findStudentBTn))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findStudentBTn)
                    .addComponent(studentSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        showAllStudentsBtn.setText("Show All");
        showAllStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllStudentsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(showAllStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAllStudentsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showByClassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showByClassPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        manageStudentsHeadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tasksandportfolio.png"))); // NOI18N

        studentDisplayCard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        studentDisplayCard.setLayout(new java.awt.CardLayout());

        singleStudentDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        singleStudentDisplayPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        singleStudentDisplayPanel.setName("singleStudentDisplay"); // NOI18N

        studentDetailsDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        studentDetailsDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student's Details"));

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

        sAssignedClassLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sPictureLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel1.setText("Class Assigned");

        sGenderLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        assignedClassTitleLabel3.setText("Gender");

        javax.swing.GroupLayout studentDetailsDisplayPanelLayout = new javax.swing.GroupLayout(studentDetailsDisplayPanel);
        studentDetailsDisplayPanel.setLayout(studentDetailsDisplayPanelLayout);
        studentDetailsDisplayPanelLayout.setHorizontalGroup(
            studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabelTitle3)
                            .addComponent(dobLabelTitle2)
                            .addComponent(assignedClassTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mNameLabelTitle3)
                            .addComponent(lNameLabelTitle5)
                            .addComponent(assignedClassTitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sGenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(sAssignedClassLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sMNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sFNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(sLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sDOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(sPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        studentDetailsDisplayPanelLayout.setVerticalGroup(
            studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentDetailsDisplayPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLabelTitle3))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sMNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mNameLabelTitle3))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                                .addComponent(lNameLabelTitle5)
                                .addGap(34, 34, 34)
                                .addComponent(dobLabelTitle2))
                            .addGroup(studentDetailsDisplayPanelLayout.createSequentialGroup()
                                .addComponent(sLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sAssignedClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(assignedClassTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                    .addComponent(sPictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(studentDetailsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assignedClassTitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        manageStudentControl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        editStudent.setText("Edit");
        editStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentActionPerformed(evt);
            }
        });

        deleteStudentBtn.setText("Delete");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageStudentControlLayout = new javax.swing.GroupLayout(manageStudentControl);
        manageStudentControl.setLayout(manageStudentControlLayout);
        manageStudentControlLayout.setHorizontalGroup(
            manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStudentControlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(editStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        manageStudentControlLayout.setVerticalGroup(
            manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageStudentControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageStudentControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStudent)
                    .addComponent(deleteStudentBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout singleStudentDisplayPanelLayout = new javax.swing.GroupLayout(singleStudentDisplayPanel);
        singleStudentDisplayPanel.setLayout(singleStudentDisplayPanelLayout);
        singleStudentDisplayPanelLayout.setHorizontalGroup(
            singleStudentDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleStudentDisplayPanelLayout.createSequentialGroup()
                .addGroup(singleStudentDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singleStudentDisplayPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(manageStudentControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singleStudentDisplayPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(studentDetailsDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        singleStudentDisplayPanelLayout.setVerticalGroup(
            singleStudentDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleStudentDisplayPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentDetailsDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageStudentControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );

        studentDisplayCard.add(singleStudentDisplayPanel, "singleStudentDisplay");

        multipleStudentsDisplayPanel.setBackground(new java.awt.Color(238, 236, 232));
        multipleStudentsDisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Students List"));
        multipleStudentsDisplayPanel.setName("multipleStudentsDisplay"); // NOI18N

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "First Name", "Middle Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTableScrolPanel.setViewportView(studentTable);

        javax.swing.GroupLayout multipleStudentsDisplayPanelLayout = new javax.swing.GroupLayout(multipleStudentsDisplayPanel);
        multipleStudentsDisplayPanel.setLayout(multipleStudentsDisplayPanelLayout);
        multipleStudentsDisplayPanelLayout.setHorizontalGroup(
            multipleStudentsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleStudentsDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentTableScrolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        multipleStudentsDisplayPanelLayout.setVerticalGroup(
            multipleStudentsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleStudentsDisplayPanelLayout.createSequentialGroup()
                .addComponent(studentTableScrolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        studentDisplayCard.add(multipleStudentsDisplayPanel, "multipleStudentsDisplay");

        editStudentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sFNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sFNameTextBoxActionPerformed(evt);
            }
        });
        sFNameTextBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sFNameTextBoxFocusLost(evt);
            }
        });

        jLabel5.setText("First Name");

        jLabel6.setText("Middle Name");

        sLastNameTitleLabel.setText("Last Name");

        genderLabel.setText("Gender");

        sGenderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sGenderComboActionPerformed(evt);
            }
        });

        religionLabel.setText("Religion");

        formerSchoolTitleLabel.setText("Former School");

        sReligionCombo.setEditable(true);
        sReligionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Christian", "Muslim", "Traditional" }));

        jLabel11.setText("Date of Birth");

        editControlsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        UpdateStudentBtn.setText("Update Details");
        UpdateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editControlsPanelLayout = new javax.swing.GroupLayout(editControlsPanel);
        editControlsPanel.setLayout(editControlsPanelLayout);
        editControlsPanelLayout.setHorizontalGroup(
            editControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editControlsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        editControlsPanelLayout.setVerticalGroup(
            editControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editControlsPanelLayout.createSequentialGroup()
                .addGroup(editControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStudentBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sLastNameTitleLabel)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sMNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sLNameTextBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(sFNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel)
                            .addComponent(formerSchoolTitleLabel)
                            .addComponent(jLabel11)
                            .addComponent(religionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sDOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subjectAreaTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sGenderCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sReligionCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))
                    .addComponent(editControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sFNameTextBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(sMNameTextBox, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sLNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sLastNameTitleLabel)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addGap(29, 29, 29)
                        .addComponent(religionLabel)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11)
                        .addGap(16, 16, 16)
                        .addComponent(formerSchoolTitleLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sReligionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sDOBChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subjectAreaTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(editControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        editStudentHeadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudentBanner.png"))); // NOI18N

        javax.swing.GroupLayout editStudentPanelLayout = new javax.swing.GroupLayout(editStudentPanel);
        editStudentPanel.setLayout(editStudentPanelLayout);
        editStudentPanelLayout.setHorizontalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editStudentHeadLabel, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        editStudentPanelLayout.setVerticalGroup(
            editStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editStudentHeadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        studentDisplayCard.add(editStudentPanel, "card4");

        javax.swing.GroupLayout manageStudentPanelLayout = new javax.swing.GroupLayout(manageStudentPanel);
        manageStudentPanel.setLayout(manageStudentPanelLayout);
        manageStudentPanelLayout.setHorizontalGroup(
            manageStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStudentPanelLayout.createSequentialGroup()
                .addGroup(manageStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageStudentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageStudentPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(manageStudentsHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(studentDisplayCard, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageStudentPanelLayout.setVerticalGroup(
            manageStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageStudentPanelLayout.createSequentialGroup()
                        .addComponent(studentDisplayCard, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(manageStudentPanelLayout.createSequentialGroup()
                        .addComponent(manageStudentsHeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addGap(151, 151, 151))))
        );

        manageRecordsTabbedPane.addTab("Manage Students", manageStudentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(manageRecordsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(644, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageRecordsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void assignTeacherBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTeacherBtn1ActionPerformed
		// TODO add your handling code here:}//GEN-LAST:event_assignTeacherBtn1ActionPerformed
    }
		private void tClassLevelComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tClassLevelComboBox1ItemStateChanged
		// TODO add your handling code here:}//GEN-LAST:event_tClassLevelComboBox1ItemStateChanged
    }
		private void teacherCombobox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacherCombobox2KeyPressed
		// TODO add your handling code here:}//GEN-LAST:event_teacherCombobox2KeyPressed
    }
		private void teacherCombobox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherCombobox2ItemStateChanged
		// TODO add your handling code here:}//GEN-LAST:event_teacherCombobox2ItemStateChanged
    }
		private void findTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTeacherBtnActionPerformed
                    // TODO add your handling code here:
                    CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());
                    Teacher teacher = (Teacher) teacherCombobox.getSelectedItem();
                    clearTeacherDisplayContents();
                    setTeacherDisplayView(teacher);
                    cl.show(teacherDisplayCard, "singleTeacherDisplay");
	}//GEN-LAST:event_findTeacherBtnActionPerformed

    /*
     * clears previously loaded content from subjects and classes label
     */
    private void clearTeacherDisplayContents() {
        this.tAssignedClassesLabel.setText("");
        this.tAssignedSubjectsLabel.setText("");
        this.tPictureLabel.setIcon(null); //unloading the setImage
        revalidate();
        repaint();
//		this.tPictureLabel.revalidate();// to resize and repaint label to original form
//		this.tPictureLabel.repaint();
    }

    private void clearStudentDisplayContents() {
        this.sAssignedClassLabel.setText("");
        this.tPictureLabel.setIcon(null); //unloading the setImage
//		revalidate();
//		repaint();
//		this.tPictureLabel.revalidate();// to resize and repaint label to original form
//		this.tPictureLabel.repaint();
    }

    private void setStudentDisplayView(Student student) {
        this.sFNameLabel.setText(student.getPerson().getFName());
        this.sMNameLabel.setText(student.getPerson().getMName() == null ? "" : student.getPerson().getMName());
        this.sLNameLabel.setText(student.getPerson().getLName());
        this.sDOBLabel.setText(student.getPerson().getDOB() == null ? "" : student.getPerson().getDOB().toString());
        this.sAssignedClassLabel.setText(student.getClassRoom() == null ? "Not Assigned" : student.getClassRoom().toString());
        this.sGenderLabel.setText(student.getPerson().getGender().toString());

//		 Icon defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
//		 sPictureLabel.setIcon(defaultIcon);
        if (student.getPerson().getPicture() != null) {//set's student's picture only he has one.

            ManagePicture.display(student.getPerson().getPicture(), sPictureLabel); //setting label's with student's picture 
        } else {//set a default icon for students with no pictures
            Icon defaultIcon = null;
            if (student.getPerson().getGender() == Gender.MALE) {

                defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
            } else {
                defaultIcon = new ImageIcon(getClass().getResource("/images/female_student_icon.png"));
            }
//			sPictureLabel.setIcon(defaultIcon);
//			sPictureLabel.revalidate();
//                        sPictureLabel.repaint();
        }

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
        this.tGenderLabel.setText(teacher.getStaff().getPerson().getGender().toString());

        if (teacher.getStaff().getPerson().getPicture() != null) {//set's student's picture only he has one.

            ManagePicture.display(teacher.getStaff().getPerson().getPicture(), tPictureLabel); //setting label's with student's picture 
        } else {//set a default icon for students with no pictures
            Icon defaultIcon = null;
            if (teacher.getStaff().getPerson().getGender() == Gender.MALE) {

//			 defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
                defaultIcon = new ImageIcon("/images/dfd.png");
            } else {
//			 defaultIcon = new ImageIcon(getClass().getResource("/images/female_student_icon.png"));
                defaultIcon = new ImageIcon("/images/fssemale_student_icon.png");
            }
            tPictureLabel.setIcon(defaultIcon);
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

	private void teacherComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherComboboxItemStateChanged
            Teacher teacher = (Teacher) evt.getItem();
            controller.addModel(teacher); // add the teacher model to be retrieved later.
            clearTeacherDisplayContents();
            setTeacherDisplayView(teacher);
            CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());

            cl.show(teacherDisplayCard, "singleTeacherDisplay");
	}//GEN-LAST:event_teacherComboboxItemStateChanged

	private void teacherComboboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacherComboboxKeyPressed
            // TODO add your handling code here:
	}//GEN-LAST:event_teacherComboboxKeyPressed

	private void tBySubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBySubjectComboBoxActionPerformed
		// TODO add your handling code here:
//		Subject subject = (Subject) evt.getSelectedItem();
//                
//		List<Teacher> teachers = School.getUniqueInstance().getTeachers();
//		int li_row = 0;
//		for (Teacher t : teachers) {
//			teacherTable.setValueAt(t.getId(), li_row, 0);
//			teacherTable.setValueAt(t.getStaff().getPerson().getFName(), li_row, 1);
//			teacherTable.setValueAt(t.getStaff().getPerson().getMName(), li_row, 2);
//			teacherTable.setValueAt(t.getStaff().getPerson().getLName(), li_row, 3);
//			li_row++;
//		}
//		CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());
//
//		cl.show(teacherDisplayCard, "multipleTeachersDisplay");
	}//GEN-LAST:event_tBySubjectComboBoxActionPerformed

	private void sByClassLevelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sByClassLevelComboBoxItemStateChanged
            ClassLevel cl = (ClassLevel) evt.getItem();

            deleteAllRows(studentTable); // gets rid of previous content of table

            sSubClassComboBox.removeAllItems(); // get rid of previous content of combobox
            //fills the subClass combo with classrooms of the class level and also (re)fills student table with student in classlevel.
            for (ClassRoom cr : cl.getClassRooms()) {// refill combo box with classrooms of selected classlevel. 
                List<Student> students = cr.getStudents();
                if (!students.isEmpty()) {
                    int li_row = 0;

                    for (Student s : students) {
                        studentTable.setValueAt(li_row+1, li_row, 0);
                        studentTable.setValueAt(s.getPerson().getFName(), li_row, 1);
                        studentTable.setValueAt(s.getPerson().getMName(), li_row, 2);
                        studentTable.setValueAt(s.getPerson().getLName(), li_row, 3);
                        li_row++;
                    }
                    sSubClassComboBox.addItem(cr);
                }
            }
	}//GEN-LAST:event_sByClassLevelComboBoxItemStateChanged

    public void deleteAllRows(JTable table) {
        for (int row = table.getModel().getRowCount() - 1; row >= 0; row--) {
            for(int col = table.getModel().getColumnCount()-1; col >=0; col--){
                table.setValueAt("", row, col); 
            }
        }
    }

	private void findStudentBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findStudentBTnActionPerformed
            // error checking
            if (studentSearchField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out required fields first", "Warning Message", JOptionPane.WARNING_MESSAGE);
                this.studentSearchField.requestFocus();

            } else {
                String[] names = studentSearchField.getText().split(" ");
                Query query = null;
                String fName = names[0];
                School.manager.getTransaction().begin();
                if (names.length == 1) {
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName =:fName").setParameter("fName", fName);
                } else if (names.length == 2) {
                    String lName = names[1];
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName =:fName AND s.person.lName = :lName").setParameter("fName", fName).setParameter("lName", lName);

                } else if (names.length == 3) { // if student has a middle name.
                    String mName = names[1];
                    String lName = names[2];
                    query = School.manager.createQuery("SELECT s FROM Student s WHERE s.person.fName =:fName AND s.person.lName = :lName AND s.person.mName = :mName").setParameter("fName", fName).setParameter("lName", lName).setParameter("mName", mName);
                    System.out.println("query returned: " + query.getResultList().size());
                }
                
                                    School.manager.getTransaction().commit();
                if (!query.getResultList().isEmpty()) {
                    Student student = (Student) query.getResultList().get(0);
                 
                    controller.addModel(student);// registers the found student to the controller
//			School.manager.getTransaction().commit();
                    clearStudentDisplayContents();
                    setStudentDisplayView(student);
                    CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());
                    controller.addView((AbstractViewPanel) studentDisplayCard); //registers the students display view with the controller.
                    cl.show(studentDisplayCard, "singleStudentDisplay");
                } else {

                    JOptionPane.showMessageDialog(null, "Student not found.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);

	}//GEN-LAST:event_findStudentBTnActionPerformed
        }
    }

	private void tByClassLevelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tByClassLevelComboBoxItemStateChanged
            // TODO add your handling code here:
            ClassLevel cl = (ClassLevel) evt.getItem();
            tSubClassComboBox.removeAllItems();
            for (ClassRoom cr : cl.getClassRooms()) {// refill combo box with classrooms of selected classlevel. 
                tSubClassComboBox.addItem(cr);
            }
	}//GEN-LAST:event_tByClassLevelComboBoxItemStateChanged

	private void sSubClassComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sSubClassComboBoxItemStateChanged
            ClassRoom classroom = (ClassRoom) evt.getItem();
            deleteAllRows(studentTable);
            List<Student> students = classroom.getStudents();
            int li_row = 0;
            for (Student s : students) {
                studentTable.setValueAt(li_row+1, li_row, 0);
                studentTable.setValueAt(s.getPerson().getFName(), li_row, 1);
                studentTable.setValueAt(s.getPerson().getMName(), li_row, 2);
                studentTable.setValueAt(s.getPerson().getLName(), li_row, 3);
                li_row++;
            }

            CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());

            cl.show(studentDisplayCard, "multipleStudentsDisplay");
	}//GEN-LAST:event_sSubClassComboBoxItemStateChanged

	private void showAllStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllStudentsBtnActionPerformed

            List<Student> students = School.getUniqueInstance().getStudents();
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
            CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());

            cl.show(studentDisplayCard, "multipleStudentsDisplay");
	}//GEN-LAST:event_showAllStudentsBtnActionPerformed

	private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
            try {
                School.manager.getTransaction().begin();
                Query query = School.manager.createQuery("Select s from Student s where s.person.fName = :fName AND s.person.lName = :lName").setParameter("fName", sFNameLabel.getText()).setParameter("lName", sLNameLabel.getText());
                
                School.manager.remove(query.getSingleResult());
//			int deleted = query.executeUpdate();// deletes the student from the system.	
                School.manager.getTransaction().commit();

                JOptionPane.showMessageDialog(null, "Student successfully deleted.", "Information", JOptionPane.INFORMATION_MESSAGE); // show operation success.
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unable to complete deletion process.", "WARNING MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
                School.manager.getTransaction().rollback();
            } finally { // close entity tools
                //  em.close();
                // emf.close();
            }
	}//GEN-LAST:event_deleteStudentBtnActionPerformed

	private void sFNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sFNameTextBoxActionPerformed
		// TODO add your handling code here:}//GEN-LAST:event_sFNameTextBoxActionPerformed
    }
		private void sFNameTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sFNameTextBoxFocusLost
		// TODO add your handling code here: 	}//GEN-LAST:event_sFNameTextBoxFocusLost
    }
		private void sGenderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sGenderComboActionPerformed
	}//GEN-LAST:event_sGenderComboActionPerformed
		private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

                    CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());

                    cl.show(studentDisplayCard, "singleStudentDisplay");
	}//GEN-LAST:event_cancelButtonActionPerformed

	private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
		// TODO add your handling code here: 		this.fNameTextBox.setText(""); 		this.mNameTextBox.setText(""); 		this.lNameTextBox.setText(""); 		this.gender.setSelectedItem(""); 		//this.physicalAddressTextBox.setText(""); 		//this.boxAddressTextBox.setText(""); 		this.subjectAreaTextBox.setText(""); 		// this.assignedClassCombo.setSelectedItem(""); 		//this.contactNumberTextBox.setText(""); 		//this.contactNumberTextBox.setText(""); 		this.fNameTextBox.requestFocus(); 	}//GEN-LAST:event_clearButtonActionPerformed
    }
private void UpdateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentBtnActionPerformed

    if (sFNameTextBox.getText().isEmpty() || sLNameTextBox.getText().isEmpty() || sGenderCombo.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(null, "Please fill out required fields first", "Warning Message", JOptionPane.WARNING_MESSAGE);
        this.sFNameTextBox.requestFocus();
    } else {
        String fName = sFNameTextBox.getText();
        String mName = sMNameTextBox.getText();
        String lName = sLNameTextBox.getText();
        String religion = (String) sReligionCombo.getSelectedItem();
        Gender genderOption = (Gender) sGenderCombo.getSelectedItem();
        Date dob = sDOBChooser.getDate(); //			String contactNo = contactNumberTextBox.getText(); //			Subject preferredSubject = (Subject) preferredSubjectComboBox.getSelectedItem(); 			controller.AddNewStudent(fName, mName, lName, religion, "", genderOption, dob, null); //			teacherAdmissionController.handleAddTeacher(fName, mName, lName, religion, contactNo, genderOption, dob, assignedClass, preferredSubject);}	
}//GEN-LAST:event_UpdateStudentBtnActionPerformed
    }
		private void editStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentActionPerformed
                    DefaultUpdateController updateController = new DefaultUpdateController();
                    Student student = (Student) controller.getModel(Student.class);

                    updateController.addModel(student); //adds the school model to list of registered models 

//	schoolController.displayView();
//	StudentUpdateForm studentAdmissionForm = schoolController.getStdFormView();
                    JFrame frame1 = new JFrame();
                    StudentUpdateForm studentForm = new StudentUpdateForm(frame1, "Skuul Management System", updateController, student);

                    //setting the parameters of form for editing
                    setStudFormParams(studentForm, student);
                    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                    studentForm.setLocation((screen.width - 490) / 2, ((screen.height - 650) / 2));
                    studentForm.setVisible(true);

                    // TODO : Geti it to work..currently using popup form.
                    CardLayout cl = (CardLayout) (studentDisplayCard.getLayout());

                    cl.show(studentDisplayCard, "editStudentPanel");
                    System.out.println("to be edited");
	}//GEN-LAST:event_editStudentActionPerformed

    /*
     * sets contents of update form with details to be edited.
     */
    private void setTeacherFormParams(StudentUpdateForm studentForm, Teacher teacher) {
        studentForm.getfNameTextBox().setText(teacher.getStaff().getPerson().getFName());
        studentForm.getmNameTextBox().setText(teacher.getStaff().getPerson().getMName());
        studentForm.getlNameTextBox().setText(teacher.getStaff().getPerson().getLName());
        studentForm.getDOBChooser().setDate(teacher.getStaff().getPerson().getDOB());
        studentForm.getGender().setSelectedItem(teacher.getStaff().getPerson().getGender());
         if (teacher.getStaff().getPerson().getPicture() != null) {//set's student's picture only he has one.

            ManagePicture.display(teacher.getStaff().getPerson().getPicture(), sPictureLabel); //setting label's with student's picture 
        } else {//set a default icon for students with no pictures
            Icon defaultIcon = null;
            if (teacher.getStaff().getPerson().getGender() == Gender.MALE) {

                defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
                sPictureLabel.setIcon(defaultIcon);
            } else {
                defaultIcon = new ImageIcon(getClass().getResource("/images/female_student_icon.png"));
                                sPictureLabel.setIcon(defaultIcon);

            }
         }
    
    }
    
        private void setStudFormParams(StudentUpdateForm studentForm, Student student) {
        studentForm.getfNameTextBox().setText(student.getPerson().getFName());
        studentForm.getmNameTextBox().setText(student.getPerson().getMName());
        studentForm.getlNameTextBox().setText(student.getPerson().getLName());
        studentForm.getDOBChooser().setDate(student.getPerson().getDOB());
        studentForm.getGender().setSelectedItem(student.getPerson().getGender());
         if (student.getPerson().getPicture() != null) {//set's student's picture only he has one.

            ManagePicture.display(student.getPerson().getPicture(), sPictureLabel); //setting label's with student's picture 
        } else {//set a default icon for students with no pictures
            Icon defaultIcon = null;
            if (student.getPerson().getGender() == Gender.MALE) {

                defaultIcon = new ImageIcon(getClass().getResource("/images/male_student_icon.png"));
            } else {
                defaultIcon = new ImageIcon(getClass().getResource("/images/female_student_icon.png"));
            }
         }
    
    }

	private void editTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeacherActionPerformed
 DefaultUpdateController updateController = new DefaultUpdateController();
                    Teacher teacher = (Teacher) controller.getModel(Teacher.class);

                    updateController.addModel(teacher); //adds the school model to list of registered models 

//	schoolController.displayView();
//	StudentUpdateForm studentAdmissionForm = schoolController.getStdFormView();
                    JFrame frame1 = new JFrame();
                    StudentUpdateForm studentForm = new StudentUpdateForm(frame1, "Skuul Management System", updateController, teacher);

                    //setting the parameters of form for editing
                    setTeacherFormParams(studentForm, teacher);
                    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                    studentForm.setLocation((screen.width - 490) / 2, ((screen.height - 650) / 2));
                    studentForm.setVisible(true);

            CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());
            cl.show(teacherDisplayCard, "editTeacherPanel");
	}//GEN-LAST:event_editTeacherActionPerformed

	private void deleteTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeacherBtnActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_deleteTeacherBtnActionPerformed

	private void tFNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNameTextBoxActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_tFNameTextBoxActionPerformed

	private void tFNameTextBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFNameTextBoxFocusLost
            // TODO add your handling code here:
	}//GEN-LAST:event_tFNameTextBoxFocusLost

	private void tGenderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGenderComboActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_tGenderComboActionPerformed

	private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_cancelButton1ActionPerformed

	private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_clearButton1ActionPerformed

	private void updateTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeacherBtnActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_updateTeacherBtnActionPerformed

	private void tLNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLNameTextBoxActionPerformed
            // TODO add your handling code here:
	}//GEN-LAST:event_tLNameTextBoxActionPerformed

	private void tBySubjectComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tBySubjectComboBoxItemStateChanged
            // TODO add your handling code here:
            Subject subject = (Subject) evt.getItem();
            List<Teacher> teachers = subject.getTeachers();
//		List<Teacher> teachers = School.getUniqueInstance().getTeachers();
            int li_row = 0;
            for (Teacher t : teachers) {
                teacherTable.setValueAt(li_row+1, li_row, 0);
                teacherTable.setValueAt(t.getStaff().getPerson().getFName(), li_row, 1);
                teacherTable.setValueAt(t.getStaff().getPerson().getMName(), li_row, 2);
                teacherTable.setValueAt(t.getStaff().getPerson().getLName(), li_row, 3);
                li_row++;
            }
            CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());

            cl.show(teacherDisplayCard, "multipleTeachersDisplay");
	}//GEN-LAST:event_tBySubjectComboBoxItemStateChanged

	private void showAllTeachersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllTeachersBtnActionPerformed
            //retrieves all the teachers in the school.
            List<Teacher> teachers = School.getUniqueInstance().getTeachers();
            int li_row = 0;
            if (!teachers.isEmpty()) {
                for (Teacher t : teachers) {
                    teacherTable.setValueAt(li_row+1, li_row, 0);
                    teacherTable.setValueAt(t.getStaff().getPerson().getFName(), li_row, 1);
                    teacherTable.setValueAt(t.getStaff().getPerson().getMName(), li_row, 2);
                    teacherTable.setValueAt(t.getStaff().getPerson().getLName(), li_row, 3);
                    li_row++;
                }
            }
            CardLayout cl = (CardLayout) (teacherDisplayCard.getLayout());

            cl.show(teacherDisplayCard, "multipleTeachersDisplay");
	}//GEN-LAST:event_showAllTeachersBtnActionPerformed

	private void manageRecordsTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRecordsTabbedPaneMouseClicked
            // TODO add your handling code here:
            if (manageRecordsTabbedPane.getSelectedIndex() == 1) {
                controller.addModel(School.getUniqueInstance());
                controller.addView((AbstractViewPanel) multipleTeachersDisplayPanel);
            }
	}//GEN-LAST:event_manageRecordsTabbedPaneMouseClicked
    // </editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateStudentBtn;
    private javax.swing.JButton assignTeacherBtn1;
    private javax.swing.JLabel assignedClassTitleLabel;
    private javax.swing.JLabel assignedClassTitleLabel1;
    private javax.swing.JLabel assignedClassTitleLabel2;
    private javax.swing.JLabel assignedClassTitleLabel3;
    private javax.swing.JLabel assignedClassTitleLabel4;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JLabel classLevelLabel10;
    private javax.swing.JLabel classLevelLabel11;
    private javax.swing.JLabel classLevelLabel12;
    private javax.swing.JLabel classLevelLabel13;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JButton deleteTeacherBtn;
    private javax.swing.JLabel dobLabelTitle;
    private javax.swing.JLabel dobLabelTitle1;
    private javax.swing.JLabel dobLabelTitle2;
    private javax.swing.JPanel editControlsPanel;
    private javax.swing.JPanel editControlsPanel1;
    private javax.swing.JButton editStudent;
    private javax.swing.JLabel editStudentHeadLabel;
    private javax.swing.JLabel editStudentHeadLabel1;
    private javax.swing.JPanel editStudentPanel;
    private javax.swing.JButton editTeacher;
    private javax.swing.JPanel editTeacherPanel;
    private javax.swing.JLabel fNameLabel1;
    private javax.swing.JLabel fNameLabelTitle1;
    private javax.swing.JLabel fNameLabelTitle2;
    private javax.swing.JLabel fNameLabelTitle3;
    private javax.swing.JButton findStudentBTn;
    private javax.swing.JButton findTeacherBtn;
    private javax.swing.JLabel formerSchoolTitleLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel lNameLabel2;
    private javax.swing.JLabel lNameLabel3;
    private javax.swing.JLabel lNameLabelTitle2;
    private javax.swing.JLabel lNameLabelTitle3;
    private javax.swing.JLabel lNameLabelTitle4;
    private javax.swing.JLabel lNameLabelTitle5;
    private javax.swing.JLabel mNameLabel1;
    private javax.swing.JLabel mNameLabelTitle1;
    private javax.swing.JLabel mNameLabelTitle2;
    private javax.swing.JLabel mNameLabelTitle3;
    private javax.swing.JPanel manageClassAndSubjectPanel;
    private javax.swing.JTabbedPane manageRecordsTabbedPane;
    private javax.swing.JPanel manageStudentControl;
    private javax.swing.JPanel manageStudentPanel;
    private javax.swing.JLabel manageStudentsHeadLabel;
    private javax.swing.JPanel manageTeacherControl;
    private javax.swing.JLabel manageTeacherHeadLabel;
    private javax.swing.JPanel manageTeacherPanel;
    private javax.swing.JPanel multipleStudentsDisplayPanel;
    private javax.swing.JPanel multipleTeachersDisplayPanel;
    private javax.swing.JLabel religionLabel;
    private javax.swing.JLabel religionLabel1;
    private javax.swing.JLabel sAssignedClassLabel;
    private javax.swing.JComboBox sByClassLevelComboBox;
    private com.toedter.calendar.JDateChooser sDOBChooser;
    private javax.swing.JLabel sDOBLabel;
    private javax.swing.JLabel sFNameLabel;
    private javax.swing.JTextField sFNameTextBox;
    private javax.swing.JComboBox sGenderCombo;
    private javax.swing.JLabel sGenderLabel;
    private javax.swing.JLabel sLNameLabel;
    private javax.swing.JTextField sLNameTextBox;
    private javax.swing.JLabel sLastNameTitleLabel;
    private javax.swing.JLabel sMNameLabel;
    private javax.swing.JTextField sMNameTextBox;
    private javax.swing.JLabel sPictureLabel;
    private javax.swing.JComboBox sReligionCombo;
    private javax.swing.JComboBox sSubClassComboBox;
    private javax.swing.JButton showAllStudentsBtn;
    private javax.swing.JButton showAllTeachersBtn;
    private javax.swing.JPanel showByClassPanel;
    private javax.swing.JPanel singleStudentDisplayPanel;
    private javax.swing.JPanel singleTeacherDisplayPanel;
    private javax.swing.JPanel studentDetailsDisplayPanel;
    private javax.swing.JPanel studentDisplayCard;
    private javax.swing.JTextField studentSearchField;
    private javax.swing.JTable studentTable;
    private javax.swing.JScrollPane studentTableScrolPanel;
    private javax.swing.JLabel subClassLabel1;
    private javax.swing.JLabel subClassLabel2;
    private javax.swing.JLabel subClassLabel3;
    private javax.swing.JTextField subjectAreaTextBox;
    private org.japura.gui.CheckComboBox subjectCheckComboBox1;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel tAssignedClassesLabel;
    private javax.swing.JLabel tAssignedSubjectsLabel;
    private javax.swing.JComboBox tByClassLevelComboBox;
    private javax.swing.JComboBox tBySubjectComboBox;
    private javax.swing.JComboBox tClassLevelComboBox1;
    private com.toedter.calendar.JDateChooser tDOBChooser;
    private javax.swing.JLabel tDOBLabel;
    private javax.swing.JLabel tFNameLabel;
    private javax.swing.JTextField tFNameTextBox;
    private javax.swing.JLabel tFNameTitleLabel;
    private javax.swing.JComboBox tGenderCombo;
    private javax.swing.JLabel tGenderLabel;
    private javax.swing.JLabel tLNameLabel;
    private javax.swing.JTextField tLNameTextBox;
    private javax.swing.JLabel tLastNameTitleLabel;
    private javax.swing.JLabel tMNameLabel;
    private javax.swing.JTextField tMNameTextBox;
    private javax.swing.JLabel tMNameTitleLabel;
    private javax.swing.JPanel tManageCotrol;
    private javax.swing.JLabel tPictureLabel;
    private javax.swing.JComboBox tReligionCombo;
    private javax.swing.JLabel tStatusLabel;
    private org.japura.gui.CheckComboBox tSubClassCheckComboBox1;
    private javax.swing.JComboBox tSubClassComboBox;
    private javax.swing.JComboBox teacherCombobox;
    private javax.swing.JComboBox teacherCombobox2;
    private javax.swing.JPanel teacherDetailsDisplayPanel;
    private javax.swing.JPanel teacherDisplayCard;
    private javax.swing.JLabel teacherLabel2;
    private javax.swing.JTable teacherTable;
    private javax.swing.JScrollPane teacherTableScrollPane;
    private javax.swing.JButton updateTeacherBtn;
    // End of variables declaration//GEN-END:variables
}
