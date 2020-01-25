package com.it.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver getDrive() throws MalformedURLException {
        WebDriver driver;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("browserstack".equals(driverSysProperty)){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Edge");
            caps.setCapability("browser_version", "18.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            driver = new RemoteWebDriver(new URL("https://bsuser61471:nsw7SpbeWhEQBqYbvsjb@hub-cloud.browserstack.com/wd/hub"), caps);
        }
        else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        //System.out.println(driver.manage().getCookies());
        //driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.i.ua/");

        return driver;
    }
}
