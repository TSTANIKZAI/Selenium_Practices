package com.cydeo.tests.day09_JavaFaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Java_Faker_Practice {
    @Test
    public void JavaFaker_Test1(){
        //Create java faker object
        Faker faker=new Faker();
        //print out a random first name using faker object
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        //print out a random last name using faker object.
        //faker.name().lastName().soutv+Enter
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.address().country() = " + faker.address().country());


    }
}
