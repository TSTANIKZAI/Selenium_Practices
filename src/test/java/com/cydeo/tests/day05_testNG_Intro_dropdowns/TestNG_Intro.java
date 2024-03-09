package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
     public void setupClass(){
        System.out.println(" before class running");
     }
    @AfterClass
    public void tearDownClass(){
        System.out.println("after class is running");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("-->Before method is running.....");
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("Test1 is running");
        String Actual="Apple";
        String Expected="Apple";
        Assert.assertEquals(Actual,Expected);
    }
    //Assert Equals method will compare two of the same values. if returns true, pass. false, fails.

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("djkfjds;lghds");
        String Actual="white";
        String Expected="white";
        Assert.assertTrue(Actual.equals(Expected));
    }
}

