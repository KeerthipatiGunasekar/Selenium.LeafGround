package org.projectSelenium.testLeaf;

import org.selenium.pages.CheckBoxPage;

public class CheckBox 
{
	public static void main(String[] args) {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/checkbox.xhtml");
		CheckBoxPage checkBox = new CheckBoxPage();
		checkBox.basicCheckbox();
		checkBox.checkNotification();
		checkBox.multipleCheckbox();
//		checkBox.tristateCheckBox();
		checkBox.toggleSwitch();
	}
}
