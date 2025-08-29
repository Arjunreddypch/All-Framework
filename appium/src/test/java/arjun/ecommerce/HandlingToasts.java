package arjun.ecommerce;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class HandlingToasts extends BaseTest{
	
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		//selecting option from dropdown
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true))" +
			    ".scrollIntoView(new UiSelector().text(\"India\"))")).click();
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
		
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		// android.widget.Toast
		
		String toastText=driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getText();
		
		System.out.println(toastText);
		
		Assert.assertEquals(toastText,"Please enter your name");
	}

}
