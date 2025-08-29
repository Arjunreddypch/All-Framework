package seleniumprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class verifyItemsAreinSortingOrderUsingStreams {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("start-maximized");
			WebDriver driver =new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); //URL in the browser
			driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
			List<String> al=new ArrayList<String>();
			List<WebElement> elements=driver.findElements(By.xpath("//tr/td[1]"));
			al= elements.stream().map(s->s.getText()).collect(Collectors.toList());
			
			List<String> sortedOrder=al.stream().sorted().collect(Collectors.toList());
			System.out.println(al.equals(sortedOrder));
			
			driver.close();
			
	}

}
