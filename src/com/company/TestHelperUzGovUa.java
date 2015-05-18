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
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ru");
        driver = new ChromeDriver();
        driver.get("http://booking.uz.gov.ua/ru");
    }
}
