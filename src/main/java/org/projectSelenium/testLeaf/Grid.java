package org.projectSelenium.testLeaf;

import org.selenium.pages.GridPage;

public class Grid extends BaseMainClass 
{
	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/grid.xhtml");
		GridPage grid = new GridPage();
		grid.clickName("Black Watch");
		Thread.sleep(3000);
		grid.printTableAll(Xpath.selectallGrid.replace("{variable}", "Black Watch"), Xpath.selectallCells, "Black Watch");
	}
}
