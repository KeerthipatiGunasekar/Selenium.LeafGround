package org.projectSelenium.testLeaf;

import org.selenium.pages.WaitsPage;
public class Waits extends BaseMainClass{

	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://leafground.com/waits.xhtml");
		WaitsPage wait = new WaitsPage();
		wait.visibility();
		wait.invisibility();
		wait.textChange();
	}
}
