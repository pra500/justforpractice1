package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ParalleltestingTest {
	
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://parabank.parasoft.com/parabank/openaccount.htm");

  }

  @Test(priority = 1)
  public void fTest() {
	  
	  String sth=driver.getTitle();
	  Assert.assertTrue(sth.contains("ParaBank | Error")); 
	
	  
	 WebElement wb= driver.findElement(By.xpath("(//a[text()='Products'])[2]"));
	 Actions act=new Actions(driver);
	 act.contextClick(wb).perform();
	 	 
	 
	 driver.findElement(By.xpath("(//a[text()='Locations'])[2]")).click();
	 
	 }
  
  
  //products right click, industries right click
  @Test(priority = 2)
  public void f1Test() {
	  
	  System.out.println(driver.getTitle());
	  
	  
	  
	 }
  
  
  
  //clk on cha
  @Test(priority = 3)
  public void f2Test() {
	  
	  System.out.println(driver.getTitle());
	  
	 }
  
  
  
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
