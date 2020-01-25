package com.it.pages;

import com.it.drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BasePage {
    static protected WebDriver driver;

    static {
        try {
            driver = DriverFactory.getDrive();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

//    static {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        System.out.println(driver.manage().getCookies());
//        driver.manage().window().fullscreen();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //driver.switchTo().activeElement();//switchTo - working with iframe
//        driver.get("https://www.i.ua/");
//    }

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
