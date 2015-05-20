package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 18.05.15.
 */
public class UzGovUa {
    @Before
    public void doBefore(){
        TestHelperUzGovUa.init();
    }
    @After
    public void clean(){
        TestHelperUzGovUa.driver.quit();
    }

    @Test
    public void smokeTest() {
        POUzGovUa.from("Киев");
        POUzGovUa.to("Ивано-Франковск");
        POUzGovUa.chooseCalendar("Июнь 2015", 20);
        POUzGovUa.clcBut();
        Assert.assertEquals(2,POUzGovUa.checkCountResult());
        Assert.assertEquals("043 К", POUzGovUa.checkNumTrain("043 К"));
        Assert.assertEquals("143 К", POUzGovUa.checkNumTrain("143 К"));
        POUzGovUa.checkTrainRoute("143 К");
        POUzGovUa.chooseClass("043 К", "Купе", 5, 25);
        Assert.assertEquals("212,70 грн", POUzGovUa.fillAndCheckTicket("Иванов","Иван", "212,70 грн"));
}


}
