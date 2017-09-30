package com.org;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HelloW3SchoolTest extends BaseClass {

    @Test
    public void goToBootstrap() throws InterruptedException {

        System.out.println("=================== go To Bootstrap Learning");
//        System.setProperty("webdriver.gecko.driver", "C:\\devTools\\geckodriver.exe");
        String url = "http://www.w3schools.com/";
        driver.get(url);
        Thread.sleep(5000);
//        go to bootstrap learning
        driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[5]")).click();


    }

    @Test
    public void goToJquery() throws InterruptedException {

        System.out.println("=================== go To Jquery Learning");
//        String url = "http://www.w3schools.com/";
//        driver.get(url);
        Thread.sleep(5000);
//        go to json learning
        driver.findElement(By.xpath("//*[@id='topnav']/div/div[1]/a[9]")).click();
    }
}
