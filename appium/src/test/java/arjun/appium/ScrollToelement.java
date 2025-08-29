package arjun.appium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Arrays;

public class ScrollToelement extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//this is one way of scrolling
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"WebView\"]"));
		Point location=element.getLocation();
		int targetX=location.getX();
		int targetY=location.getY();
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe=new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), targetX, targetY + 400));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), targetX, targetY)); // end point
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		((RemoteWebDriver) driver).perform(Arrays.asList(swipe));
		
	}
	
}
