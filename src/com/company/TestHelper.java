package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by n1kropol on 29.04.2015.
 */
public class TestHelper {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");
/*        System.setProperty("webdriver.chrome.driver",
                "C:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ru");
        driver = new ChromeDriver(options);
        //driver.get("http://angel.net/~nic/passwd.current.html");
        //driver.get("http://oxogamestudio.com/passwd.current2.htm");
        //driver.get("http://oxogamestudio.com/passwd.current3.htm");
        //driver.get("http://oxogamestudio.com/passwd.current4.htm");
        //driver.get("http://oxogamestudio.com/passwd.current5.htm");
        //driver.get("http://oxogamestudio.com/passwd.current6.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current8.htm");
        //driver.get("http://oxogamestudio.com/passwd.current9.htm");
        driver.get("https://translate.google.com.ua/");
    }
}
