import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n1kropol on 15.04.2015.
 */
public class H_W_7_2 {
    public static WebDriver h;
    public static void master(String mas){
        WebElement master = h.findElement(By.name("master"));
        master.clear();
        master.sendKeys(mas);
        master.sendKeys(Keys.ENTER);
    }
    public static String master(){
        return h.findElement(By.name("master")).getAttribute("value");
    }
    public static void site(String siteStr){
        WebElement site  = h.findElement(By.name("site"));
        site.clear();
        site.sendKeys(siteStr);
        site.sendKeys(Keys.ENTER);
    }
    public static String site(){
        return h.findElement(By.name("site")).getAttribute("value");
    }
    public static void generate(){
        List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.tagName("input")));
        list.get(2).click();
    }
    public static String password(){
        String pas = h.findElement(By.name("password")).getAttribute("value");
        return pas;
    }
    public static String title(){
        return h.getTitle();
    }
    public static String button(){
        List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.tagName("input")));
        return list.get(2).getAttribute("value");
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");
        h = new ChromeDriver();
        h.get("http://angel.net/~nic/passwd.current.html");

        master("12345678");
        site("gmail.com");
        generate();
        System.out.println(password());
        // W3Hdka0clbEI+@1a

        master("12345678");
        site("gmail.com");
        generate();
        System.out.println(password());
        // W3Hdka0clbEI+@1a
        System.out.println(master());
        // 12345678
        System.out.println(site());
        // gmail.com
        System.out.println(title());
        // Password generator
        System.out.println(button());
        // Generate
        site("");
        generate();
        System.out.println(password());
        // 9Ixm2r5Xnm41Q@1a
        h.quit();
    }
}
