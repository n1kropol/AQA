import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by n1kropol on 29.04.2015.
 */
@RunWith(JUnit4.class)
public class AngelTitleTest {
    public static WebDriver h;
    @Before
    public void doBefore(){
        TestHelper.init();
        //h = TestHelper.init();
        //System.setProperty("webdriver.chrome.driver",
        //        "C:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--lang=ru");
//        h = new ChromeDriver(options);
        //h = new ChromeDriver();
        //driver.get("http://angel.net/~nic/passwd.current.html");
        //driver.get("http://oxogamestudio.com/passwd.current2.htm");
        //driver.get("http://oxogamestudio.com/passwd.current3.htm");
        //driver.get("http://oxogamestudio.com/passwd.current4.htm");
        //driver.get("http://oxogamestudio.com/passwd.current5.htm");
        //driver.get("http://oxogamestudio.com/passwd.current6.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        //driver.get("http://oxogamestudio.com/passwd.current8.htm");
        //driver.get("http://oxogamestudio.com/passwd.current9.htm");
        //h.get("https://translate.google.com.ua/");
    }
    //checking password with filling normal data in fields
    @Test
    public void test1(){
/*        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!", "W3Hdka0clbEI+@1a", pas);*/
        TestHelper.driver.findElement(By.name("master")).sendKeys("12345678");
        TestHelper.driver.findElement(By.name("site")).sendKeys("gmail.com");
        TestHelper.driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
        Assert.assertEquals("W3Hdka0clbEI+@1a", TestHelper.driver.findElement(By.name("password")).getAttribute("value"));
    }
/*
    //checking password with filling empty master and normal data in fields
    @Test
    public void test2(){
        POGenPass.setMaster("");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","zmcHOAyf2oZm+@1a", pas);
    }
    //checking password with filling normal data in master and empty site
    @Test
    public void test3(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","9Ixm2r5Xnm41Q@1a", pas);
    }
    // checking password without filling fields, just click button generate
    @Test
    public void test4(){
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", pas);
    }
    //checking password with fields filled with 200 strings
    @Test
    public void test5(){
        String str = "";
        for (int i = 0; i < 200; i++) {
            str = str + 1;
        }
        POGenPass.setMaster(str);
        POGenPass.setSite(str);
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", pas);
    }
    //checking password with fields cpesial characters
    @Test
    public void test6(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        String pas = POGenPass.getPassword();
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", pas);
    }
    // checking label on button generate
    @Test
    public void test7(){
        WebElement td = h.findElement(By.xpath("//input[@value='Generate']"));
        String title = td.getAttribute("value");
        Assert.assertEquals("Test failed!!!","Generate", title);
    }
    // checking password by using label for edit field
    @Test
    public void test8(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        Assert.assertEquals("/';*&#&$@^!_...\\n", h.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    // checking field master is editable?
    @Test
    public void test9(){
        POGenPass.setMaster("/';*&#&$@^!_...\\n");
        POGenPass.setSite("/';*&#&$@^!_...\\n");
        POGenPass.generate();
        Assert.assertEquals("Master is not editable",true, h.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    // checking field site is editable?
    @Test
    public void test10(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        Assert.assertEquals("Site is not editable",true, h.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    // checking field password is editable?
    @Test
    public void test11(){
        POGenPass.setMaster("12345678");
        POGenPass.setSite("gmail.com");
        POGenPass.generate();
        Assert.assertEquals("Password is not editable",true, h.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    //checking label "Your master password"
    @Test
    public void test12(){
        WebElement td = h.findElement(By.xpath("//td[text()='Your master password']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Your master password", title);
    }
    //checking label "Site name"
    @Test
    public void test13(){
        WebElement td = h.findElement(By.xpath("//td[text()='Site name']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Site name", title);
    }
    //checking label "Generated password"
    @Test
    public void test14(){
        WebElement td = h.findElement(By.xpath("//td[text()='Generated password']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Generated password", title);
    }
    //checking password using methods setField and getField
    @Test
    public void test15() {
        POGenPass.setField("Your master password", "12345678");
        POGenPass.setField("Site name", "gmail.com");
        POGenPass.generate();
        String pwd = POGenPass.getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
*/
    @After
    public void clean(){
//        h.quit();
        TestHelper.driver.quit();
    }
}

