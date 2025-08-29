package arjun.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//dines//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel8");
		options.setApp(System.getProperty("user.dir") + "//src//test//java//resources//ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		this.driver=driver;
		this.service=service;
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}
