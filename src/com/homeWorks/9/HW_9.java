import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class)
public class HW_9 {
    public static WebDriver h;
    @Before
    public void doBefore(){
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Documents and Settings/Admin/QA/QASource/QA/chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",
                "c:/Users/n1kropol/IdeaProjects/libs/chromedriver.exe");

        h = new ChromeDriver();
        //h.get("http://angel.net/~nic/passwd.current.html");
        //h.get("http://oxogamestudio.com/passwd.current2.htm");
        //h.get("http://oxogamestudio.com/passwd.current3.htm");
        //h.get("http://oxogamestudio.com/passwd.current4.htm");
        //h.get("http://oxogamestudio.com/passwd.current5.htm");
        //h.get("http://oxogamestudio.com/passwd.current6.htm");
//        h.get("http://oxogamestudio.com/passwd.current7.htm");
//        h.get("http://oxogamestudio.com/passwd.current8.htm");
        h.get("http://oxogamestudio.com/passwd.current9.htm");

/*        setField("Your master password", "12345678");
        setField("Site name", "gmail.com");
        generate();
        String pwd = getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);*/
    }
    @Test
    public void test01(){
        setMaster("12345678");
        setSite("gmail.com");
        generate();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!", "W3Hdka0clbEI+@1a", pas);

    }
    @Test
    public void test02(){
        setMaster("");
        setSite("gmail.com");
        generate();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!","zmcHOAyf2oZm+@1a", pas);
    }
    @Test
    public void test03(){
        setMaster("12345678");
        setSite("");
        generate();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!","9Ixm2r5Xnm41Q@1a", pas);
    }
    @Test
    public void test04(){
        List<WebElement> list = new ArrayList<WebElement>();
        list = h.findElements(By.tagName("input"));
        list.get(2).click();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", pas);
    }
    @Test
    public void test05(){
        String str = "";
        for (int i = 0; i < 200; i++) {
            str = str + 1;
        }
        setMaster(str);
        setSite(str);
        generate();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", pas);
    }
    @Test
    public void test06(){

        setMaster("/';*&#&$@^!_...\\n");
        setSite("/';*&#&$@^!_...\\n");
        generate();
        String pas = getPassword();
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", pas);
    }
    @Test
    public void test07(){
        try {
            while (h.findElements(By.xpath("//input[@value='Generate']")).size() <= 0) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e){
            System.out.println("Throw exception: "+e);
        }

        WebElement td = h.findElement(By.xpath("//input[@value='Generate']"));
        String title = td.getAttribute("value");
        Assert.assertEquals("Test failed!!!","Generate", title);
    }
    @Test
    public void test08(){
        setMaster("/';*&#&$@^!_...\\n");
        setSite("/';*&#&$@^!_...\\n");
        generate();
        //    //td[text()='Site name']/following::input
        Assert.assertEquals("/';*&#&$@^!_...\\n", h.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    @Test
    public void test09(){
        setMaster("/';*&#&$@^!_...\\n");
        setSite("/';*&#&$@^!_...\\n");
        generate();
        //    //td[text()='Your master password']/following::input
        Assert.assertEquals("Master is not editable",true, h.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    @Test
    public void test10(){
        setMaster("12345678");
        setSite("gmail.com");
        generate();
        //   //td[text()='Your master password']/following::input
        Assert.assertEquals("Site is not editable",true, h.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    @Test
    public void test11(){
        setMaster("12345678");
        setSite("gmail.com");
        generate();
        Assert.assertEquals("Password is not editable",true, h.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    @Test
    public void test12(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.tagName("td")));
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Your master password']")));
        WebElement td = h.findElement(By.xpath("//td[text()='Your master password']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Your master password", title);
    }
    @Test
    public void test13(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Site name']")));
        WebElement td = h.findElement(By.xpath("//td[text()='Site name']"));
        String title = td.getText();
        Assert.assertEquals("Test failed!!!","Site name", title);
    }
    @Test
    public void test14(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Your master password']")));
        WebElement td = h.findElement(By.xpath("//td[text()='Generated password']"));
        String title = td.getText();
        //String title = list.get(5).getText();
        Assert.assertEquals("Test failed!!!","Generated password", title);
    }
    @Test
    public void test15() {
        setField("Your master password", "12345678");
        setField("Site name", "gmail.com");
        generate();
        String pwd = getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
    @After
    public void clean(){
        h.quit();
    }

    public void setMaster(String mast){
        //WebElement master = h.findElement(By.name("master"));
        ////td[text()='Your master password']/following::input
        WebElement master = h.findElement(By.xpath("//td[text()='Your master password']/following::input"));
        master.clear();
        master.sendKeys(mast);
        //master.sendKeys(Keys.ENTER);
    }
    public void setSite(String siteStr){
        //WebElement site = h.findElement(By.name("site"));
        ////td[text()='Your master password']/following::input[2]
        WebElement site = h.findElement(By.xpath("//td[text()='Site name']/following::input"));
        site.clear();
        site.sendKeys(siteStr);
        // site.sendKeys(Keys.ENTER);
    }
    public void generate() {
        try {
            while (h.findElements(By.xpath("//input[@value='Generate']")).size() <= 0) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e)
        {
            System.out.println("Prompted exception " + e);
        }
        try{
            //http://www.softwaretestinghelp.com/handle-alerts-popups-selenium-webdriver-selenium-tutorial-16/
            WebElement button = h.findElement(By.xpath("//input[@value='Generate']"));
            button.click();
            Alert alert = h.switchTo().alert();
            alert.accept();

        }catch(Exception Ex){
//            WebElement button = h.findElement(By.xpath("//input[@value='Generate']"));
//            button.click();
        }
    }
    public String getPassword() {
        String pas = h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value");
        try {
            while (h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value").isEmpty()) {
                Thread.sleep(3000);
            }
        } catch(InterruptedException e){}
        return h.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value");
    }
    public void setField(String label, String val){
        if ("Your master password".equals(label)){
            setMaster(val);
        }
        if ("Site name".equals(label)){
            setSite(val);
        }
    }
    public String getField(String name){
        WebElement el = h.findElement(By.xpath("//td[text()='" + name + "']/following::input"));
        String pas = el.getAttribute("value");
        return pas;
    }
}
