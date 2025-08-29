package java8.features;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Java8FeaturesSample {

	public void withOutJavaStreams() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.xpath("//*[text()='Continue shopping']")).click();
		} catch (NoSuchElementException e) {
			System.out.println("ignore NoSuchElementException");
		}

		finally {

			List<WebElement> list = driver.findElements(By.tagName("a"));
			List<String> links = new ArrayList<String>();
			for (WebElement li : list) {

				links.add(li.getText());

			}
			List<String> removeDuplicates = new ArrayList<String>(new HashSet<String>(links));
			Collections.sort(removeDuplicates);
			for (String rd : removeDuplicates) {

				if (rd.toLowerCase().startsWith("c") || rd.toLowerCase().startsWith("d")) {
					System.out.println(rd);
				}

			}

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//dines//Downloads//Arjun Dubai//chromedriver-win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.xpath("//*[text()='Continue shopping']")).click();
		} catch (NoSuchElementException e) {
			System.out.println("ignore NoSuchElementException");
		}

		finally {

			List<WebElement> list = driver.findElements(By.tagName("a"));

			list.stream()
					.filter(elements -> elements.getText().toLowerCase().startsWith("c")
							|| elements.getText().toLowerCase().startsWith("d")).map(s->s.getText()).sorted().distinct()
					.forEach(s -> System.out.println(s));

		}

		driver.quit();
	}
}
