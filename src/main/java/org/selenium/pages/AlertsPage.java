package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;

public class AlertsPage extends BaseMainClass {

	public void alertSimpleDialog()
	{
		WebElement simple = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		simple.click();
		driver.switchTo().alert().accept();
		WebElement text = driver.findElement(By.xpath("//span[text()='You have successfully clicked an alert']"));
		String gettext = text.getText();
		System.out.println(gettext);
	}
	public void alertConfirmDialog() throws InterruptedException
	{
		WebElement confirm = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		confirm.click();
		driver.switchTo().alert().accept();
		WebElement gettext = driver.findElement(By.xpath("//span[contains(text(),'User Clicked')]"));
		String text = gettext.getText();
		System.out.println(text);
		Thread.sleep(10000);
		confirm.click();
		driver.switchTo().alert().dismiss();
		String text1 = gettext.getText();
		System.out.println(text1);
	}
	public void sweetAlertSimpleDialog()
	{
		WebElement sweet = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		sweet.click();
		driver.switchTo();
	}
}