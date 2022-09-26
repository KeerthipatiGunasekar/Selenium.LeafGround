package org.projectSelenium.testLeaf;

import org.selenium.pages.ButtonPage;

public class Button extends BaseMainClass
{
	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/button.xhtml");
		ButtonPage button = new ButtonPage();
		button.clicking();
		Thread.sleep(3000);
		button.disabled();
		button.checkPosition();
		button.checkPosition();
		button.checkColor();
		button.colorChange();
		button.clickImage();
	}
}

	
