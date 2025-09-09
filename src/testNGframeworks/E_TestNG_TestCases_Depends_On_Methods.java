package testNGframeworks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class E_TestNG_TestCases_Depends_On_Methods {
	WebDriver driver;
  
  @Test(dependsOnMethods="method2")
  public void method1() throws InterruptedException {
	  driver.findElement(By.id("user_login")).sendKeys("Yaswanth");
	  Thread.sleep(3000);
	  driver.findElement(By.name("pwd")).sendKeys("Yash@3042");
	  Thread.sleep(3000);
	  driver.findElement(By.name("rememberme")).click();

  }
  
  @Test
  public void method2() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
  }

}
