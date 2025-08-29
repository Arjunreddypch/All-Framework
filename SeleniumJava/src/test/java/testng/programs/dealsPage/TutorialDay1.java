package testng.programs.dealsPage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialDay1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am first");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am number 1 from last");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
  @Test
  public void login() {
	  
	  System.out.println("login");
	  
  }
  
  @Test
  public void logout() {
	  
	  System.out.println("logout");
	  
  }
}
