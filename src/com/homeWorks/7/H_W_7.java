/**
 * Created by n1kropol on 15.04.2015.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/*
1. Master: "12345678", Site: "gmail.com", Expected: "W3Hdka0clbEI+@1a"
        2. Master: "", Site: "gmail.com", Expected: "zmcHOAyf2oZm+@1a"
        3. Master: "12345678", Site: "", Expected: "9Ixm2r5Xnm41Q@1a"
        4. Нажимаем Generate смотрим что пароль верньій сгенерился.
        5. 200 символов в поле Мастер, 200 в сайт, пароль верньій.
        6. В поле мастер: "/';*&#&$@^!_...\n" и в поле сайт аналогично, пароль верньій.
        7. Название кнопки == Generate.
*/
@RunWith(JUnit4.class)
public class H_W_7 {
    public WebDriver h;
    @Before
    public void doBefore(){
        System.setProperty("webdriver.chrome.driver",
                "c:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");

        h = new ChromeDriver();
        h.get("http://angel.net/~nic/passwd.current.html");
    }
    @Test
    public void test1(){
        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("12345678");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("gmail.com");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!", "W3Hdka0clbEI+@1a", pas);
    }
    @Test
    public void test2(){
        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("gmail.com");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","zmcHOAyf2oZm+@1a", pas);
    }
    @Test
    public void test3(){
        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("12345678");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","9Ixm2r5Xnm41Q@1a", pas);
    }
    @Test
    public void test4(){
        List<WebElement> list = new ArrayList<WebElement>();
        list = h.findElements(By.tagName("input"));
        list.get(2).click();
        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", pas);
    }
    @Test
    public void test5(){
        String str = "";
        // XeUk5hgOfa6L0@1a - pas for 0
        for (int i = 0; i < 200; i++) {
            str = str + 1;
        }
        WebElement master = h.findElement(By.name("master"));
        master.sendKeys(str);
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys(str);
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", pas);
    }
    @Test
    public void test6(){

        WebElement master = h.findElement(By.name("master"));
        master.sendKeys("/';*&#&$@^!_...\\n");
        master.sendKeys(Keys.ENTER);

        WebElement site  = h.findElement(By.name("site"));
        site.sendKeys("/';*&#&$@^!_...\\n");
        site.sendKeys(Keys.ENTER);

        String pas = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", pas);
    }
    @Test
    public void test7(){
    List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.tagName("input")));
    String title = list.get(2).getAttribute("value");
    Assert.assertEquals("Test failed!!!","Generate", title);
}
    @After
    public void clean(){
        h.quit();
    }


}
