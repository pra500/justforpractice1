package propertiesfileprac;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Propertiesfileprac1Test {
	
	WebDriver driver;
  
  @BeforeClass
  public void setup() {
	       WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
			driver.get("http://automationpractice.com/index.php");

  }
  
  
  @Test(priority = 1)
  public void fTest() throws IOException {
	  
	  
	  File file=new File("C:\\Users\\dell\\eclipse-workspace\\Prep\\src\\test\\java\\propertiesfileprac\\conddd.properties");
	  FileInputStream fip=new FileInputStream(file);
	  Properties pr=new Properties();
	  pr.load(fip);
	  
//	  driver.findElement(By.id("search_query_top")).sendKeys("pants");
//	  driver.findElement(By.xpath("womenlink.xpath")).click();
//	  driver.findElement(By.xpath("contactuslink.xpath")).click();
//	  driver.findElement(By.xpath("emailaddress.xpath")).sendKeys("pragtigupta18@gmail.com");	  
//	  driver.findElement(By.xpath("orderreference.xpath")).sendKeys("GHJ890");
//	  driver.findElement(By.name("message.name")).sendKeys("test1");
//	  
	  
	 // driver.findElement(By.id(pr.getProperty("search_query_top"))).sendKeys("pants");
	  driver.findElement(By.xpath(pr.getProperty("womenlink.xpath"))).click();
	  driver.findElement(By.xpath(pr.getProperty("contactuslink.xpath"))).click();
	  driver.findElement(By.xpath(pr.getProperty("emailaddress.xpath"))).sendKeys("pragtigupta18@gmail.com");	
	  driver.findElement(By.xpath(pr.getProperty("orderreference.xpath"))).sendKeys("GHJ890");
	  driver.findElement(By.name(pr.getProperty("message.name"))).sendKeys("test1");
	  
  }
  

  @AfterClass
  public void teardown() {
	  
	  driver.quit();
  }

}
