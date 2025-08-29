package testng.programs.dealsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaunchBrowserUsingDataProvider {
	
	@Parameters({"URL","searchText"})
	@Test(dataProvider = "sendData")
	public void launchBrowser(String URL,String SearchText)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.get(URL);
			driver.findElement(By.name("q")).sendKeys(SearchText);
			driver.quit();
		
	}
	@Parameters({"URL","searchText"})
	@Test
	public void launchBrowser1(String URL,String SearchText)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();
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
