package seleniumprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FramesTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();

			driver.get("https://jqueryui.com/droppable/"); //URL in the browser
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			Thread.sleep(5000);
			// we can switch to frame by using 3 ways 1.index 2.idorname 3.webelement
			driver.switchTo().frame(0);
			/*
			 * driver.switchTo().frame("id or name");
			 * driver.switchTo().frame(driver.findElement(By.xpath(
			 * "//iframe[@class='demo-frame']")));
			 */
			Actions action=new Actions(driver);
			
			action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
			
			driver.switchTo().defaultContent();//to switch to main window
			
			
			
			
	}
}
