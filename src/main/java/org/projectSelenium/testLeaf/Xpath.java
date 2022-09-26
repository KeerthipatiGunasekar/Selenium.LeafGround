package org.projectSelenium.testLeaf;

public class Xpath
{
	//xpath related to TextBox
	public static String nameTextBox = "//input[@placeholder='Babu Manickam']";
	public static String cityText = "//input[@value='Chennai']";
	public static String textdisabled = "//input[@placeholder='Disabled']";
	public static String clearing = "//input[@value='Can you clear me, please?']";
	public static String print = "//input[@value='My learning is superb so far.']";
	public static String emailTab = "//input[@placeholder='Your email and tab']";
	public static String messageError = "//input[@id='j_idt106:thisform:age']";
	public static String errorNote = "//span[@class='ui-message-error-detail']";
	public static String dropdown = "//input[@placeholder='Search']";
	public static String selectThird = "(//span[@class='ui-autocomplete-query'])[3]";
	
//	xpath related to button
	public static String titleConfirm = "//span[contains(text(),'Click')]";
	public static String buttonDisabled = "//span[contains(text(),'Disabled')]";
	public static String positionCheck = "(//span[contains(text(),'Submit')])[1]";
	public static String colorOfButton = "(//button[@type='button'])[4]";
	public static String changeOfColor = "(//span[contains(text(),'Success')])[1]";
	public static String noteImg = "//span[contains(text(),'Image')]";
	public static String printImg = "//img[@id='j_idt88:j_idt102:j_idt104']";
	public static String emptyPlaceClick = "//input[@name='j_idt88:j_idt102']";
	
//	xpath related to Dropdown
	public static String selectTools = "//select[@class='ui-selectonemenu']";
	public static String selectCountry = "//label[text()='Select Country']";
	public static String optionSelect = "//li[text()='{variable}']";
	public static String selectCity = "//label[text()='Select City']";
	public static String selectTooloption = "//option[text()='Selenium']";
	
	public static String basicCheck = "//span[text()='Basic']";
	public static String notificationCheck = "//span[text()='Ajax']";
	public static String CheckBoxCheck = "//div[@id='j_idt87:j_idt91']";
	public static String messageCheck = "//div[@id='j_idt87:msg_container']";
	public static String clickMultiple = "(//table[@role='presentation'])[5]";
	public static String toggles = "//div[@id='j_idt87:j_idt100']";
	public static String toggleMessage = "//div[@id='j_idt87:msg_container']";
	
//	Xpath related to table
	public static String allRow = "//tbody[@id='form:j_idt89_data']/tr";
	public static String allCells = "./td"; 
	public static String randomcellrow = "//tbody[@id='form:j_idt89_data']//child::tr";
	public static String randomcellCountry = "//td[contains(text(),'{variable}')]/following-sibling::td[1]/child::span[3]";
	public static String randomcellRepresentative = "//td[contains(text(),'{variable}')]/following-sibling::td[2]//child::span[2]";
	public static String randomcellJoinDate = "//td[contains(text(),'{variable}')]/following-sibling::td[3]";
	public static String randomcellStatus = "//td[contains(text(),'{variable}')]/following-sibling::td[4]";
	public static String nameClicking = "(//span[text()='Name'])[1]";
	
//	Xpath related to Grid
	public static String selectnameGrid = "(//td[text()='{variable}']/preceding-sibling::td)[2]";
	public static String selectallGrid = "//td[text()='{variable}']/parent::tr/following::tr[1]/child::td//descendant::div[3]//descendant::tbody/tr";
	public static String selectallCells = "./td";
	
}
	


