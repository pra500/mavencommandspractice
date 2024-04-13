package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTTETS2Test {
	
	
	
	 WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  driver.findElement(By.id("username1")).sendKeys("student");	  
	 
  }
  
   
  
  
 
  @BeforeClass
  public void beforeClass() {
	  
	    driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		

	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
