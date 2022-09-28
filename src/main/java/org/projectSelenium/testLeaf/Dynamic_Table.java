package org.projectSelenium.testLeaf;
import org.selenium.pages.Dynamic_TablePage;

public class Dynamic_Table {
	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/dynamicgrid.xhtml");
		Dynamic_TablePage dynamic = new Dynamic_TablePage();
		dynamic.clickName();
		Thread.sleep(3000);
		dynamic.printDynamicTable("Aika", "STATUS");
	}
}