/**
 * Created by n1kropol on 29.04.2015.
 */
//package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 22.04.15.
 */

public class POGenPass {
    public static WebDriver h = AngelTitleTest.h;

    public static void setMaster(String mast){
        WebElement master = h.findElement(By.xpath("//td[text()='Your master password']/following::input"));
        master.clear();
        master.sendKeys(mast);
    }
    public static void setSite(String siteStr){
        WebElement site = h.findElement(By.xpath("//td[text()='Site name']/following::input"));
        site.clear();
        site.sendKeys(siteStr);
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
