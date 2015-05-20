package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Admin on 18.05.15.
 */
public class POUzGovUa {
    private static void waitForElem(String routeToEl) {
        Boolean isPresent = TestHelperUzGovUa.driver.findElements(By.xpath(routeToEl)).size() > 0;
        int count = 0;
        while (!isPresent ) {
            try {
                Thread.sleep(1000);
                count+=1000;
//                if (count > 10000)
//                    Assert.fail("Waited to long");
//                System.out.println("wait -> " + routeToEl);
                isPresent = TestHelperUzGovUa.driver.findElements(By.xpath(routeToEl)).size() > 0;
            } catch (InterruptedException e) {
                System.out.println("Problem with waitForElem function");
                e.printStackTrace();
            }
        }
    }
    public static void from(String str){
        WebElement str1 = TestHelperUzGovUa.driver.findElement(By.xpath("//*[text()='Откуда']/following::input[1]"));
        str1.sendKeys(str);
        waitForElem("//div[@class='autosuggest']/div[@title='" + str + "']");
        WebElement dropDown1 = TestHelperUzGovUa.driver.findElement(By.xpath("//div[@class='autosuggest']/div[@title='" + str + "']"));
        dropDown1.click();
    }
    public static void to(String str){
        WebElement str1 = TestHelperUzGovUa.driver.findElement(By.xpath("//*[text()='Куда']/following::input[1]"));
        str1.sendKeys(str);
        waitForElem("//div[@id='stations_till' ]/div[@title='" + str + "']");
        WebElement dropDown1 = TestHelperUzGovUa.driver.findElement(By.xpath("//div[@id='stations_till' ]/div[@title='" + str + "']"));
        dropDown1.click();
    }
    public static void chooseCalendar(String month, int date){
        TestHelperUzGovUa.driver.findElement(By.xpath("//input[@id='date_dep']")).click();
        TestHelperUzGovUa.driver.findElement(By.xpath("//table/caption[text()='"+ month +"']/following::tbody[1]/tr/td[text()='"+ date +"']")).click();
    }
    public static void clcBut(){
        WebElement but = TestHelperUzGovUa.driver.findElement(By.xpath("//button[@name='search']"));
        but.click();
    }
    public static int checkCountResult(){
        waitForElem("//table[@id='ts_res_tbl']/tbody/tr");
        List<WebElement> rez = TestHelperUzGovUa.driver.findElements(By.xpath("//table[@id='ts_res_tbl']/tbody/tr"));
        return rez.size();
    }
    public static String checkNumTrain(String find) {
        waitForElem("//table[@id='ts_res_tbl']/tbody/tr");
        List<WebElement> rez = TestHelperUzGovUa.driver.findElements(By.xpath("//table[@id='ts_res_tbl']/tbody/tr"));
        for (int i = 0; i < rez.size() ; i++) {
            String temp = rez.get(i).getText();
            temp = temp.substring(0,temp.indexOf("\n"));
            if( find.equals(temp) )
                return temp;
        }
        return "No such train";
    }
    public static void checkTrainRoute(String find){
        TestHelperUzGovUa.driver.findElement(By.xpath("//a[text()='" + find +"']")).click();
        waitForElem("//div[@class='vToolsPopup ']");
        TestHelperUzGovUa.driver.findElement(By.xpath("//a[@title='закрыть']")).click();
    }
    public static void chooseClass(String train, String type, int coacheNum, int beanch){
        waitForElem("//a[text()='"+ train +"']/following::div[@title='"+ type +"']/button");
        TestHelperUzGovUa.driver.findElement(By.xpath("//a[text()='"+ train +"']/following::div[@title='"+ type +"']/button")).click();
        waitForElem("//div[@class='vToolsPopup coachScheme']");
        TestHelperUzGovUa.driver.findElement(By.xpath("//span[@class='coaches']/a[@href='#"+ coacheNum +"']")).click();
        waitForElem("//span[@id='places']/p/a[@title='Место: "+ beanch +"']");
        TestHelperUzGovUa.driver.findElement(By.xpath("//span[@id='places']/p/a[@title='Место: "+ beanch +"']")).click();
    }
    public static String fillAndCheckTicket(String lastName, String firstName, String price){
        waitForElem("//label[text()='Фамилия']/input");
        TestHelperUzGovUa.driver.findElement(By.xpath("//label[text()='Фамилия']/input")).sendKeys(lastName);
        TestHelperUzGovUa.driver.findElement(By.xpath("//label[text()='Имя']/input")).sendKeys(firstName);
        String rezPrice = TestHelperUzGovUa.driver.findElement(By.xpath("//button/b[text()='"+ price +"']")).getText();
        return rezPrice;
    }



}
