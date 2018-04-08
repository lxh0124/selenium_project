package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {

    public static WebDriver getWebDriver() {
        return getChromeDriver();
    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }

}
