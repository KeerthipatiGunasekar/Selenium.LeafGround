package org.selenium.flipkart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Flipkart 
{
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])[1]")).sendKeys("8110051052");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gunasekar@30");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("Looged in successfully");

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("iphone"+Keys.ENTER);
		System.out.println("searched and entered");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		WebElement results=driver.findElement(By.xpath("//div[@class='_4rR01T']"));
//		results.click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("navigated to url");
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles.size());
//		List<String> list = new ArrayList<String>(windowHandles);
//		driver.switchTo().window(list.get(1));
//		WebElement displayresults=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//		System.out.println(displayresults.getText());
		/*
		 * String actual = driver.getCurrentUrl(); System.out.println(actual); String
		 * actual1 = driver.getTitle(); System.err.println(actual1);
		 */
		
		List<WebElement> phoneNameList =  driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		{
		for (WebElement eachPhone : phoneNameList) 
		{
			for (WebElement eachPrice  : pricelist) 
			{
				String allname= eachPhone.getText();
				String allprice = eachPrice.getText().toString();
				allprice.charAt(0);
				String replaceString=allprice.replace('₹',' ');
				
				System.out.println(allname + " - " + replaceString);
			}
		}
		
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeigh/t)");
// 
		for (int i = 0; i < phoneNameList.size(); i++) 
		{
			String particula = phoneNameList.get(i).getText().toString();
			if(particula.equals("APPLE iPhone 13 (Starlight, 128 GB)"))
			{
				System.out.println("Navigated to- " + particula);
				phoneNameList.get(i).click();
			}
		}
   }
}
		
		
		




