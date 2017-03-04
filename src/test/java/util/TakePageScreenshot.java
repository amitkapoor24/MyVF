package util;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

public class TakePageScreenshot {
	
	
	 public void getscreenshot(WebDriver driver) throws Exception 
     {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             String path = "./target/screenshots/" + scrFile.getName();
             FileUtils.copyFile(scrFile, new File(path));
       
     }
	 
}
