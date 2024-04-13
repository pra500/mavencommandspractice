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

public class NewTTETSTest {
	
	
	
	 WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Your Store");
	  
	  
	  
  }
  
  
  @Test
  public void fiTest() {
	  
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Tablets']")));
	  
	  
	  boolean b=driver.findElement(By.xpath("//a[text()='Tablets']")).isDisplayed();
	  System.out.println(b);
	  
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
