package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 18.05.15.
 */
public class POUzGovUa {

    public static WebElement findElemById(String id){
        WebElement el = TestHelperUzGovUa.driver.findElement(By.xpath("//*[@id='" + id + "']"));
        return el;
    }
    public static void from(String str){
        WebElement str1 = TestHelperUzGovUa.driver.findElement(By.xpath("//*[text()='Откуда']/following::input[1]"));
        str1.sendKeys(str);
        Boolean isPresent = TestHelperUzGovUa.driver.findElements(By.xpath("//div[@class='autosuggest']/div[@title='" + str + "']")).size() > 0;
        while(!isPresent) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isPresent = TestHelperUzGovUa.driver.findElements(By.xpath("//div[@class='autosuggest']/div[@title='" + str + "']")).size() > 0;
        }
        WebElement dropDown1 = TestHelperUzGovUa.driver.findElement(By.xpath("//div[@class='autosuggest']/div[@title='" + str + "']"));
        dropDown1.click();
    }
    public static void to(String str){
        WebElement str1 = TestHelperUzGovUa.driver.findElement(By.xpath("//*[text()='Куда']/following::input[1]"));
        str1.sendKeys(str);
        Boolean isPresent = TestHelperUzGovUa.driver.findElements(By.xpath("//div[@id='stations_till' ]/div[@title='" + str + "']")).size() > 0;
        while(!isPresent) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isPresent = TestHelperUzGovUa.driver.findElements(By.xpath("//div[@id='stations_till']/div[@title='" + str + "']")).size() > 0;
        }
        WebElement dropDown1 = TestHelperUzGovUa.driver.findElement(By.xpath("//div[@id='stations_till' ]/div[@title='" + str + "']"));
        dropDown1.click();
    }
    public static void chooseCalendar(String date){
        WebElement fillDate = TestHelperUzGovUa.driver.findElement(By.xpath("//input[@id='date_dep']"));
        fillDate.clear();
        fillDate.sendKeys(date, Keys.TAB);
//        WebElement calndr = TestHelperUzGovUa.driver.findElement(By.xpath("//div[@class='rui-calendar rui-panel']//caption[text()='Июнь 2015']"));
//        //div[@class='rui-calendar rui-panel']//caption[text()='Июнь 2015']
    }
    public static void clcBut(){
        WebElement but = TestHelperUzGovUa.driver.findElement(By.xpath("//button[@name='search']"));
        but.click();
    }
}
