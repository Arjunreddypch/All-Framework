package arjun.appium;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AppiumBasics extends BaseTest {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {

		AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//dines//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("ArjunGooglePixel9a");
		options.setApp(System.getProperty("user.dir") + "//src//test//java//resources//ApiDemos-debug.apk");
		AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		// locators id,className,xpath,accessibilityid,androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.quit();
		service.stop();

	}

}
