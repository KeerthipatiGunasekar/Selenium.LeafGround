package org.projectSelenium.testLeaf;

import org.selenium.pages.DropDownPage;

public class DropDown extends BaseMainClass
{
	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/select.xhtml");
		DropDownPage dropDown = new DropDownPage();
		dropDown.toolSelect();
		dropDown.countrySelect();
		dropDown.citiesSelect();
	}
}
