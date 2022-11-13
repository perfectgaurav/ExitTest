package Utilities;

import java.io.File;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BaseClasses.*;

public class Screenshot extends BaseClass{
	public static String takeScreen() throws IOException {
		File screenFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sDate = sdf.format(date);
		String screenPath = "/FailedScreenshots/" + sDate + ".jpg";

		FileUtils.copyFile(screenFile,new File(screenPath));
		byte[] fileContent = FileUtils.readFileToByteArray(screenFile);
		String s64 = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		
		return s64;
	}

}
