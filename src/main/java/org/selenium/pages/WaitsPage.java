package org.selenium.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.projectSelenium.testLeaf.BaseMainClass;

public class WaitsPage extends BaseMainClass {
	WebDriverWait waiting =new WebDriverWait(driver,Duration.ofSeconds(15));

	public void visibility() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		WebElement visible=waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		System.out.println(visible.getText());

	}
	public void invisibility()
	{
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		boolean invisible=waiting.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(invisible);
	}
	public void textChange() {
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		Boolean textChange = waiting.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='Did you notice?']"), "Did you notice?"));
		System.out.println(textChange);
	}
}
