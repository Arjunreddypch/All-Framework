package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class Checkboxes {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", 
	"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
driver.findElement(By.xpath("//input[@value='Departure City']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//a[@value='AMD']")).click();

Thread.sleep(2000);


//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();



driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
Thread.sleep(3000);
Assert.assertTrue(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']//preceding-sibling::input")).isSelected());

Thread.sleep(3000);
driver.quit();











}





}