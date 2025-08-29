package seleniumprograms;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheckChromeOptions {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("IPAddress:4444");
		options.setAcceptInsecureCerts(true);
		options.setCapability("proxy",proxy);
		options.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		//Block dialog windows
		ChromeOptions options1 = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
		
		//download directory
		ChromeOptions options2 = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		driver.quit();
		
	}

}
