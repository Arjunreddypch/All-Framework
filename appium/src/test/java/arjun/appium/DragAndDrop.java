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

public class DragAndDrop extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement element=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("mobile: dragGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
				"endX",194,
				"endY",1030));
		
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText(), "Dropped!");
	}

}
