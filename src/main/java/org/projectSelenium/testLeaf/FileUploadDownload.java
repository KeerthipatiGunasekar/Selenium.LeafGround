package org.projectSelenium.testLeaf;

import org.selenium.pages.FileUploadDownloadPage;

public class FileUploadDownload {

	public static void main(String[] args) throws InterruptedException {
		BaseMainClass base = new BaseMainClass();
		base.driverLaunch("https://www.leafground.com/file.xhtml");
		Thread.sleep(3000);
		FileUploadDownloadPage file = new FileUploadDownloadPage();
		file.basicUpload();
	}
}
