package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

public class SSLCheck {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		FirefoxOptions foptions=new FirefoxOptions();
		foptions.setAcceptInsecureCerts(true);
		EdgeOptions eoptions=new EdgeOptions();
		eoptions.setAcceptInsecureCerts(true);
		SafariOptions soptions=new SafariOptions();
		soptions.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
