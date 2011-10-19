/*
 * AbstractController.java
 *
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.AbstractModel;
import com.ourteam.yippySMS.model.ClassRoom;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.view.AbstractViewPanel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

/**
 * This class provides base level functionality for each controller. This includes the
 * ability to register multiple models and views, propagating model change events to
 * each of the views, and providing a utility function to broadcast model property
 * changes when necessary.
 * @author dantheta 
 */
public abstract class AbstractController implements PropertyChangeListener {
    
    //  Holds a list of the registered models and views for this controller.
    
    private ArrayList<AbstractViewPanel> registeredViews;
    private ArrayList<AbstractModel> registeredModels;
    
    
    /** Creates a new instance of Controller */
    public AbstractController() {
	    //initialising lists of observers
        registeredViews = new ArrayList<AbstractViewPanel>();
        registeredModels = new ArrayList<AbstractModel>();
    }
    
    /**
     * Binds a model to this controller. Once added, the controller will listen for all 
     * model property changes and propagate them on to registered views. In addition,
     * it is also responsible for resetting the model properties when a view changes
     * state.
     * @param model The model to be added
     */
    public void addModel(AbstractModel model) {
	    removeOldInstance(model); //tries to remove old models of the same type as model if any, before adding the new model
        registeredModels.add(model);
        model.addPropertyChangeListener(this); //the controller inturn registers itself with the model to receive updates and change registered views
    }

    /**
     * Unbinds a model from this controller.
     * @param model The model to be removed
     */
    public void removeModel(AbstractModel model) {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }

    /*
     * returns true if controller already has a model of the type provided as a parameter
     * @params model the model being checked for similar type
     * @return true if a model of same type is spotted in list of models.
     */
    public boolean hasModel(AbstractModel model){
	   for(AbstractModel aModel : this.registeredModels){ //loops through all models and checks if any is of the same class as specified one.
		   if(aModel.getClass().isInstance(model)){
			   return true;
		   }
	   } 
	   return false;
    }

    /*
     * Removes any previously registered model of the type specified as parameter
     * @params model the model used for comparison before unregistering models.
     */
    public void removeOldInstance(AbstractModel model){
	   for(AbstractModel aModel : this.registeredModels){ //loops through all models and checks if any is of the same class as specified one.
		   if(aModel.getClass().isInstance(model)){
			   removeModel(aModel);
			   break; //to avoid concurrent modification error after model removal
		   }
	   } 

    }
    
    /*
     * retrieves the the right model from the list of registered models.
     */
    public AbstractModel getModel(Class aModelClass){
	   for(AbstractModel aModel : this.registeredModels){
		   if(aModelClass.isInstance(aModel)){
			   return aModel;
		   }
	   } 
	   return null;
    }
    
    /*
     * swaps a new model object for an old registered model object.
     * @params
     */
    public void swapModel(Class aModelClass, AbstractModel newModel){
        for(AbstractModel aModel : this.registeredModels){ //loops through registered models and unregister any  that of the same type as the new model.
            if(aModelClass.isInstance(aModel)){
                removeModel(aModel);
            }
        }
        addModel(newModel);
    }
    
    /**
     * Binds a view to this controller. The controller will propogate all model property
     * changes to each view for consideration.
     * @param view The view to be added
     */
    public void addView(AbstractViewPanel view) {
        registeredViews.add(view);
    }

    /**
     * Unbinds a view from this controller.
     * @param view The view to be removed
     */
    public void removeView(AbstractViewPanel view) {
        registeredViews.remove(view);
    }



    //  Used to observe property changes from registered models and propogate
    //  them on to all the views.
    
    /**
     * This method is used to implement the PropertyChangeListener interface. Any model
     * changes will be sent to this controller through the use of this method.
     * @param evt An object that describes the model's property change.
     */
    public void propertyChange(PropertyChangeEvent evt) {
        
        for (AbstractViewPanel view: registeredViews) {
            view.modelPropertyChange(evt);
        }
    }
    
    
    /**
     * Convienence method that subclasses can call upon to fire off property changes
     * back to the models. This method used reflection to inspect each of the model
     * classes to determine if it is the owner of the property in question. If it
     * isn't, a NoSuchMethodException is throws (which the method ignores).
     *
     * @param propertyName The name of the property
     * @param newValue An object that represents the new value of the property.
     */
    protected void setModelProperty(String propertyName, Object newValue) {
        
        for (AbstractModel model: registeredModels) {
            try {
                
                Method method = model.getClass().
                    getMethod("set"+propertyName, new Class[] {
                                                      newValue.getClass()
                                                  }
                             );
                method.invoke(model, newValue);
                
            } catch (Exception ex) {
                //  Handle exception
            }
        }
    }

   
    
}
