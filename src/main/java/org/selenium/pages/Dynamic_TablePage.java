package org.selenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class Dynamic_TablePage extends BaseMainClass {
	public void clickName()
	{
		driver.findElement(By.xpath("//span[text()='NAME']")).click();
	}
	public void printDynamicTable(String name, String column)
    {
		//td[contains(text(),'David S')]/following-sibling::td[]
		List<WebElement> findElements = xpaths(Xpath.getTitles);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < findElements.size(); i++) {
			list.add(findElements.get(i).getText());
		}
		
		String Xpath = "//td[contains(text(),'"+name+"')]/following-sibling::td["+Integer.toString(list.indexOf(column))+"]";
		String status = driver.findElement(By.xpath(Xpath)).getText();
		System.out.println(status);
    }
	
}
