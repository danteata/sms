package com.ourteam.yippySMS.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * This class provides base level functionality for all models, including a 
 * support for a property change mechanism (using the PropertyChangeSupport class),
 * as well as a convenience method that other objects can use to reset model state.
 * @author dantheta
 */
public abstract class AbstractModel
{
    
    /**
     * Convenience class that allow others to observe changes to the model properties
     */
    protected PropertyChangeSupport propertyChangeSupport;

    /*
     * convenience class that allows model to register and listen to child models.
     */
     private transient PropertyChangeListener childModelListener; 
     
    /**
     * Default constructor. Instantiates the PropertyChangeSupport class.
     */
    public AbstractModel() {
        // initializing pcs and observer of child models.
        propertyChangeSupport = new PropertyChangeSupport(this);
        childModelListener = new ChildModelListener();
    }
    
    /**
     * Adds a property change listener to the observer list.
     * @param l The property change listener
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }
    
    /**
     * Removes a property change listener from the observer list.
     * @param l The property change listener
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
    
    
    /**
     * Fires an event to all registered listeners informing them that a property in
     * this model has changed.
     * @param propertyName The name of the property
     * @param oldValue The previous value of the property before the change
     * @param newValue The new property value after the change
     */
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
    }
        
   /**
    * Registers a child model to this model.
    */
    protected void registerChildModel(AbstractModel childModel, String propertyName) {
        childModel.addPropertyChangeListener(this.childModelListener);
    }
    
     /**
    * Listener for property change events fired from child models.
    */
    private final class ChildModelListener implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent event) {
            // This is where the bubbling happens
            propertyChangeSupport.firePropertyChange(event);
        }
        
       
    }
    
    //custom 
    public abstract class AbstractList<E> extends AbstractCollection<E> implements java.util.List<E>{
        
    }
    
    public class ListenableModelList<AbstractModel> extends AbstractList<AbstractModel> {
    private PropertyChangeListener pcl;
    
    public ListenableModelList(){
        pcl = new ChildModelListener(); 
    }
    
    @Override
   public boolean add(AbstractModel abstractModel){
        
       return super.add(abstractModel); 
      //add action listener to model ( let collection listen to model whenever added)
   }

        @Override
        public Iterator<AbstractModel> iterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public int size() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(int index, Collection<? extends AbstractModel> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public AbstractModel get(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public AbstractModel set(int index, AbstractModel element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void add(int index, AbstractModel element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public AbstractModel remove(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<AbstractModel> listIterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<AbstractModel> listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<AbstractModel> subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

  
}
    

