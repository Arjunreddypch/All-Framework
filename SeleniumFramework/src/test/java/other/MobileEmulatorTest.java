package other;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;

public class MobileEmulatorTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		devtools.createSession();
		
		Map<String, Object> coordinates=new HashMap<String, Object>();
		coordinates.put("lattitude", "40");
		coordinates.put("longitude", "3");
		coordinates.put("longitude", "1");
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
	}

}
