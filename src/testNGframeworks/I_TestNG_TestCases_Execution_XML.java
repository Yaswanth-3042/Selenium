package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class I_TestNG_TestCases_Execution_XML {
	WebDriver driver;
	
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	}
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");	
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");	
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");	
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");	
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");	
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");	
	}
	@Test
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");	
	}
	@Test
	public void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");	
	}
	@Test
	public void techlearn() {
		driver.get("https://www.techlearn.in");	
	}
	@Test
	public void jira() {
		driver.get("https://www.jira.com");	
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
