package com.company;
import com.google.common.base.Verify;
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
    /*
    //1  Просто открьіли, нажали Транслейт, проверить что результат пустой.
    @Test
    public void clcButtNoData(){
        POGoogTrans.clcButtTrans();
        String rezult = POGoogTrans.getAreaValue();
        Assert.assertEquals("", rezult);
    }
    //2 Проверить что тайтл = Google Translate.
    @Test
    public void checkTitle(){
        String title = TestHelper.driver.getTitle();
        Assert.assertEquals("Переводчик Google", title);
    }
    //3 Проверить наличие левого и правого полей и кнопки Транслейт.
    @Test
    public void checkAllElements(){
        ArrayList<WebElement> list = new ArrayList<WebElement>();
        WebElement leftField = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
        WebElement rightField = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        WebElement buttTrans = TestHelper.driver.findElement(By.xpath("//input[@id='gt-submit']"));
    }
    //4 Проверить что в правое поле не добавляется текст.
    @Test
    public void checkRightFieldEmpty(){
        WebElement el = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
    }
    //5 Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
    @Test
    public void checkDiffLanguages(){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-sl-gms-menu']//*[text()='греческий']"));
        TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-sl-gms-menu']//*[text()='мальтийский']"));
        TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-sl-gms-menu']//*[text()='словацкий']"));
    }
    //6 Ввести Hello в левое поле, нажать Translate проверить наличие кнопки прослушки.
    @Test
    public void checkSpeakerButt(){
        POGoogTrans.setTextArea("Hello");
        POGoogTrans.clcButtTrans();
        TestHelper.driver.findElement(By.xpath("//*[@id='gt-res-listen']/span"));
    }
    //7. Открьій ссьілку https://translate.google.com/#auto/en/Hello, проверить что слева Hello, справа перевод.
    @Test
    public void checkCorrTrans(){
        TestHelper.driver.get("https://translate.google.com/#auto/en/Hello");
        POGoogTrans.chooseRightLang("русский");
        POGoogTrans.clcButtTrans();
        String text = POGoogTrans.getRightFieldVal();
        Assert.assertEquals("здравствуйте", text);
    }
    //8. Слева поставить Spanish, справа English, ввести слева Hello, нажать <>,
    @Test
    public void checkCorrSpanish() {
        POGoogTrans.chooseLeftLang("английский");
        POGoogTrans.chooseRightLang("испанский");
        POGoogTrans.setTextArea("Hello");
        POGoogTrans.clcButtTrans();
        Assert.assertEquals("¡Hola",POGoogTrans.getRightFieldVal());
    }

//    9. Вводим слева Hello, нажимаем X, проверяем что слева и справа пусто.
    @Test
    public void clcDeleteButt(){
        POGoogTrans.setTextArea("Hello");
        TestHelper.driver.findElement(By.xpath("//div[@id = 'gt-clear']")).click();
        Assert.assertEquals(POGoogTrans.getAreaValue(), POGoogTrans.getRightFieldVal());

    }
//    10. Вьібираем слева Укр, справа Китайский, вводим слева С У! Г С!, пр перевод.
    @Test
    public void checkChinese(){
        POGoogTrans.chooseLeftLang("украинский");
        POGoogTrans.chooseRightLang("китайский (традиционный)");
        POGoogTrans.setTextArea("Слава Україні! Героям Слава!");
        POGoogTrans.clcButtTrans();
        Assert.assertEquals("光榮屬於烏克蘭！光榮屬於英雄！", POGoogTrans.getRightFieldVal());
    }
*/
// 11. Открьіваем ссьілку https://translate.google.com/#uk/jw/Hello проверяем что слева вьібран Украинский язьік, справа Джаванизский, и что слева и справа "Hello"
    @Test
    public void chechUkrJawanHello(){
        TestHelper.driver.get("https://translate.google.com/#uk/jw/Hello");
        TestHelper.driver.findElement(By.xpath("//*[@id='gt-sl-sugg']/div[contains(@class, 'jfk-button-checked')]"));
        TestHelper.driver.findElement(By.xpath("//*[@id='gt-tl-sugg']/div[contains(@class, 'jfk-button-checked')]"));
        String str = POGoogTrans.getAreaValue();
        Verify.verify("Hello".equals(str));
    }
//    12. Открьіваем сайт, проверяем бьістро доступньіе кнопки язьіков слева и справа.
    @Test
    public void checkQuickButtons(){
        TestHelper.driver.findElement(By.xpath("//*[@id='gt-sl-sugg']/div"));
        TestHelper.driver.findElement(By.xpath("//*[@id='gt-sl-sugg']/div"));
    }
    

}
