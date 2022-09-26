package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class TextBoxPage extends BaseMainClass
{
    public boolean typeInTextBox(String xpath, String value) 
    {
    	if(value.contains("TAB")) {
    		WebElement element = xpath(xpath);
    		element.sendKeys(Keys.TAB);
    	}
        WebElement element = xpath(xpath);
        element.sendKeys(value);
        return true;    
    }
    public void disabledOrEnabled()
    {
        Boolean textBox = xpath(Xpath.textdisabled).isEnabled();
        if (!textBox) {
            System.out.println("Text Box is Disabled as expected");
        }else {
            System.out.println("Text Box is Enabled");
        }
    }
    public void clearText()
    {
        xpath(Xpath.clearing).clear();
        System.out.println("Cleared the textbox");
    }
    public void textCopy()
    {
        String data = xpath(Xpath.print).getAttribute("value");
        System.out.println(data);
    }
    public void errorMessage()
    {
    	WebElement error = xpath(Xpath.messageError);
    	error.click();
    	error.sendKeys(Keys.ENTER);
    	WebElement display = driver.findElement(By.xpath(Xpath.errorNote));
    	String message = display.getText();
    	System.out.println("The error displayed is- " + message);
    }
    public void selectDropdown(String listDropdown) throws InterruptedException
    {
    	WebElement select = xpath(Xpath.dropdown);
    	select.click();
    	select.sendKeys(listDropdown);
    	Thread.sleep(5000);
    	xpath(Xpath.selectThird).click();
    	System.out.println("The sentence is selected from the dropdown");
    }
}