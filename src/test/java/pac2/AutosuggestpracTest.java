package pac2;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AutosuggestpracTest {
	
	WebDriver driver;
	 

	
  @BeforeClass
  public void beforeClass() {
	   
	         WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	
			driver.get("https://www.amazon.in/");

  }

  
  @Test(priority = 1)
  public void autosuggestTest() {
	  
	  SoftAssert sf=new SoftAssert();
	  
	  
	 boolean b=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed();
	 sf.assertTrue(b);
	  	
	 //wrong xpath:
	 boolean b1= driver.findElement(By.xpath("//span[normalize-space()='& Orde33rs']")).isDisplayed();
	  sf.assertTrue(b1);
	  	
	  
	  System.out.println("hello");
	  
	  sf.assertEquals(12, 12);
	  
	  System.out.println("hello1");
	  
	  driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	  
	  sf.assertAll();
	  
  }
  

  
  
  @Test(priority = 2)
  public void autosuggest1Test() {
	  
	  
	  SoftAssert sf1=new SoftAssert();
	  
	  System.out.println("world");
	  sf1.assertEquals(12, 13);
	  
	  sf1.assertEquals(14, 14);
	  
	  System.out.println("world1");
	  
	  System.out.println("world1");
	  
	  System.out.println("world1");
	  
	 sf1.assertAll();
	  
	 	  
	
	  
  }
  
  
  @Test(priority = 3)
  public void autosuggest2Test() {
	 
	
	 
  }
  
  
  
  @Test(priority = 4)
  public void autosuggest3Test() {
	 
	  
	
	  
  }
 
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
