package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 30.03.15.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                    "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

/*        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://google.com");

        Thread.sleep(5000);
        h.quit();*/

        Door door  = new Door(100);
        Door d2 = new Door(190);

        System.out.println("d is Opened " + door.height);
        if(door.isOpened)
            System.out.println("d is Opened");
        else
            System.out.println("d is Closed");

        door.height = 500;
        System.out.println("d height is "+door.height);
        door.close();
        if (door.isOpened)
            System.out.println("d is Ooened");
        else
            System.out.println("d is Closed");

        door.print();


    }
}
