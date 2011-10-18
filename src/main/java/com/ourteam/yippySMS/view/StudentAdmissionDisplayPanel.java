

/*
 * StudentAdmissionDisplayPanel.java
 *
 * Created on Oct 5, 2011, 4:11:38 PM
 */
package com.ourteam.yippySMS.view;

import com.ourteam.yippySMS.controller.AbstractController;
import com.ourteam.yippySMS.controller.DefaultAdmissionController;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author dantheta
 */
public class StudentAdmissionDisplayPanel extends AbstractViewPanel {

	private AbstractController controller;
	/** Creates new form StudentAdmissionDisplayPanel */
//	public StudentAdmissionDisplayPanel() {
//		initComponents();
//	}

	public StudentAdmissionDisplayPanel(AbstractController controller){
		
		this.controller = controller;
		initComponents();
		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DOBTitleLabel = new javax.swing.JLabel();
        lNameTitleLabel = new javax.swing.JLabel();
        mNameTitleLabel = new javax.swing.JLabel();
        fNameTitleLabel = new javax.swing.JLabel();
        displayTitlePanel = new javax.swing.JPanel();
        displayTitleLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        mNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();

        DOBTitleLabel.setText("DOB");
        DOBTitleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lNameTitleLabel.setText("Last Name");
        lNameTitleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mNameTitleLabel.setText("Middle Name");
        mNameTitleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fNameTitleLabel.setText("First Name");
        fNameTitleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        displayTitlePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        displayTitleLabel.setText("PREVIEW");

        javax.swing.GroupLayout displayTitlePanelLayout = new javax.swing.GroupLayout(displayTitlePanel);
        displayTitlePanel.setLayout(displayTitlePanelLayout);
        displayTitlePanelLayout.setHorizontalGroup(
            displayTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTitlePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(displayTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        displayTitlePanelLayout.setVerticalGroup(
            displayTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayTitleLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        fNameLabel.setBorder(new javax.swing.border.MatteBorder(null));

        mNameLabel.setBorder(new javax.swing.border.MatteBorder(null));

        lNameLabel.setBorder(new javax.swing.border.MatteBorder(null));

        DOBLabel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DOBTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(lNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mNameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(mNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fNameTitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mNameTitleLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameTitleLabel)
                    .addComponent(lNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DOBTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(323, 323, 323))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel DOBTitleLabel;
    private javax.swing.JLabel displayTitleLabel;
    private javax.swing.JPanel displayTitlePanel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JLabel fNameTitleLabel;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JLabel lNameTitleLabel;
    private javax.swing.JLabel mNameLabel;
    private javax.swing.JLabel mNameTitleLabel;
    // End of variables declaration//GEN-END:variables

	@Override
	public void modelPropertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals(DefaultAdmissionController.STUDENT_FNAME_PROPERTY)){
		  String newStringValue = evt.getNewValue().toString();
            
            if (!fNameLabel.getText().equals(newStringValue))
                fNameLabel.setText(newStringValue);	
		}
	}

}