package org.selenium.leafground;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Leafground 
{
//	private static final Boolean JavascriptExecutor = null;
	static WebDriver driver;
//	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://www.google.com");
           driver.get("https://leafground.com/");
                
           driver.get("https://www.leafground.com/input.xhtml");
           try 
           {
			Thread.sleep(400);
		   } 
           catch (InterruptedException e) 
           {
			e.printStackTrace();
           }
           System.out.println("Items in using textbox");
           textName("Gunasekar");
           cityName("Tiruttani");
           disabledOrEnabled();
           clearText();
           textCopy();
           usingTab("gunasekarkeerthipati@gmail.com");
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
            errorMessage();
            try {
				selectDropdown("xpath");
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
            
            driver.get("https://www.leafground.com/button.xhtml");
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("items in using Button");
            clicking();
            driver.get("https://www.leafground.com/button.xhtml");
            disabled();
            checkPosition();
            checkColor();
            colorChange();
            clickImage();
            
            driver.get("https://leafground.com/select.xhtml");
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Items in using Dropdown");
            toolSelect();
            countrySelect();
            Thread.sleep(3000);
            citiesSelect();
            
            System.out.println("Items in using Checkbox");
            driver.get("https://leafground.com/checkbox.xhtml");
            basicCheckbox();
            checkNotification();
            multipleCheckbox();
            Thread.sleep(5000);
//            tristateCheckBox();
            toggleSwitch();
            
            driver.get("https://leafground.com/table.xhtml");
            tablePrint();
            randomSelect();
            Thread.sleep(5000);
            selectCountry("Aika");
            selectRepresentative("Aika");
            selectJoinDate("Aika");
            selectStatus("Aika");
            
            Thread.sleep(3000);
            driver.get("https://leafground.com/grid.xhtml");
            System.out.println("Items related to grid class");
            option("Black Watch");
	}
    public static void textName(String name) {
        WebElement nameBox = driver.findElement(By.name("j_idt88:name"));
        nameBox.sendKeys(name);
        System.out.println("Name is given to the textbox");
    }
    public static void cityName(String city)
    {
        WebElement type = driver.findElement(By.id("j_idt88:j_idt91"));
        type.clear();
        type.sendKeys(city);
        System.out.println("cleared the textbox and given city to it");
    }
    public static void disabledOrEnabled()
    {
        Boolean textBox = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        if (!textBox) {
            System.out.println("Text Box is Disabled as expected");
        }else {
            System.out.println("Text Box is Enabled");
        }
    }
    public static void clearText()
    {
        driver.findElement(By.id("j_idt88:j_idt95")).clear();
        System.out.println("Cleared the textbox");
    }
    public static void textCopy()
    {
        String data = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
        System.out.println(data);
    }
    public static void usingTab(String email)
    {
    	WebElement clicktab = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"));
    	clicktab.sendKeys(email);
    	clicktab.sendKeys(Keys.TAB);
    	System.out.println("Clicking the tab navigated to another textbox");
    }
    public static void errorMessage()
    {
    	WebElement error = driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
    	error.click();
    	error.sendKeys(Keys.ENTER);
    	WebElement display = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
    	String message = display.getText();
    	System.out.println("The error displayed is- " + message);
    }
    public static void selectDropdown(String listDropdown) throws InterruptedException
    {
    	WebElement select = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
    	select.click();
    	select.sendKeys(listDropdown);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//span[@class='ui-autocomplete-query'])[3]")).click();
    	System.out.println("The sentence is selected from the dropdown");
    }
    public static void clicking()
    {
    	WebElement click = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
    	click.click();
    	String title = driver.getTitle();
    	System.err.println("confirmed the title is - " + title);
    }
    public static void disabled()
    {
    	Boolean check = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).isEnabled();
    	if(!check)
    	{
    		System.out.println("the button is enabled");
    	}
    	else
    	{
    		System.out.println("the button is disabled");
    	}
    }
    public static void checkPosition()
    {
    	WebElement element = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
    	org.openqa.selenium.Point point = element.getLocation();
    	double xcord = point.getX();
    	System.out.println("Position of the submit button from left side is "+xcord +" pixels");
    	int ycord = point.getY();
    	System.out.println("Position of the submit button from top side is "+ycord +" pixels");
    }
    public static void checkColor()
    {
    	String color = driver.findElement(By.xpath("(//button[@type='button'])[4]")).getCssValue("color");
    	System.out.println("The color of the button - " + color);
//    	String hex = Color.getColor(color).toString();
//    	System.out.println(hex);
    }
    public static void colorChange()
    {
    	WebElement element= driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
    	Actions action = new Actions(driver);
    	action.moveToElement(element).perform();
    	System.out.println("Color changed");
    }
    public static void clickImage()
    {
    	WebElement element = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]"));
    	element.click();
        WebElement i = driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']"));
        
        Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

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
//       WebElement clickEmpty = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt102']"));
//       clickEmpty.click();
    }
    public static void toolSelect()
    {
    	WebElement list = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
    	list.click();
    	Select tool = new Select(list);
    	tool.selectByVisibleText("Selenium");
    	System.out.println("Automation tool selected ");
    }
    public static void countrySelect() throws InterruptedException
    {
        WebElement countryDrop = driver.findElement(By.id("j_idt87:country_label"));
        countryDrop.click();
        clickOptions("India");
        System.out.println("Country is selected");
    }
    public static void clickOptions(String option) throws InterruptedException
    {
        driver.findElement(By.xpath("//li[text()='"+option+"']")).click();
        Thread.sleep(100);
    }
    public static void citiesSelect() throws InterruptedException
    {
    	WebElement cityDrop = driver.findElement(By.id("j_idt87:city_label"));
    	cityDrop.click();
        clickOptions("Bengaluru");
        System.out.println("City is selected");
    }
    public static void basicCheckbox()
    {
    	WebElement check = driver.findElement(By.id("j_idt87:j_idt89"));
    	check.click();
    	System.out.println("Basic checkbox enabled");
    }
    private static void checkNotification()
    {
    	WebElement notification = driver.findElement(By.id("j_idt87:j_idt91"));
    	notification.click();
    	if(driver.findElement(By.id("j_idt87:j_idt91")).isEnabled())
    	{
    		List<WebElement> list= driver.findElements(By.id("j_idt87:msg_container"));
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
    private static void multipleCheckbox()
    {
    	List <WebElement> Checkboxes =  driver.findElements(By.xpath("//table[@id='j_idt87:basic']"));
        int size = Checkboxes.size();
        System.out.println(size);
        for(int i = 0; i<size; i++) 
        {
            Checkboxes.get(i).click();
        }
    }
    public static void tristateCheckBox()
    {
    	WebElement check = driver.findElement(By.xpath(""));
    	check.click();
    	stateCheck();
    }
    public static void stateCheck()
    {
    	if(driver.findElement(By.xpath("")).isEnabled())
    	{
    		WebElement checkState = driver.findElement(By.id("j_idt87:id_container"));
    		String get = checkState.getText();
    		System.out.println(get);
    	}
    }
    public static void toggleSwitch()
    {
    	WebElement toggle = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']"));
    	toggle.click();
    	if(toggle.isEnabled())
    	{
    		WebElement tog = driver.findElement(By.xpath("//div[@id='j_idt87:msg_container']"));
    		tog.getText();
    		System.out.println("message displayed");
    		toggle.click();
    	}
    }
    public static void tablePrint()
    {
    	List<WebElement> row = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
    	for (int i = 0; i < row.size(); i++) 
    	{
    		List<WebElement> cell = row.get(i).findElements(By.xpath("./td"));
    		for (int j = 0; j < cell.size(); j++) 
    			System.out.print(cell.get(j).getText());
		
    	System.out.println();
    	}
    }
    public static void randomSelect()
    {
//    	List<WebElement> random = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']//child::tr"));
//    			for (int i = 0; i < random.size(); i++) 
//    			{
//    				String particular = random.get(i).getText().toString();
//    				if(particular.equals("Ashley Nicolas"))
//    				{
//    					System.out.println(particular);
//    				}
//    				else
//    				{
//    					System.out.println("not present");
//    				}
//    			}
    	WebElement randomlist = driver.findElement(By.xpath("//tr[@data-ri='4']"));
    	String row = randomlist.getText();
    	System.out.println();
    	System.out.println("The overall details of the name given is");
    	System.out.println(row);
    	driver.findElement(By.xpath("//span[@class='ui-column-title'][1]")).click();
    }
    public static void selectCountry(String name)
    {
    	WebElement select = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[1]/child::span[3]"));
    	String country = select.getText();
    	System.out.println("The country for the given name is : " +country);
    }
    public static void selectRepresentative(String name)
    {
    	WebElement select = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[2]//child::span[2]"));
    	String representative = select.getText();
    	System.out.println("The Representative for the given name is : " +representative);
    }
    public static void selectJoinDate(String name)
    {
    	WebElement select = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[3]"));
    	String joinDate = select.getText();
    	System.out.println("The Join date for the given name is : " + joinDate);
    }
    public static void selectStatus(String name)
    {
    	WebElement select = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[4]"));
    	String status = select.getText();
    	System.out.println("The Status for the given name is : " + status);
    }
    public static void option(String name) throws InterruptedException 
    {
    	driver.findElement(By.xpath("(//td[text()='"+name+"']/preceding-sibling::td)[2]")).click();
    	Thread.sleep(3000);
    	List<WebElement> rowdetails = driver.findElements(By.xpath("//td[text()='"+name+"']/parent::tr/following::tr[1]/child::td//descendant::div[3]//descendant::tbody/tr"));
    	for (int i = 0; i < rowdetails.size(); i++) 
    	{
    		List<WebElement> celldetails = rowdetails.get(i).findElements(By.xpath("./td"));
    		for (int j = 0; j < celldetails.size(); j++) 
    			System.out.print(celldetails.get(j).getText());
    		
    		System.out.println();
		}
    }
}

