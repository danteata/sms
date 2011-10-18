/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.modelTests;

import com.ourteam.yippySMS.controller.DefaultAdmissionController;
import com.ourteam.yippySMS.model.*;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author dantheta
 */
public class StudentTest extends SuperModelTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void loadDataSet() throws Exception {
        dataSet = new FlatXmlDataSet(Thread.currentThread().getContextClassLoader().getResourceAsStream("datasets/person-dataset.xml"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdmitStudent() {

        School school = School.getUniqueInstance();
//		school.createNewPerson("dan", "a", "abban", null, null, Gender.MALE, null, em);
        Person person = new Person();
        person.setfName("danny");
        person.setlName("theta");

        trans.begin();
        em.persist(person);
        trans.commit();

        Assert.assertNotNull("ID should not be null", person.getId());
        Assert.assertTrue(true);

    }

    /*
     * tests to see if student created has the expected id generated by database.
     */
    @Test
    public void testStudentWithRightId() {

//		School school = School.getUniqueInstance();
//		school.createNewPerson("dan", "a", "abban", null, null, Gender.MALE, null, em);
        Person person = new Person();
        person.setfName("danny");
        person.setlName("theta");

        trans.begin();
        em.persist(person);
        trans.commit();

        Assert.assertEquals(person.getId(), (Long) 3L);

    }

    @Test
    public void testCreatePersonPersistsParams() {

        Person person = new Person();
        person.setfName("danny");
        person.setlName("theta");

        trans.begin();
        em.persist(person);
        trans.commit();

        Assert.assertEquals(person.getFName(), "danny");

    }
    
        @Test
    public void testAddStudent() {
        DefaultAdmissionController admissionCtl = new DefaultAdmissionController();
        boolean addStatus = admissionCtl.handleAddStudent("Test", "Add", "Student", "Christian", "0244555555", Person.Gender.MALE, new Date(), null, null);
        Assert.assertTrue("The add process should return true", addStatus);
    }
}
