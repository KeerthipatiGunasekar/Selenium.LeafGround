package org.projectSelenium.testLeaf;

import org.selenium.pages.GridPage;
import org.selenium.pages.TablePage;

public class Table extends BaseMainClass
{
	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/table.xhtml");
		TablePage table = new TablePage();
		GridPage grid = new GridPage();
		grid.printTableAll(Xpath.allRow, Xpath.allCells, "");
		table.clickAsc();
		table.selectCountry("Aika");
		table.selectRepresentative("Aika");
		table.selectJoinDate("Aika");
		table.selectStatus("Aika");
	}
}
