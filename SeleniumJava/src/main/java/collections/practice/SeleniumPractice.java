package collections.practice;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
	
	public static void main(String args[]) throws  InterruptedException{
		
//		System.setProperty("webdriver.chrome.driver", "C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.emirates.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
