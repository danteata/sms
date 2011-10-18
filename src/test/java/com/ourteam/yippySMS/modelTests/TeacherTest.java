package com.ourteam.yippySMS.modelTests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;

/**
 * Unit test .
 */
public class TeacherTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TeacherTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TeacherTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testEnrollTeacher()
    {
        assertTrue( true );
    }
}
