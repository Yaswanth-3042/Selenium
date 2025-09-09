package tAbsandWindows;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTabsSwitches {
	WebDriver driver;
  @Test
  public void techlearnlogin() {  
	driver.get("https://www.techlearn.in/admin");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
