package arjun.ecommerce;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SearchItemAddItemToCart extends BaseTest{
	
	
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
	}

}
