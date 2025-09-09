package pagescrollDownandup;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;
  @Test
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
