package arjun.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LandscapeMode extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
//		DeviceRotation landScape=new DeviceRotation(0,0,90);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTtitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTtitle,"WiFi settings");
		//Set text to clipBoard
		driver.setClipboardText("ArjunWifi");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
	}

}
