package com.ourteam.yippySMS.controller;

import com.ourteam.yippySMS.model.Administrator;
import com.ourteam.yippySMS.model.Person;
import com.ourteam.yippySMS.model.Person.Gender;
import com.ourteam.yippySMS.model.School;
import com.ourteam.yippySMS.model.Staff;
import com.ourteam.yippySMS.view.AccessControl;
import com.ourteam.yippySMS.view.SplashScreen;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.persistence.Query;

/**
 *This is the class that initializes the whole system and so contains the main class.
 * 
 * @author dantheta
 */
public class KickStarter {

	private static final SplashScreen splashScreen = new SplashScreen();
	private static Thread splashThread = new Thread(splashScreen);

	public static void main(String[] args) {
		loadSplashScreen();
//		if(!hasSchool()){
//			
//		}
		School school = School.getUniqueInstance(); //just to load persistence factory and manager while splash is loading
         if(!hasAdmin()){
		 createDefaultAdmin();
	 }
		splashScreen.dispose(); // after persistence factory has been loaded
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		AccessControl accessControlForm = new AccessControl();
		accessControlForm.setLocation((screen.width - 400) / 2, ((screen.height - 350) / 2));
		accessControlForm.setVisible(true);
	}

	private static void loadSplashScreen() {

		splashThread.start();
		while (!splashScreen.isShowing()) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
			}
		}

	}

	/*
	 * returns true if admin table has at least one record.
	 */
	private static boolean hasAdmin(){
		Query query = School.manager.createQuery("SELECT a FROM Administrator a");
		return !query.getResultList().isEmpty();
		
	}

	/*
	 * returns true if school table has at least 1 record.
	 * 
	 *
	 */
	private static boolean hasSchool(){
		Query query = School.manager.createQuery("SELECT s FROM School s");
		return !query.getResultList().isEmpty();
		
	}

	private static void createDefaultAdmin() {
		//create a new admin if just in case there is none
		School.manager.getTransaction().begin();
		Person p = School.getUniqueInstance().createNewPerson("admin", null, "admin", null, null, Gender.MALE, null);
		Staff s = new Staff();
		s.setPerson(p);
		Administrator admin = new Administrator();
		admin.setUserName("admin");
		admin.setPassword("1234");
		admin.setStaff(s);
		School.manager.persist(p);
		School.manager.persist(s);
		School.manager.persist(admin);
		School.manager.getTransaction().commit();
	}

	private static void createDefaultSchool() {
	}
}
