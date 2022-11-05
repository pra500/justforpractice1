package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

//parallel testing, dependson, frames



public class Automation56Test  {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/frames");
			
			
	  }
	 
	 
 // @Test(priority = 1)
  public void framesTest() {
	  	  
	  //NEED TO CHK ****************************************************************************************
	  
	    
	  
	  
	  //id
	  //name
	  //xpath: 
	 // driver.switchTo().frame("frame1");
	  
	 WebElement wb= driver.findElement(By.xpath("//iframe[@id='frame1']")); 
			  
	 driver.switchTo().frame(wb);
	  String heading=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();	  
	  
	  Assert.assertTrue(heading.contains("is")); 
	  
	 driver.switchTo().defaultContent();
	  
	driver.switchTo().frame("frame2");
	String heading2=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	  
	  Assert.assertTrue(heading2.contains("is")); 
	  
	  driver.switchTo().defaultContent();
	  
	  
	  driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
	  
	  String heading3= driver.findElement(By.xpath("//span[text()='Ad closed by ']")).getText();
	  Assert.assertTrue(heading3.contains("Ad")); 	 	
	  
	  driver.switchTo().defaultContent();
	  
  }
 
  
  //@Test(priority = 2)
  public void f1Test() {
	  
	  
	  
	  
	  
	  
	  
  }
 
 

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
