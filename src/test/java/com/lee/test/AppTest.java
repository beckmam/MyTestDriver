package com.lee.test;

import org.testng.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    @org.testng.annotations.Test
    public void testApp_failed()
    {
    	System.out.println("1不等于2，运行失败！");
    	Assert.assertEquals(1,2);
    	
    }
    
    @org.testng.annotations.Test
    public void testApp_pass()
    {
    	System.out.println("1等于1，运行通过！");
    	Assert.assertEquals(1,1);
    	
    }
}
