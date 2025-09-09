package testNGframeworks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class F_TestNG_TestCases_Timeout {
	WebDriver driver;
  @Test(timeOut=5000)
  public void f() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  
	  driver.findElement(By.id("user_login")).sendKeys("Yaswanth");
	  
	  driver.findElement(By.name("pwd")).sendKeys("Yash@3042");
	  
	  driver.findElement(By.name("rememberme")).click();
	  
	  driver.findElement(By.name("wp-submit")).click();
	  
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
