package arjun.ecommerce;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SearchItemAddItemToCartCheckout extends BaseTest{
	
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// locators id, className, xpath, accessibilityid ,androidUIAutomator
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		
		//selecting option from dropdown
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().scrollable(true))" +
			    ".scrollIntoView(new UiSelector().text(\"Brazil\"))")).click();
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
		
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nagarjuna P");
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String product="Jordan 6 Rings";
		//selecting option from dropdown
				driver.findElement(AppiumBy.androidUIAutomator(
					    "new UiScrollable(new UiSelector().scrollable(true))" +
					    ".scrollIntoView(new UiSelector().text(\""+product+"\"))"));
				Thread.sleep(3000);
		List<WebElement> list=driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName"));
		int addTocartIndex=0;
		for(int i=0;i<list.size();i++) {
			
			String text=list.get(i).getText();
			
			if(text.equals(product)) {
				addTocartIndex=i+1;
			}
		}
			driver.findElement(By.xpath(
					"(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])["+addTocartIndex+"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/termsButton"));
		js.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
				((RemoteWebElement)element).getId(),"duration",3000));
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(10000);
		
		Set<String> set=driver.getContextHandles();
		
		for(String s:set) {
			System.out.println(s);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		
	}

}
