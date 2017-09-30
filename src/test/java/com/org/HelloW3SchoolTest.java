package com.org;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HelloW3SchoolTest extends BaseClass {

    @Test
    public void login() throws InterruptedException {

        System.out.println("=================== Hello.login test");
//        System.setProperty("webdriver.gecko.driver", "C:\\devTools\\geckodriver.exe");
        String url = "http://www.w3schools.com/";
        driver.get(url);
        Thread.sleep(5000);
//        go to bootstrap learning
        driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[5]")).click();
        Thread.sleep(5000);


    }

    @Test
    public void logout(){

        System.out.println("=================== Hello.logout test");
    }
}
