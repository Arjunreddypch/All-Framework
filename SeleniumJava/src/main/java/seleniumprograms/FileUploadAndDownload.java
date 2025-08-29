package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAndDownload {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		File file=new File(System.getProperty("user.dir")+"\\downloads\\"+"sampleFile.jpeg");
		if(file.exists()) {
		file.delete();
		}
			HashMap<String, Object> prefs=new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);
			prefs.put("download.default_directory", System.getProperty("user.dir")+"\\downloads");
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);

			WebDriver driver =new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/upload-download");
			/*
			 * // if file type is File in devtools we can use below step
			 * driver.findElement(By.cssSelector("input[type='File']")).
			 * sendKeys("C:\\Users\\dines\\Downloads\\Info (1).txt");
			 */
			Thread.sleep(5000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[@for='uploadFile']")));
			
			driver.findElement(By.xpath("//label[@for='uploadFile']")).click();
			Thread.sleep(2000);
			StringSelection selection=new StringSelection("C:\\Users\\dines\\Downloads\\Info (1).txt");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			driver.findElement(By.id("downloadButton")).click();
			Thread.sleep(5000);
			file=new File(System.getProperty("user.dir")+"\\downloads\\"+"sampleFile.jpeg");
			if(file.exists()) {
			System.out.println("file found");
			Thread.sleep(10000);
			file.delete();
			}
			
			
			
			
			
			
			
	}

}
