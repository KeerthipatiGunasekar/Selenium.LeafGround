package org.projectSelenium.testLeaf;

import org.selenium.pages.AuthPage;

public class Auth extends BaseMainClass {

	public static void main(String[] args) {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/auth.xhtml");
		AuthPage auth = new AuthPage();
		auth.noteNotification();
	}
}
