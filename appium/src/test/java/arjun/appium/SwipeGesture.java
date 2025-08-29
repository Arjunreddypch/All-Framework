package arjun.appium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class SwipeGesture extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement element = driver.findElement(
				AppiumBy.xpath("//android.widget.Gallery[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView[1]"));
		Assert.assertEquals(element.getAttribute("focusable"), "true");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
				"direction", "left",
				"percent", 0.3));
		Assert.assertEquals(element.getAttribute("focusable"), "false");
	}

}
