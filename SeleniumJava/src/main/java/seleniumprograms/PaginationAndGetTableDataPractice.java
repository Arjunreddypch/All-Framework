package seleniumprograms;

import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class PaginationAndGetTableDataPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String item = "RedCh";
// click on column
		String itemPrice = "0";
		driver.findElement(By.xpath("//tr/th[1]")).click();
		int price = 0;
		do {
			List<WebElement> element = driver.findElements(By.xpath("//tbody//tr//td[1]"));
			int size = element.size();
			for (int i = 1; i <= size; i++) {
				if (driver.findElement(By.xpath("//tr[" + i + "]/td[1]")).getText().contains(item)) {
					WebElement el = driver.findElement(By.xpath("//tr[" + i + "]/td[1]"));
					itemPrice = el.findElement(By.xpath("following-sibling::td[1]")).getText();
					price = 1;
					System.out.println(item + " price is " + itemPrice);
					break;
				}
			}
			if (driver.findElement(By.xpath("//a[@aria-label='Next']")).getAttribute("aria-disabled")
					.contains("false")) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			} else {

				if (Integer.parseInt(itemPrice) < 1 & driver.findElement(By.xpath("//a[@aria-label='Next']"))
						.getAttribute("aria-disabled").contains("true")) {
					System.out.println("no item found with the name " + item + " verified whole table");
					break;
				}
			}

		} while (price < 1);
		driver.close();
	}

}