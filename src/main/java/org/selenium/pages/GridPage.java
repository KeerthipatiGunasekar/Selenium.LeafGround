package org.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class GridPage extends BaseMainClass
{
	public void clickName(String name) throws InterruptedException
	{
		xpath(Xpath.selectnameGrid.replace("{variable}", name)).click();
		Thread.sleep(3000);
	}
	public Boolean printTableAll(String xpath, String xpath1, String name)
	{
    	List<WebElement> rowdetails = xpaths(xpath);
    	for (int i = 0; i < rowdetails.size(); i++) 
    	{
    		List<WebElement> celldetails = rowdetails.get(i).findElements(By.xpath(xpath1));
    		for (int j = 0; j < celldetails.size(); j++) 
    			System.out.print(celldetails.get(j).getText());
    		
    		System.out.println();
		}
		return true;
	}
}
