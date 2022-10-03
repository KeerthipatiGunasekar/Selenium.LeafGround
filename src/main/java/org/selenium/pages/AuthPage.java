package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;

public class AuthPage extends BaseMainClass  {
	public void noteNotification()
	{
		WebElement basic = driver.findElement(By.xpath("//span[text()='Basic Auth']"));
		basic.click();
	}
}
