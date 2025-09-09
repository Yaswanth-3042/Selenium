package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;
  @Test
  public void fileattach() throws InterruptedException {
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"myFile\"]")).sendKeys("C:\\Users\\Yaswanth\\OneDrive\\Pictures\\Screenshots\\one.PNG");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
