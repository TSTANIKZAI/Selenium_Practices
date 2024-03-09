package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigation {
    public static void main(String[]args) throws InterruptedException {
        //1: setup
       // WebDriverManager.chromedriver().setup();
        //2: create instance of chrome browser
        ChromeDriver driver=new ChromeDriver();
        //driver.manage().window().fullscreen();// its only for mac
        driver.manage().window().maximize();//it give the maximize the screen
        //*: stop execution for 5 seconds.
        Thread.sleep(5000);
        //3: Go to tesla home page.
        driver.get("https://www.tesla.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Thread.sleep(5000);
        //4: use navigate back() to go back.
        driver.navigate().back();
        Thread.sleep(5000);
        //5: use navigate forward() to go forward.
        driver.navigate().forward();
        Thread.sleep(5000);
        //use navigate and refresh the page
        driver.navigate().refresh();
        Thread.sleep(5000);
        //use navigate and go to open www.state.gov
        driver.navigate().to("https://www.state.gov");
        Thread.sleep(2000);
        System.out.println("driver.getTitle() = " + driver.getTitle());//driver.gettitle().soutv
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.quit();// or driver.close();

    }
}
/* /*<dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.5.3</version>
        </dependency>*///its for selenium webdriver manager setup we have to use