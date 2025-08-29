package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnElements {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();

			driver.get("https://www.flipkart.com/"); //URL in the browser
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
			Actions action=new Actions(driver);
			
			action.moveToElement(driver.findElement(By.xpath("//a[@title='Login']"))).build().perform();
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]"))).click().build().perform();
			action.moveToElement(driver.findElement(By.xpath("//*[@name='q']"))).click().keyDown(Keys.SHIFT).sendKeys("arjun").build().perform();
			driver.findElement(By.xpath("//*[@name='q']")).clear();
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("arjun1");
			action.moveToElement(driver.findElement(By.xpath("//*[@name='q']"))).click().keyDown(Keys.SHIFT).sendKeys("arjun").keyUp(Keys.SHIFT).build().perform();
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("arjun2");
			
			
			Thread.sleep(5000);
	}
}
