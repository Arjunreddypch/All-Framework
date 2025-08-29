package seleniumprograms;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CookiesHandling {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		Cookie cookies=new Cookie("", "");
		driver.manage().addCookie(cookies);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookie(cookies);
		driver.manage().deleteCookieNamed("");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
