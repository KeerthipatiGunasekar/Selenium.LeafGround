package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectSelenium.testLeaf.BaseMainClass;

public class FileUploadDownloadPage extends BaseMainClass {

	public void basicUpload() 
	{
		WebElement click = driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89_label']"));
		click.click();
		System.out.println("Clicked the basic button");
	}

}
