package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		//Capture Screenshot
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File("C://Users//dines//eclipse-workspace//SeleniumJava//hi//"+"browserscreenshot.png"));
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
