package com.ourteam.yippySMS.view;

import java.beans.PropertyChangeEvent;

/**
 *A general purpose view to substitute JPanel usage for views that need to display properties of certain models
 * e.g. Student model.
 * 
 * @author dantheta
 */
public class DefaultVIewPanel  extends AbstractViewPanel{

	@Override
	public void modelPropertyChange(PropertyChangeEvent evt) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
