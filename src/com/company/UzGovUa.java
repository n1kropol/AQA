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
    public void smokeTest() throws InterruptedException {
        POUzGovUa.from("Киев");
        POUzGovUa.to("Ивано-Франковск");
        POUzGovUa.chooseCalendar("20.06.2015");
        POUzGovUa.clcBut();
        Thread.sleep(5000);
//        таблица id=ts_res_tbl
    }


}
