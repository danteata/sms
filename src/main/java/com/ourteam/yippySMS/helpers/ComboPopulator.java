package com.ourteam.yippySMS.helpers;

import java.util.List;
import javax.swing.JComboBox;
import org.japura.gui.Anchor;
import org.japura.gui.BatchSelection;
import org.japura.gui.CheckComboBox;
import org.japura.gui.EmbeddedComponent;

/**
 * This helper class populates all combo boxes with their respective collection of
 * objects for display in the various views*
 * @author dantheta
 */
public class ComboPopulator {

	public static void populateComboBox(JComboBox combo, List elements) {

		for (Object object : elements) {
			combo.addItem(object);
		}
	}
        
	/*
	 * removes previous contents of the combo box and refills it with new elements
	 * @params combo the combo box to be updated
	 * @params elements the list of elements the combo will be populated with.
	 */
        public static void syncComboBox(JComboBox combo, List elements){
            combo.removeAllItems();
            populateComboBox(combo, elements);
        }
	
	/*
	 * Populates the combobox with list of elements
	 * @params multiCombo, the checkcombo box to be filled with elements
	 * @elements the list of elements that will be used in filling check combo box.
	 */
	public static void populateMultiClassCombo(CheckComboBox multiCombo, List elements){

		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all classes selected");
		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple classes *");
		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no class selected");
		
		//loops through list of elements and adds them to the combobox.
		for (Object cl : elements){
			multiCombo.getModel().addElement(cl);
		}


		//First check item to enable conveniently checking or unchecking all elements
	        BatchSelection bs = new BatchSelection.CheckBox();
	        EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
	        multiCombo.setEmbeddedComponent(comp);	
		
	}
	
	/*
	 * Populates the combobox with list of elements
	 * @params multiCombo, the checkcombo box to be filled with elements
	 * @elements the list of elements that will be used in filling check combo box.
	 */
	public static void populateMultiSubjectsCombo(CheckComboBox multiCombo, List elements){

		multiCombo.setTextFor(CheckComboBox.CheckState.ALL, "* all subjects selected");
		multiCombo.setTextFor(CheckComboBox.CheckState.MULTIPLE, "* multiple subjects *");
		multiCombo.setTextFor(CheckComboBox.CheckState.NONE, "* no subject selected");
		
		//loops through list of elements and adds them to the combobox.
		for (Object cl : elements){
			multiCombo.getModel().addElement(cl);
		}
		
		//First check item to enable conveniently checking or unchecking all elements
		BatchSelection bs = new BatchSelection.CheckBox();
		EmbeddedComponent comp = new EmbeddedComponent(bs, Anchor.NORTH);
		multiCombo.setEmbeddedComponent(comp);
	} 
	
}
