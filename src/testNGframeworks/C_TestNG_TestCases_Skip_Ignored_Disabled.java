package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class C_TestNG_TestCases_Skip_Ignored_Disabled {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
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
  public void instagram() {
	  driver.get("https://www.instagram.com");
  }
  @Test
  public void youtube() {
	  driver.get("https://www.youtube.com");
  }
  @Test
  public void whatsapp() {
	  driver.get("https://www.whatsapp.com");
  }
  @Test
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

}
