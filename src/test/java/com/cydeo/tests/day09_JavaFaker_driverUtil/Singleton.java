package com.cydeo.tests.day09_JavaFaker_driverUtil;

public class Singleton {
    //1-Create private constructor
    private Singleton(){}
    //2-create private static String
    private static String word;//by defeault word is null
    //3-create utility method to return the 'private String' we just created
    public static String getWord(){
        if (word==null){
            System.out.println("First time call. word object is null.");
            System.out.println("Assigning value to it now.");
            word="something";
        }else {
            System.out.println("Word already has a value.");
        }
        return word;
    }

}
