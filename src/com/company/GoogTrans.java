package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 29.04.15.
 */
public class GoogTrans {
    @Before
    public void doBefore(){
        TestHelper.init();
    }
    @After
    public void clean(){
        TestHelper.driver.quit();
    }
    //1 test just click button translate without data
    @Test
    public void clcButtNoData(){
        POGoogTrans.clcButtTrans();
        String rezult = POGoogTrans.isEmptyField();
        Assert.assertEquals("", rezult);
    }
    //2 test chech web-site title
    @Test
    public void checkTitle(){
        String title = TestHelper.driver.getTitle();
        Assert.assertEquals("Переводчик Google", title);
    }
    //3 test if the right field is empty
    @Test
    public void checkAllElements(){
        ArrayList<WebElement> list = new ArrayList<WebElement>();
        WebElement leftField = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
        WebElement rightField = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        WebElement buttTrans = TestHelper.driver.findElement(By.xpath("//input[@id='gt-submit']"));
    }
    //4 test chech left and right fields and button translate
    @Test
    public void checkRightFieldEmpty(){
        WebElement el = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
    }
    //5 test chech different language
    @Test
    public void checkDiffLanguage(){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        WebElement gr = TestHelper.driver.findElement(By.xpath("//div[text()='греческий']"));
        WebElement mal = TestHelper.driver.findElement(By.xpath("//div[text()='мальтийский']"));
        WebElement slov = TestHelper.driver.findElement(By.xpath("//div[text()='словацкий']"));
    }
}
