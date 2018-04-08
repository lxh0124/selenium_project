package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.Config;
import util.ScreenshotCapture;

public class SeleniumTest {

    @Test
    public void test() throws Exception {
        

        WebDriver driver = Config.getWebDriver();
        
        driver.manage().window().maximize();

        driver.get("http://cn.bing.com");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
        element.sendKeys("Tony");
        element.submit();

        System.out.println(driver.getTitle());

        ScreenshotCapture.takeScreen(driver);

        driver.quit();
    }
}
