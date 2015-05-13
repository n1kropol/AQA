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
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver",
                // "C:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ru");
        driver = new ChromeDriver(options);
        driver.get("https://translate.google.ru");
    }
}
