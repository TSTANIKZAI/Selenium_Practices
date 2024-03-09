package com.cydeo.tests.day08_Properties_Config_Reader;

import org.testng.annotations.Test;

public class LearningProperties {
    //Java is tracking some information about our computer, Project and username etc.
    //Lets print them out.
    @Test
    public void java_properties_reading_test(){
        //Key=value
        //we pass the key, it will return us the value.
        //System.getProperty("os.name").soutv+Enter/then Run
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
