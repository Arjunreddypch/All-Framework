package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowserEdgeBrowser {
	
	public static void main(String args[]) throws InterruptedException  {
		
		System.setProperty("webdriver.edge.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//edgedriver_win64//msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://www.google.com/");		
		
		System.out.println("lanuched google chrome successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);		
		System.out.println(driver.getCurrentUrl());		
		Thread.sleep(3000);		
		driver.quit();
	}

}
