package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ImplicitlyWaitAndExplicitlyWait {

	public static void main(String args[]) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", 
//				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		System.out.println("lanuched google chrome successfully");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));

		String vegetablesToAddInCart[] = { "Cauliflower", "Cucumber", "Carrot", "Tomato","Beetroot","Potato" };

		List<String> vegetables = Arrays.asList(vegetablesToAddInCart);

		int i = 0;

		for (WebElement product : productName) {

			String productNameFromCart[] = product.getText().split("-");

			if (vegetables.contains(productNameFromCart[0].trim())) {
				System.out.println(productNameFromCart[0].trim());
				driver.findElement(
						By.xpath("//h4[contains(text(),'" + productNameFromCart[0].trim() + "')]/following::button")).click();
				i++;
				if (i >= vegetables.size()) {
					break;
				}

			}

		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo' and contains(text(),'Code applied')]")));
		System.out.println(driver.findElement(By.xpath("//*[@class='promoInfo' and contains(text(),'Code applied')]")).getText());

		driver.quit();
		
		
	}

}
