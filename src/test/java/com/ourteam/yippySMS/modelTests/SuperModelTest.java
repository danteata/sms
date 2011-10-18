/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.yippySMS.modelTests;

import com.ourteam.yippySMS.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.xml.bind.annotation.XmlAttachmentRef;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.ejb.EntityManagerImpl;
import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.impl.SessionImpl;
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
public class SuperModelTest {
	
	protected static EntityManagerFactory emf;
	protected static EntityManager em;
	protected static EntityTransaction trans;
	protected static IDatabaseConnection connection;
        protected static IDataSet dataSet;
	public SuperModelTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("smsTestPU");
		em = emf.createEntityManager();
//		connection = getConnection(); //alternative approach of connecting with dbunit learnt the hard way.
		connection = new DatabaseConnection(((org.hibernate.ejb.EntityManagerImpl) em).getSession().connection());// another approach of connecting to dbunit learnt the hard way.
//		connection = new DatabaseConnection(((HibernateEntityManager) em).getSession().connection());//a 3rd approach of connecting to dbunit


//	    connection = (IDatabaseConnection)((org.hibernate.ejb.EntityManagerImpl) em).getSession().connection(); 
//		dataSet = new FlatXmlDataSet(Thread.currentThread().getContextClassLoader().getResourceAsStream("person-dataset.xml"));	
	}	

	@BeforeClass
	public static void loadDataSet() throws Exception{
		dataSet = new FlatXmlDataSet(Thread.currentThread().getContextClassLoader().getResourceAsStream("datasets/person-dataset.xml"));	
	}	

	

protected static  IDatabaseConnection getConnection() throws Exception {
			Class driverClass = Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection jdbcConnection = DriverManager.getConnection("jdbc:derby:memory:smsTest_DB", "APP", "APP");
			return new DatabaseConnection(jdbcConnection);
}
//protected IDatabaseConnection getConnection() throws Exception {
//        Class driverClass = Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//        Connection jdbcConnection = DriverManager.getConnection("jdbc:derby:memory:smsTest_DB;create=true", "APP", "APP");
//	Connection jdbcConnection = DriverManager.getConnection("jdbc:derby:memory:smsTest_DB:create=true");
//        return new DatabaseConnection(jdbcConnection);
//    }	

	/**
	 * initializes DBUnit to enable pre-populating with dataSet for testing.
	 * @throws Exception 
	 */
//	public static void initDbUnit() throws Exception{
//	    connection = (IDatabaseConnection)((org.hibernate.ejb.EntityManagerImpl) em).getSession().connection(); 
	//connection = new DatabaseConnection( ( ( HibernateEntityManager ) em ).getSession().connection(),"mikea" );
//connection = new DatabaseConnection(((HibernateEntityManager) em).getSession().connection());
	//	    connection = (DatabaseConnection)em.getDelegate();
	//	    connection.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY,
	//                        new derbyTypeFactory());
//        dataSet = new FlatXmlDataSet(Thread.currentThread().getContextClassLoader().getResourceAsStream("person-dataset.xml"));	
//	}


	@AfterClass
	public static void tearDownClass() throws Exception {
		em.close();
		emf.close();
	}
	
  @Before
  public void setUp() {
	trans = em.getTransaction();
  }
	/*
	 * Cleans the database with DbUnit
	 */
    @Before
    public void cleanDB() throws Exception {

        DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
    }
	
    /*
     * Tears down the database operation
     */
   @After
   public void tearDown() throws Exception{
	DatabaseOperation.NONE.execute(connection, dataSet);
	
   }
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void testCheckDataLoaded() throws Exception {
	  Assert.assertNotNull(dataSet);
	}	

}
