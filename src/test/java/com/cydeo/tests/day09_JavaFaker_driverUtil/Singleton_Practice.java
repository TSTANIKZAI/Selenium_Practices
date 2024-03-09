package com.cydeo.tests.day09_JavaFaker_driverUtil;

import org.testng.annotations.Test;

public class Singleton_Practice {
    @Test
    public void SingletonUnderstanding_Test1(){
        String str1=Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2=Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3=Singleton.getWord();
        System.out.println("str3 = " + str3);
    }

}
