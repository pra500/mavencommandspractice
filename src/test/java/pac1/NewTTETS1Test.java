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

public class NewTTETS1Test {
	
	
	
	 WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Your Store");
	  
	  
	  
  }
  
   
  
  
 
  @BeforeClass
  public void beforeClass() {
	  
	     driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		

	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
