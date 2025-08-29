package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddItemsToCart {

	public static void main(String args[]) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", 
//				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		System.out.println("lanuched google chrome successfully");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

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

		Thread.sleep(5000);

		driver.quit();
	}

}
