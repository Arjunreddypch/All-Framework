package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownOptions {
	
	public static void main(String args[]) throws InterruptedException  {
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		
		System.out.println("lanuched google chrome successfully");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		WebElement element=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select select=new Select(element);
		select.selectByValue("AED");
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("INR");
		Thread.sleep(2000);
		System.out.println(select.getFirstSelectedOption().getText()+"first");
		List<WebElement> list=select.getAllSelectedOptions();
		
		//for each loop example for(dadtatype referencename:collectionname){referencename.getText()}
		
		for(WebElement li:list) {
			System.out.println(li.getText());
		}
		
		Assert.assertEquals("","");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
