package seleniumprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	
	public static void main(String args[]) throws InterruptedException, MalformedURLException, IOException  {
		SoftAssert a=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		
		driver.manage().window().maximize();
		
		
		List<WebElement> elements=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement element:elements) {
			
			
			String url=element.getAttribute("href");
			
			if(url.contains("http")) {
				System.out.println(url);
			@SuppressWarnings("deprecation")
			HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			
			int responseCode=connection.getResponseCode();
			
			a.assertTrue(responseCode<400, "broken link url is "+url+" staus code is"+responseCode);
			
			}
		}
		a.assertAll();
		
		
		driver.quit();
	}

}
