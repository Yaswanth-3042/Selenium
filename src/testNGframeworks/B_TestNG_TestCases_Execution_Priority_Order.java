package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class B_TestNG_TestCases_Execution_Priority_Order {
	WebDriver driver;
  @Test(priority=0)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=2, enabled = false)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(priority=5)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test(priority=4)
  public void instagram() {
	  driver.get("https://www.instagram.com");
  }
  @Test(priority=3)
  public void youtube() {
	  driver.get("https://www.youtube.com");
  }
  @Test(priority=1)
  public void whatsapp() {
	  driver.get("https://www.whatsapp.com");
  }
  @Test(priority=6,enabled = false)
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

}
