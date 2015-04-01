package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 30.03.15.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                    "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");

        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://google.com");
        System.out.println(h.getTitle()); // получить заголовок

        WebElement s = h.findElement(By.name("q"));
        s.sendKeys("qa factory");
        s.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement rso = h.findElement(By.id("rso"));
        WebElement f = rso.findElement(By.tagName("a"));
        System.out.println(f.getText());
        List<WebElement> as = (List<WebElement>) rso.findElements(By.tagName("a"));
        for (int i = 0; i < as.size(); i++){
            WebElement cur = as.get(i);
            System.out.println(cur.getText());
            System.out.println(cur.getAttribute("href"));
        }
        s.clear();
        s.sendKeys("angel sha1");
        h.findElement(By.name("btnG")).click();


        //Thread.sleep(5000);
        //h.quit();

/*
        Door door  = new Door(100);
        Door d2 = new Door(190);

door.print();

        door.height = 500;
        System.out.println("d height is "+door.height);
        door.close();
        if (door.isOpened)
            System.out.println("d is Ooened");
        else
            System.out.println("d is Closed");

        door.print();
*/


    }
}
