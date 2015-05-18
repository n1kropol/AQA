package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by n1kropol on 29.04.2015.
 */
public class TestHelperPassw {
    public static WebDriver driver;

    public static void init() {
//        /usr/local/bin/chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "C:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        //driver.get("http://oxogamestudio.com/passwd.current2.htm");
        //driver.get("http://oxogamestudio.com/passwd.current3.htm");
        //driver.get("http://oxogamestudio.com/passwd.current4.htm");
        //driver.get("http://oxogamestudio.com/passwd.current5.htm");
        //driver.get("http://oxogamestudio.com/passwd.current6.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current8.htm");
        //driver.get("http://oxogamestudio.com/passwd.current9.htm");
    }
}
