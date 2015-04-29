package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 29.04.15.
 */
public class POGoogTrans {
    public static void setTextArea(String text){

    }
    public static void clcButtTrans(){
        TestHelper.driver.findElement(By.xpath("//input[@id='gt-submit']")).click();
    }
    public static String isEmptyField(){
        String str = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']")).getAttribute("value");
        System.out.println(str);
        return str;
    }
    public static WebElement findElemById(String id){
        WebElement el = TestHelper.driver.findElement(By.xpath("//*[@id='"+ id +"']"));
        return el;
    }
}
