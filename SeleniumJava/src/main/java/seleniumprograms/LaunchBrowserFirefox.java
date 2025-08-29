package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserFirefox {
	
	public static void main(String args[]) throws InterruptedException  {
		
		System.setProperty("webdriver.gheko.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//geckodriver-v0.36.0-win-aarch64//ghekodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
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
