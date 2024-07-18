package org.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.*;



public class Hooksclass extends BaseClass{
	
	
	@Before
	public static void browseropen() {
browserlaunch();
maxWindow();
launchurl("https://www.facebook.com/");
		
	}
	
	@After
	public static void browserclose(Scenario s) throws IOException {
	
		if (s.isFailed()) {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}
		
		closebrowser();
	}
	
}



//public static void browserclose(Scenario s) {
		//if (s.isFailed()) {
			
		//	String name = s.getName();
			//String sName = name.replace(" ", "_");
			//Screenshot(sName);
		//}