package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class)
public class Class_04152015 {
    public static WebDriver h;
    @Before
    public void doBefore(){
        //h = POGenPass.init();
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

//        h = new ChromeDriver();
        //h.get("http://angel.net/~nic/passwd.current.html");
        //h.get("http://oxogamestudio.com/passwd.current2.htm");
        //h.get("http://oxogamestudio.com/passwd.current3.htm");
        //h.get("http://oxogamestudio.com/passwd.current4.htm");
        //h.get("http://oxogamestudio.com/passwd.current5.htm");
        //h.get("http://oxogamestudio.com/passwd.current6.htm");
        //h.get("http://oxogamestudio.com/passwd.current7.htm");
//        h.get("http://oxogamestudio.com/passwd.current7.htm");
//        h.get("http://oxogamestudio.com/passwd.current8.htm");
//        h.get("http://oxogamestudio.com/passwd.current9.htm");
    }
    @Test
    public void test1(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        String pas = POGenPass.getPassword();

        Assert.assertEquals("Test failed!!!", "W3Hdka0clbEI+@1a", pas);

    }
    @Test
    public void test2(){
        POGenPass.setMaster("");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","zmcHOAyf2oZm+@1a", pas);
    }
    @Test
    public void test3(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","9Ixm2r5Xnm41Q@1a", pas);
    }
    @Test
    public void test4(){
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", pas);
    }
    @Test
    public void test5(){
        String str = "";
        for (int i = 0; i < 200; i++) {
            str = str + 1;
        }
        POGenPass.setMaster(str);
        POGenPass.setSite(str);
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", pas);
    }
    @Test
    public void test6(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", pas);
    }
    @Test
    public void test7(){
        WebElement td = h.findElement(By.xpath("//input[@value='Generate']"));
        String title = td.getAttribute("value");
        Assert.assertEquals("Test failed!!!","Generate", title);
    }
    @Test
    public void test8(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        Assert.assertEquals("/';*&#&$@^!_...\\n", h.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    @Test
    public void test9(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        Assert.assertEquals("Master is not editable",true, h.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    @Test
    public void test10(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        Assert.assertEquals("Site is not editable",true, h.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    @Test
    public void test11(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        Assert.assertEquals("Password is not editable",true, h.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    @Test
    public void test12(){
        WebElement td = h.findElement(By.xpath("//td[text()='Your master password']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Your master password", title);
    }
    @Test
    public void test13(){
        WebElement td = h.findElement(By.xpath("//td[text()='Site name']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Site name", title);
    }
    @Test
    public void test14(){
        WebElement td = h.findElement(By.xpath("//td[text()='Generated password']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Generated password", title);
    }

    @After
    public void clean(){
       h.quit();
    }
    @Test
    public void test15() {
        POGenPass.setField("Your master password", "12345678");
        POGenPass.setField("Site name", "gmail.com");
        POGenPass.generate();
        String pwd = POGenPass.getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
}
