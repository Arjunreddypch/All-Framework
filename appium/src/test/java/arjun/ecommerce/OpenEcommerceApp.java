package arjun.ecommerce;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class OpenEcommerceApp extends BaseTest {
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
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nagarjuna");
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	}

}
