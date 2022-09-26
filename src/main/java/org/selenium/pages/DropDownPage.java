package org.selenium.pages;

import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class DropDownPage extends BaseMainClass
{
	public Boolean clickButton(String xpath)
	{
		WebElement element = xpath(xpath);
		element.click();
		return true;
	}
	public void toolSelect() throws InterruptedException
    {
		clickButton(Xpath.selectTools);
    	clickOptions("Selenium");
    }
    public void countrySelect() throws InterruptedException
    {
    	clickButton(Xpath.selectCountry);
        clickOptions("India");
        Thread.sleep(2000);
        System.out.println("Country is selected");
    }
    public void clickOptions(String option) throws InterruptedException
    {
    	if(option.contains("Bengaluru")) 
        	clickButton(Xpath.optionSelect.replace("{variable}", option));
        else if (option.contains("India")) 
        	clickButton(Xpath.optionSelect.replace("{variable}", option));
        else if (option.contains("Selenium")) 
        	clickButton(Xpath.selectTooloption);
     }
    public void citiesSelect() throws InterruptedException
    {
    	clickButton(Xpath.selectCity);
        clickOptions("Bengaluru");
        System.out.println("City is selected");
    }

}
