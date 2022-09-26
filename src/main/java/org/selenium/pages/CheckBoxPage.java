package org.selenium.pages;

import java.util.List;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;
import org.projectSelenium.testLeaf.Xpath;

public class CheckBoxPage extends BaseMainClass
{
	public void basicCheckbox()
    {
    	WebElement check = xpath(Xpath.basicCheck);
    	check.click();
    	System.out.println("Basic checkbox enabled");
    }
    public void checkNotification()
    {
    	WebElement notification = xpath(Xpath.notificationCheck);
    	notification.click();
    	if(xpath(Xpath.CheckBoxCheck).isEnabled())
    	{
    		List<WebElement> list= xpaths(Xpath.messageCheck);
    		if(list.size() > 0)
    		{
    			System.out.println("Notification received");
    		}
    		else
    		{
    			System.out.println("Notification not received");
    		}
    	}
    }
    public void multipleCheckbox()
    {
    	List <WebElement> Checkboxes =  xpaths(Xpath.clickMultiple);
        int size = Checkboxes.size();
        System.out.println(size);
        for(int i = 0; i<size; i++) 
        {
            Checkboxes.get(i).click();
        }
    }
    public void tristateCheckBox()
    {
    	WebElement check = xpath("");
    	check.click();
    	stateCheck();
    }
    public void stateCheck()
    {
    	if(xpath("").isEnabled())
    	{
    		WebElement checkState = xpath("j_idt87:id_container");
    		String get = checkState.getText();
    		System.out.println(get);
    	}
    }
    public void toggleSwitch()
    {
    	WebElement toggle = xpath(Xpath.toggles);
    	toggle.click();
    	if(toggle.isEnabled())
    	{
    		WebElement tog = xpath(Xpath.toggleMessage);
    		tog.getText();
    		System.out.println("message displayed" + tog);
    		toggle.click();
    	}
    }
}
