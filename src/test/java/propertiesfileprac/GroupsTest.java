package propertiesfileprac;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GroupsTest {
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");
  }

  @Test(groups = {"sanity"})
  public void fTest() {
	  
	  String title=driver.getTitle();	  
	  Assert.assertTrue(title.contains("Window"));
	  
	  
  }
  

  @Test(groups = {"sanity"})
  public void f1Test() throws InterruptedException {
	  
 boolean b=driver.findElement(By.xpath("//button[@class='iQ2RY tooltip GWA60']")).isDisplayed();
 Assert.assertTrue(b); 
	
  }
  
  

  @Test(groups = {"smoke"})
  public void f2Test() {
	
	  boolean b=driver.findElement(By.xpath("//a[@id='header-accessible-view']")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  
  

  @Test(groups = {"smoke"})
  public void f3Test() {
	  boolean b=driver.findElement(By.xpath("//div[@class='gAUl-']")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
