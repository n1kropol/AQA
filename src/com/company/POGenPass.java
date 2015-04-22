package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 22.04.15.
 */
public class POGenPass {
    public static WebDriver h;
    public static WebDriver init(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");
        h = new ChromeDriver();
        //h.get("http://angel.net/~nic/passwd.current.html");
        //h.get("http://oxogamestudio.com/passwd.current2.htm");
        //h.get("http://oxogamestudio.com/passwd.current3.htm");
        //h.get("http://oxogamestudio.com/passwd.current4.htm");
        //h.get("http://oxogamestudio.com/passwd.current5.htm");
        //h.get("http://oxogamestudio.com/passwd.current6.htm");
        //h.get("http://oxogamestudio.com/passwd.current7.htm");
//        h.get("http://oxogamestudio.com/passwd.current7.htm");
//        h.get("http://oxogamestudio.com/passwd.current8.htm");
        h.get("http://oxogamestudio.com/passwd.current9.htm");
        return h;
    }
    public static void setMaster(String mast){
        //WebElement master = h.findElement(By.name("master"));
        ////td[text()='Your master password']/following::input
        WebElement master = h.findElement(By.xpath("//td[text()='Your master password']/following::input"));
        master.clear();
        master.sendKeys(mast);
        //master.sendKeys(Keys.ENTER);
    }
    public static void setSite(String siteStr){
        //WebElement site = h.findElement(By.name("site"));
        ////td[text()='Your master password']/following::input[2]
        WebElement site = h.findElement(By.xpath("//td[text()='Site name']/following::input"));
        site.clear();
        site.sendKeys(siteStr);
        // site.sendKeys(Keys.ENTER);
    }
    public static void generate() {
        try {
            while (h.findElements(By.xpath("//input[@value='Generate']")).size() <= 0) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Prompted exception " + e);
        }
        try{
            //http://www.softwaretestinghelp.com/handle-alerts-popups-selenium-webdriver-selenium-tutorial-16/
            WebElement button = h.findElement(By.xpath("//input[@value='Generate']"));
            button.click();
            Alert alert = h.switchTo().alert();
            alert.accept();

        }catch(Exception Ex){
//            WebElement button = h.findElement(By.xpath("//input[@value='Generate']"));
//            button.click();
        }
    }
    public static String getPassword() {
        String pas = h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value");
        try {
            while (h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value").isEmpty()) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e){}
        return h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value");
    }
    public static void setField(String label, String val){
        if ("Your master password".equals(label)){
            setMaster(val);
        }
        if ("Site name".equals(label)){
            setSite(val);
        }
    }
    public static String getField(String name){
        WebElement el = h.findElement(By.xpath("//td[text()='" + name + "']/following::input"));
        String pas = el.getAttribute("value");
        return pas;
    }
}
