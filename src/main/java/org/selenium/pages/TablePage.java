package org.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class TablePage extends BaseMainClass
{
	public void clickAsc() throws InterruptedException
	{
		xpath(Xpath.nameClicking).click();
		Thread.sleep(3000);
	}
    public void randomSelect()
    {
    	List<WebElement> random = xpaths("Xpath.randomcellrow");
    			for (int i = 0; i < random.size(); i++) 
    			{
    				String particular = random.get(i).getText().toString();
    				if(particular.equals("Ashley Nicolas"))
    				{
    					System.out.println(particular);
    				}
    				else
    				{
    					System.out.println("not present");
    				}
    			}
    	WebElement randomlist = xpath("//tr[@data-ri='4']");
    	String row = randomlist.getText();
    	System.out.println();
    	System.out.println("The overall details of the name given is");
    	System.out.println(row);
    	xpath("//span[@class='ui-column-title'][1]").click();
    }
    public void selectCountry(String name)
    {
    	WebElement select = xpath(Xpath.randomcellCountry.replace("{variable}", name));
    	String country = select.getText();
    	System.out.println("The country for the given name is : " +country);
    }
    public void selectRepresentative(String name)
    {
    	WebElement select = xpath(Xpath.randomcellRepresentative.replace("{variable}", name));
    	String representative = select.getText();
    	System.out.println("The Representative for the given name is : " +representative);
    }
    public void selectJoinDate(String name)
    {
    	WebElement select = xpath(Xpath.randomcellJoinDate.replace("{variable}", name));
    	String joinDate = select.getText();
    	System.out.println("The Join date for the given name is : " + joinDate);
    }
    public void selectStatus(String name)
    {
    	WebElement select = xpath(Xpath.randomcellStatus.replace("{variable}", name));
    	String status = select.getText();
    	System.out.println("The Status for the given name is : " + status);
    }
}
