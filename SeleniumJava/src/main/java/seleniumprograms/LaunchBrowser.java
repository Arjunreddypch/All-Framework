package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String args[]) throws InterruptedException  {
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");		
		
		System.out.println("lanuched google chrome successfully");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
