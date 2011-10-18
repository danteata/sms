/*
 * This helper class populates all comboboxes with their respective collection of
 * objects for display in the various views
 */
package com.ourteam.yippySMS.helpers;

import java.util.List;
import javax.swing.JComboBox;
import org.japura.gui.Anchor;
import org.japura.gui.BatchSelection;
import org.japura.gui.CheckComboBox;
import org.japura.gui.EmbeddedComponent;

/**
 *
 * @author dantheta
 */
public class ComboPopulator {

	public static void populateComboBox(JComboBox combo, List elements) {

		for (Object object : elements) {
			combo.addItem(object);
		}
	}
        
        public static void syncComboBox(JComboBox combo, List elements){
            combo.removeAllItems();
            populateComboBox(combo, elements);
        }
	
	public static void populateMultiClassCombo(CheckComboBox multiCombo, List elements){

		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all classes selected");
		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple classes *");
		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no class selected");
		
		for (Object cl : elements){
			multiCombo.getModel().addElement(cl);
		}

	        BatchSelection bs = new BatchSelection.CheckBox();
	        EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
	        multiCombo.setEmbeddedComponent(comp);	
		
	}
	
	public static void populateMultiSubjectsCombo(CheckComboBox multiCombo, List elements){

		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all subjects selected");
		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple subjects *");
		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no subject selected");
		
		for (Object cl : elements){
			multiCombo.getModel().addElement(cl);
		}
		
		BatchSelection bs = new BatchSelection.CheckBox();
		EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
		multiCombo.setEmbeddedComponent(comp);
	} 
	
}
