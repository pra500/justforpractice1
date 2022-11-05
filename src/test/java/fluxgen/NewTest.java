package fluxgen;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	 
  @BeforeMethod
  public void beforeMethod() {
	  //http://aquagen-test.azurewebsites.net/


       WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get(" http://aquagen-test.azurewebsites.net/");
		
		
			

	  
	  
  }

  @Test(priority = 1)
  public void LoginTest() {
	  System.out.println(driver.getTitle());
	  
  }
  @Test(priority = 2)
  public void HomeTest() {
	  
	  System.out.println(driver.getCurrentUrl());
	
	  
  }
  
  @Test(priority = 3)
  public void LogoutTest() {
	  
	  System.out.println(driver.getPageSource());
	 
	  
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
