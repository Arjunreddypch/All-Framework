package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//to scroll window scroll bar
		js.executeScript("window.scrollBy(0,500)");
		//to scroll table scroll bar to top to bottom 
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		//to scroll table scroll bar to Left to right 
//		js.executeScript("document.querySelector(/".tableFixHead/").scrollLeft=5000");
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.cssSelector(".tableFixHead")));
		
	}
}
