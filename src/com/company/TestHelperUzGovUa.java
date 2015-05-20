package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Admin on 18.05.15.
 */
public class TestHelperUzGovUa {
    public static WebDriver driver;

    public static void init() {
//        System.setProperty("webdriver.chrome.driver",
//                "D:/Aquarius/selenium/chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ru");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("http://booking.uz.gov.ua/ru");
    }
}
