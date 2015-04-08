package com.company;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Admin on 06.04.15.
 */
@RunWith(JUnit4.class)
public class Class_04062015 {
    public WebDriver h;

    public static WebDriver getConnect(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

         return new ChromeDriver();


    }

    @Test
    public void test1(){


        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("12345678");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("gmail.com");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","W3Hdka0clbEI+@1a", pas);
        //h.quit();
    }

    @Before
    public void doBefore(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

        h = new ChromeDriver();
        h.get("http://angel.net/~nic/passwd.current.html");
    }

    @After
    public void clean(){
        h.quit();
    }

    @Test
    public void test2(){
/*        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

        h = new ChromeDriver();
        h.get("http://angel.net/~nic/passwd.current.html");*/

        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("gmail.com");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","zmcHOAyf2oZm+@1a", pas);
        //h.quit();
    }

    @Test
    public void test3(){
/*        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

        h = new ChromeDriver();
        h.get("http://angel.net/~nic/passwd.current.html");*/

        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("12345678");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","9Ixm2r5Xnm41Q@1a", pas);
        //h.quit();
    }
    /*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

        WebDriver h = new ChromeDriver();
        //h.manage().window().maximize();
        h.get("http://angel.net/~nic/passwd.current.html");
        //System.out.println(h.getTitle()); // получить заголовок
        h.findElement(By.name("master")).clear();

        System.out.println(checkPassword(test1(h, "123", "vk.com"), "PnNKCJ2BVg2Zm@1a"));
//        System.out.println(checkPassword(getWebDriver(h, "123", "vk.com"), "5XEM6FFR+M1qu@1a"));
//        System.out.println(checkPassword(getWebDriver(h, "321", "vk.com"), "fxjzWYJM93SSf@1a"));
        //System.out.println(checkPassword(getWebDriver(h, "123", "vk.com"), "Hello"));
        //System.out.println(checkPassword(getWebDriver(h, "123321", "vk.com"), getWebDriver(h, "123321", "vk.com")));
        //System.out.println(getWebDriver(h, "123", "skype.com"));
        //System.out.println(getWebDriver(h, "123", "gmail.com"));



        h.quit();

        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("12345");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("vk.com");
        site.sendKeys(Keys.ENTER);

        System.out.println(h.findElement(By.name("password")).getAttribute("value"));*//**//*


    }
    public static String checkPassword(String first, String second){

        if (first.equals(second))
            return "Test passed";

        return "Test failed";
    }

    public static String getWebDriver(WebDriver driver, String first, String second){

        driver.findElement(By.name("master")).clear();
        WebElement master = driver.findElement(By.name("master"));
        master.clear();
        master.sendKeys(first);
        master.sendKeys(Keys.ENTER);


        driver.findElement(By.name("site")).clear();
        WebElement site  = driver.findElement(By.name("site"));
        site.clear();
        site.sendKeys(second);
        site.sendKeys(Keys.ENTER);
        return driver.findElement(By.name("password")).getAttribute("value");
    }
*/
}
