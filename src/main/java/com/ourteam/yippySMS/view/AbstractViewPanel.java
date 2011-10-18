/*
 * AbstractViewPanel.java
 *
 *
 */

package com.ourteam.yippySMS.view;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

/**
 * This class provides the base level abstraction for views in this project. All
 * views that extend this class also extend JPanel as well as providing the 
 * modelPropertyChange() method that controllers can use to propagate model 
 * property changes.
 *
 * @author dantheta
 */

public abstract class AbstractViewPanel extends JPanel {
    
    /**
     * Called by the controller when it needs to pass along a property change 
     * from a model.
     *
     * @param evt The property change event from the model
     */
    
    public abstract void modelPropertyChange(PropertyChangeEvent evt);
    
    
}
