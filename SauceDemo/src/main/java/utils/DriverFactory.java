package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static void initDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win 11\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
         options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public static WebDriver getDriver() {
     	 return driver;
    }

    public static void quitDriver() {
    	
        if (driver != null) {
            driver.quit();
        }
    }
}
