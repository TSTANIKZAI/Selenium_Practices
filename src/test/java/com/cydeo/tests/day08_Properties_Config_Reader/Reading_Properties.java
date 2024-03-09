package com.cydeo.tests.day08_Properties_Config_Reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {
    //STEPS TO READ FROM PROPERTIES TYPE OF FILE
    @Test
    public void Reading_FromProperties_test() throws IOException {
        //1. create object of properties
        Properties properties=new Properties();
        //2. we need to open the file in the java memory using FileInputStream
        FileInputStream file=new FileInputStream("configuration.properties");
        //3. load the properties file in the properties object
        properties.load(file);
        //4.Use the "properties" object to read value from the file.
        //properties.getproperties("add key").soutv+Enter
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }
}
