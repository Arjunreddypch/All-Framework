package seleniumprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesNestedFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		/*
		 * Set<String> set = driver.getWindowHandles();
		 * 
		 * Iterator<String> it = set.iterator();
		 * 
		 * String pid = it.next(); String cid = it.next();
		 * 
		 * driver.switchTo().window(cid);
		 */
		driver.get("https://the-internet.herokuapp.com/"); // URL in the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='/frames']")).click();
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		/***NOTE to switch to parent frame you can use switchTo().parentFrame() method**/
//		System.out.println(driver.switchTo().parentFrame().getPageSource());
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}
}
