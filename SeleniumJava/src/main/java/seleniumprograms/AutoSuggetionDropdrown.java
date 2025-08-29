package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggetionDropdrown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", 
	"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
driver.findElement(By.xpath("//b[text()='Country']/following::input[@id='autosuggest']")).sendKeys("ind");
Thread.sleep(3000);
driver.manage().window().maximize();
selectCountryfromAutoSuggetionDropdown("Indonesia",driver);

Thread.sleep(2000);


Thread.sleep(3000);
driver.quit();

}

/* 
 * 
 * Important Note: if you want to pause auto dropdown go to dev tools type cntrl+P  then show rendering and select checkbox from emulate focused page
 * 
 * */
public static void selectCountryfromAutoSuggetionDropdown(String countryName, WebDriver driver) {
	
	List<WebElement> list=driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
	
	for(WebElement li:list) {
		
		if(li.getText().equals(countryName)) {
			li.click();
			break;
	}
	}
}





}