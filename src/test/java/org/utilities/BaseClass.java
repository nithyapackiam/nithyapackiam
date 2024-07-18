package org.utilities;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static TakesScreenshot tk;
	public static Select s;
	public static JavascriptExecutor js;
	
	//1.
	
public static void browserlaunch() {

	driver=new ChromeDriver();
}

//2.
	public static void maxWindow()
	{
		driver.manage().window().maximize();
			}
	
	//3.
	public static void launchurl(String url) {
		driver.get(url);
		
	}
	
	//4.
	public static void selectdate(WebElement targetDropDown, int i) {
		s=new Select(null);
		s.selectByIndex(i);

	}
	
	//5.
	public static void filltext(WebElement w, String v) {

		w.sendKeys(v);
	}
	
	//6.
	public static void btnclick(WebElement c) {
		c.click();
	}
	//7.
	
	public static void title() {
String title = driver.getTitle();
System.out.println(title);
		
	}
	public static void crturl() {
		
		String url = driver.getCurrentUrl();
System.out.println(url);	

	}
	
	//8.
	public static void closebrowser() {

		driver.close();
	}
	
	
	//eg:9
		
	public static void doubleclick(WebElement w)
	{
	a.doubleClick(w).perform();
	
	}
	
	//eg:10
	
		public static void contextclick(WebElement w)
		{
		a.contextClick(w).perform();
		}
				
	//12
		
		
		public static void selectall()
			{
								
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
									
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);
			}
			
			public static void select(String value)
			{
			s.selectByValue(value);
			}
			
			public static void selectindex(int index)
			{
			s.selectByIndex(index);
			}
			
			public static void selecttext(String text)
			{
			s.selectByVisibleText(text);
			}
			
			
			public static void multiple()
			{
			boolean m = s.isMultiple();
			System.out.println(m);
			}
			
			public static void deselectindex(int index)
			{
			s.deselectByIndex(index);
			}
			
			public static void deselectvalue(String value)
			{
			s.deselectByValue(value);
			}
				
			public static void deselecttext(String text)
			{
			s.deselectByVisibleText(text);
			}

		//Screenshot method	
			public static void Screenshot(String name) throws IOException {

				TakesScreenshot tk=(TakesScreenshot) driver;
				File s = tk.getScreenshotAs(OutputType.FILE);
				File d=new File("C:\\Users\\Abraham\\nit workspace\\Facebookpro\\target\\Screenshot\\"+name+".jpg");
				FileUtils.copyFile(s, d);
			}

}
