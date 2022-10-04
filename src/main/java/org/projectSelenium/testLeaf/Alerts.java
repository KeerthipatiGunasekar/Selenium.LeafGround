package org.projectSelenium.testLeaf;

import org.selenium.pages.AlertsPage;

public class Alerts extends BaseMainClass {

	public static void main(String[] args) throws InterruptedException 
	{
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://leafground.com/alert.xhtml");
		AlertsPage alert = new AlertsPage();
		alert.alertSimpleDialog();
		alert.alertConfirmDialog();
		alert.sweetAlertSimpleDialog();
	}
}
