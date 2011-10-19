/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.helpers;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *Implementation not yet complete
 * @author dantheta
 */
public class Validation {

	public static IntValidationResult isInt(JTextField f, String msg) {
		IntValidationResult result = new IntValidationResult();
		try {
			result.value =
				Integer.parseInt(f.getText());
			result.isValid = true;
			return result;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(f, "Entry Error", msg, JOptionPane.ERROR_MESSAGE);
			f.requestFocus();
			result.isValid = false;
			result.value = 0;
			return result;
		}
	}
}
