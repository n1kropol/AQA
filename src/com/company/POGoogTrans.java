package com.company;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Admin on 29.04.15.
 */
public class POGoogTrans {
    public static String inputLanguageArrow = "//div[@id='gt-sl-gms']";
    public static String outputLanguageArrow = "//div[@id='gt-tl-gms']";
    public static void clcButtTrans(){
        TestHelper.driver.findElement(By.xpath("//input[@id='gt-submit']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String getAreaValue(){
        String str = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']")).getAttribute("value");
        return str;
    }
    public static String getRightFieldVal(){
        String text = TestHelper.driver.findElement(By.xpath("//*[@id='result_box']")).getText();
        System.out.println(text);
        return text;
    }
    public static WebElement findElemById(String id){
        WebElement el = TestHelper.driver.findElement(By.xpath("//*[@id='" + id + "']"));
        return el;
    }
    public static void setTextArea(String text){
        WebElement textArea = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
        textArea.sendKeys(text);
    }
    public static void chooseLeftLang(String language){
        getElement(inputLanguageArrow).click();
        TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-sl-gms-menu']//*[text()='" + language + "']")).click();
    }
    public static WebElement getElement (String xpath){
        return TestHelper.driver.findElement(By.xpath(xpath));
    }
    public static void chooseRightLang(String language)  {
        getElement(outputLanguageArrow).click();
        WebElement lang = TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-tl-gms-menu']//*[text()='" + language + "']"));
        lang.click();
    }
}
