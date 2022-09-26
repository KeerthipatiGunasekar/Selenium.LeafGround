package org.selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class ButtonPage extends BaseMainClass
{
	public void clicking()
    {
    	WebElement click = xpath(Xpath.titleConfirm);
    	click.click();
    	String title = driver.getTitle();
    	System.err.println("confirmed the title is - " + title);
    }
    public void disabled()
    {
    	driver.get("https://www.leafground.com/button.xhtml");
    	Boolean check = xpath(Xpath.buttonDisabled).isEnabled();
    	if(!check)
    	{
    		System.out.println("the button is enabled");
    	}
    	else
    	{
    		System.out.println("the button is disabled");
    	}
    }
    public void checkPosition()
    {
    	WebElement element = xpath(Xpath.positionCheck);
    	org.openqa.selenium.Point point = element.getLocation();
    	double xcord = point.getX();
    	System.out.println("Position of the submit button from left side is "+xcord +" pixels");
    	int ycord = point.getY();
    	System.out.println("Position of the submit button from top side is "+ycord +" pixels");
    }
    public void checkColor()
    {
    	String color = xpath(Xpath.colorOfButton).getCssValue("color");
    	System.out.println("The color of the button - " + color);
//    	String hex = Color.getColor(color).toString();
//    	System.out.println(hex);
    }
    public void colorChange()
    {
    	WebElement element= xpath(Xpath.changeOfColor);
    	Actions action = new Actions(driver);
    	action.moveToElement(element).perform();
    	System.out.println("Color changed");
    }
    public void clickImage()
    {
    	WebElement element = xpath(Xpath.noteImg);
    	element.click();
        WebElement i = xpath(Xpath.printImg);
        Boolean p = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
        if (p) {
           System.out.println("Logo present");
        } else {
           System.out.println("Logo not present");
        }
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//       WebElement clickEmpty = driver.findElement(By.xpath(Xpath.emptyPlaceClick));
//       clickEmpty.click();
    }
}

