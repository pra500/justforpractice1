package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JCPenny1Test {
	
	WebDriver driver;
	
	 
	  @BeforeClass
	  public void beforeClass() {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.jcpenney.com/");
		  
		  
		  
	  }
	  
	  
	  @Test(priority = 1)
	  public void f1Test() {
		  String title=driver.getTitle();
		  
		  Assert.assertTrue(title.contains("Window"));
		  
	  }
	  
	
  @Test(priority = 2)
  public void fTest() throws InterruptedException {
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//button[@class='iQ2RY tooltip GWA60']"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).perform();
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
	  Thread.sleep(4000);
	  
	//div[@class='wrapper m6ZNx _7XRra kR8H8 E4yrw _9-S-1 _8PzpA C4wQA']
	 
	 // driver.findElement(By.xpath("//div[@class='wrapper m6ZNx _7XRra kR8H8 E4yrw _9-S-1 _8PzpA C4wQA']//label[text()='First Name']")).sendKeys("prachi");
	
	  
	  /*
	  
	  driver.findElement(By.xpath("//label[@for='firstName']")).sendKeys("prachi");
	  driver.findElement(By.xpath("//label[@for='lastName']")).sendKeys("gupta");
	  
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9198970000");
	  
	  driver.findElement(By.xpath("//input[@id='createAccountEmail']")).sendKeys("Vivian_Evans3064@extex.org");
	  
	 
	  
	  
	  
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pra18@890P");
	 driver.findElement(By.xpath("//label[@for='keepMeLogged']")).click();
	 
	 
	 driver.findElement(By.xpath("//button[@data-automation-id='submit_button']")).click();
	 */
  }

  
 

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
