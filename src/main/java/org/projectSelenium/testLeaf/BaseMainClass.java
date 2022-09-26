package org.projectSelenium.testLeaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMainClass 
{
    public static WebDriver driver;
    public void driverLaunch(String url) 
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get(url);
    }
    public WebElement xpath(String xpath)
    {
		return driver.findElement(By.xpath(xpath));
    }
    public List<WebElement> xpaths(String xpath)
    {
    	return driver.findElements(By.xpath(xpath));
    }
}

