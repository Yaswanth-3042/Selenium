package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class J_TestNG_TestCases_Groups_Execution {
	WebDriver driver;
	
  @Test(groups="Search")
  public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");	
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");	
	}
	@Test(groups="socail")
	public void facebook() {
		driver.get("https://www.facebook.com");	
	}
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");	
	}
	@Test(groups="tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");	
	}
	@Test(groups="bugtool")
	public void redmine() {
		driver.get("https://www.redmine.org");	
	}
	@Test(groups="news")
	public void yahoo() {
		driver.get("https://www.yahoo.com");	
	}
	@Test(groups="bugtool")
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");	
	}
	@Test(groups="tech")
	public void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");	
	}
	@Test(groups="ai")
	public void deepseek() {
		driver.get("https://www.deepseek.com/");	
	}
	@Test(groups="tech")
	public void techlearn() {
		driver.get("https://www.techlearn.in");	
	}
	@Test(groups="bugtool")
	public void jira() {
		driver.get("https://www.jira.com");	
	}
	@Test(groups="news")
	public void ndtv() {
		driver.get("https://www.ndtv.com");	
	}
	@Test(groups="ai")
	public void chatgpt() {
		driver.get("https://chat.openai.com/");	
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
