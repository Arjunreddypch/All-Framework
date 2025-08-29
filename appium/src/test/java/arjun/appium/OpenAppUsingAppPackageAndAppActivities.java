package arjun.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class OpenAppUsingAppPackageAndAppActivities extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		//get details for activity from cmd prompt 
		//CMD prompt commands : adb devices
		//CMD Prompt commands : adb shell dumpsys window | find "mCurrentFocus"
		// you will see like this  mCurrentFocus=Window{e619829 u0 io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies
		// io.appium.android.apis is apppackage and first parameter to the Activity class as apppackage
		// io.appium.android.apis.preference.PreferenceDependencies is second paramter to  activity class as appActivityname
		//Activity actvity=new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		//driver.startActvity(actvity);
		//activity is depricated use java script executor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("mobile: startActivity", ImmutableMap.of
				("intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
		
		//above code will   execute below 2 steps 
		//driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
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
