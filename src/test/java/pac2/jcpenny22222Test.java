package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class jcpenny22222Test {
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  driver.findElement(By.xpath("//input[@id='searchInputId']")).sendKeys("sari");
	  driver.findElement(By.xpath("//span[@id='clear-search-text']")).click();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");
		
	  
		
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
