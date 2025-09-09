package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class D_TestNG_TestCases_Description {
	WebDriver driver;
  @Test(description = "Verify the google URL")
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(description = "Verify the facebook URL")
  public void test2() {
	  driver.get("https://www.facebook.com");
  }
  @Test(description = "Verify the twitter URL")
  public void test3() {
	  driver.get("https://www.x.com");
  }
  @Test(description = "Verify the instagram URL")
  public void test4() {
	  driver.get("https://www.instagram.com");
  }
  @Test(description = "Verify the youtube URL")
  public void Youtube() {
	  driver.get("https://www.youtube.com");
  }
  @Test(description = "Verify the whatsapp URL")
  public void test6() {
	  driver.get("https://www.whatsapp.com");
  }
  @Test(description = "Verify the Zomato URL")
  public void test7() {
	  driver.get("https://www.zomato.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

}
