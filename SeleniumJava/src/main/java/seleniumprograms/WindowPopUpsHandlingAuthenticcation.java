package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpsHandlingAuthenticcation {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			//handling window popups by passing user name and password through URL 
			driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");
			
			
	}

}
