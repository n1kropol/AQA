package com.company;
/**
 * Created by n1kropol on 29.04.2015.
 */


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 22.04.15.
 */

public class POGenPass {

    public static void setMaster(String mast){
        WebElement master = TestHelper.driver.findElement(By.xpath("//td[text()='Your master password']/following::input[1]"));
        master.clear();
        master.sendKeys(mast);
    }
    public static void setSite(String siteStr){
        WebElement site = TestHelper.driver.findElement(By.xpath("//td[text()='Site name']/following::input[1]"));
        site.clear();
        site.sendKeys(siteStr);
    }
    public static void generate() {
        try {
            while (TestHelper.driver.findElements(By.xpath("//input[@value='Generate']")).size() <= 0) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Prompted exception " + e);
        }
        try{
            //http://www.softwaretestinghelp.com/handle-alerts-popups-selenium-webdriver-selenium-tutorial-16/
            WebElement button = TestHelper.driver.findElement(By.xpath("//input[@value='Generate']"));
            button.click();
            Alert alert = TestHelper.driver.switchTo().alert();
            alert.accept();

        }catch(Exception Ex){
        }
    }
    public static String getPassword() {
        String pas = TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']/following::input[1]")).getAttribute("value");
        try {
            while (TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']/following::input[1]")).getAttribute("value").isEmpty()) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e){}
        return TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']/following::input[1]")).getAttribute("value");
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
        WebElement el = TestHelper.driver.findElement(By.xpath("//td[text()='" + name + "']/following::input[1]"));
        String pas = el.getAttribute("value");
        return pas;
    }


}
