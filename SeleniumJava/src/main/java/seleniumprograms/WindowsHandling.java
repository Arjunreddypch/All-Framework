package seleniumprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/loginpagePractise/#"); //URL in the browser
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			
			driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]")).click();
			Thread.sleep(5000);
			
			Set<String> set=driver.getWindowHandles();
			
			Iterator<String> it=set.iterator();
			
			String pid=it.next();
			String cid=it.next();
			
			driver.switchTo().window(cid);
			
			String email=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at ")[1].trim().split(" ")[0];
			
			driver.switchTo().window(pid);
			
			driver.findElement(By.id("username")).sendKeys(email);
			
			Thread.sleep(5000);
			driver.quit();
		
			
	}
}
