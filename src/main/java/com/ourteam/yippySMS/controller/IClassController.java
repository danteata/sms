package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.ClassLevel;

/**
 *Interface for controller that will handle creation of class levels and classrooms
 * 
 * @author dantheta
 */
public interface IClassController {

	/*
	 * Creates a new classLevel in the school
	 * @params levelName the name of the new classlevel.
	 * @return true if classLevel is created successfully.
	 */
        public boolean handleCreateClassLevel(String levelName);

	
	/*
	 * Creates a new classroom(sub-class) under the classLevel
	 * @params classLevel the classLevel under which the new class is to be created
	 * @params className the name of the new class
	 * @params capacity the capacity of the new class
	 * @return true if classroom is created successfully
	 */
        public boolean handleCreateClassRoom(ClassLevel classLevel, String className, int capacity);
	
}
