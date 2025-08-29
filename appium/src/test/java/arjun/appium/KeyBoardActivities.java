package arjun.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class KeyBoardActivities extends BaseTest {
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
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("ArjunWifi");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
	}

}
