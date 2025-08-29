package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	
	public static void main(String args[]) throws InterruptedException  {
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");		
		
		System.out.println("lanuched google chrome successfully");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
		// xpath contains //a[contains(text(),'Forgot your pa')]
		// xpath textI() //a[(text()='Forgot your password?')]
		// xpath or  //a[contains (text(),'Forgot1') or contains(text(),'password') ]
		// xpath and  //a[contains (text(),'Forgot') and contains(text(),'password') ]
		// xpath starts-wtih  //a[starts-with(text(),'Forgot')]
		// xpath ends-wtih  //a[ends-with(text(),'Forgot')] *** does not work with selenium it supports only xpath 1 version
		// following //a[text()='Forgot your password?']/following::button[contains(text(),'Visit us') and @id='visitUsTwo']		
		//a[text()='Forgot your password?']//preceding::div[1]-- skip immediate div and identify previous div - previous generation
		//a[text()='Forgot your password?']//ancestor::div[1]-- immediate div - all ancestors 
		// a[text()='Forgot your password?']//descendant::div -- descemdant works like childres, grand children
		// link text -- driver.findElement(By.linkText("Forgot your password?")).click();
		// partial link text-- driver.findElement(By.partialLinkText("Forgot your password?")).click();
		//css selector regular expression driver.findElement(By.cssSelector(input[@id*='forgot pass']))	
		
		
		Assert.assertEquals("","");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
