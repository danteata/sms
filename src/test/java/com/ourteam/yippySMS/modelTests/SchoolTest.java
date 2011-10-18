/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.modelTests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author dantheta
 */
public class SchoolTest {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction trans;
	public SchoolTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("smsTestPU");
		em = emf.createEntityManager();
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		em.close();
		emf.close();
	}
	
	@Before
	public void setUp() {
		trans = em.getTransaction();
	}
	
	@After
	public void tearDown() {
	}
}
