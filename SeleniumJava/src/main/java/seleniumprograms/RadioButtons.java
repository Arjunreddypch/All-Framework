package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class RadioButtons {



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
driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
Thread.sleep(3000);
System.out.println("round trip radio button is seleted"+driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected());
Thread.sleep(3000);
System.out.println("round trip date picker"+driver.findElement(By.xpath("//label[contains(text(),'Return date')]//following-sibling::span")).isEnabled());
Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'Return date')]//following-sibling::span")).isEnabled());

String attributeValue=driver.findElement(By.xpath("//label[contains(text(),'Return date')]//following-sibling::span")).getAttribute("class");
System.out.println(attributeValue);
Assert.assertEquals(attributeValue, "date-close");

driver.quit();











}





}