package org.projectSelenium.testLeaf;
import org.selenium.pages.TextBoxPage;

public class TextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/input.xhtml");
		TextBoxPage textBox = new TextBoxPage();
		textBox.typeInTextBox(Xpath.nameTextBox, "Gunasekar");
		textBox.typeInTextBox(Xpath.cityText, "Tiruttani");
		textBox.disabledOrEnabled();
		textBox.clearText();
		textBox.textCopy();
		textBox.typeInTextBox(Xpath.emailTab, "gunasekarkeerthipati@gmail.com");
		textBox.typeInTextBox(Xpath.emailTab, "TAB");
		Thread.sleep(3000);
		textBox.errorMessage();
		textBox.selectDropdown("Randomselect");
	}
}
