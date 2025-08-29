package testng.programs.dealsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LaunchBrowser {
	
	@Test(dataProvider = "sendData")
	public void launchBrowser(String URL,String SearchText)
	{
		
		System.setProperty("webdriver.gecko.driver", "C://Users//dines//Downloads//geckodriver-v0.34.0-win64 (1)//geckodriver");
		WebDriver driver =new FirefoxDriver();
		
			 driver =new FirefoxDriver();
			driver.get(URL);
			driver.findElement(By.name("q")).sendKeys(SearchText);
			driver.quit();
		
	}
	
	@DataProvider
	public Object[][] sendData(){
		
		Object[][] obj=new Object[2][2];
		obj[0][0]="https://www.google.com";
		obj[0][1]="HI";
		obj[1][0]="https://www.google.com";
		obj[1][1]="Bye";
		
		return obj;
		
	}
}
