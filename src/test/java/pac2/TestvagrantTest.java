package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestvagrantTest {
	
	WebDriver driver;
	 
	  @BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
			
	  }
	
	
  @Test
  public void fTest() {
	  
	  //ReleaseDate
	 String releasedate=driver.findElement(By.xpath("//table[@class='infobox vevent']//tr//th//div[text()='Release date']")).getText();
	  System.out.println(releasedate);	  
	  Assert.assertTrue(releasedate.contains("Release"));
	  
	  //country
	  String country=driver.findElement(By.xpath("//table[@class='infobox vevent']//tr//th[text()='Country']")).getText();
	  System.out.println(country);
	  Assert.assertTrue(country.contains("Country"));
	  
	  
	  
  }
  
 
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
  
  

}
