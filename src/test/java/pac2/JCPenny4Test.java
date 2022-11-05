package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JCPenny4Test {
	
	
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
  }
  
  



  
  
  //@Test(priority = 1)
  public void productpagetest() {
	  
	 
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");
	  
	  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("tom");
	  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("peter11");
	  
	  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("h");  
	  	  
	  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("hii");
	  
	  driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("jiii");
	  
	  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("456677");
	  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("9098009966");
	  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("908");
	  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("tom133");
	  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("tom1@123");
	  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("tom1@123");
	  driver.findElement(By.xpath("//input[@value='Register']")).click();
	  
	 String title=driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")).getText();
	 Assert.assertTrue(title.contains("You"));
	 
	 
	 
	  
	  
	  
  }
  
  
  //@Test(priority = 2, dependsOnMethods = "productpagetest")
  public void product1pagetest() {
	  
	  driver.findElement(By.xpath("(//a[text()='Services'])[1]")).click();
	  String subheader=driver.findElement(By.xpath("//span[normalize-space()='Bookstore (Version 2.0)']")).getText();
	  Assert.assertTrue(subheader.contains("Bookstore (Version 2.0)"));
		 
	  
  }
  
 // @Test(priority = 3, dependsOnMethods = "productpagetest")
  public void product2pagetest() {
	  
	  driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();	  
	  
	  driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
	 
	 
	  
  }
  
 // @Test(priority = 4)
  public void product3pagetest() {
	  	 
	  
	  String title=driver.getTitle();
	 
	  Assert.assertTrue(title.contains("ParaBank"));
	  
	  //products 
	  
	  boolean b=driver.findElement(By.xpath("(//a[text()='Products'])[1]")).isEnabled();
	  Assert.assertTrue(b);
	  
	  
	  boolean b1=driver.findElement(By.xpath("(//a[text()='Services'])[1]")).isEnabled();
	  Assert.assertTrue(b1);
	  
	  
	  
	  boolean b2=driver.findElement(By.xpath("(//a[text()='Locations'])[1]")).isEnabled();
	  Assert.assertTrue(b2);
	  
	  
  }
  
  
  
  //@Test(priority = 5)
  public void product4pagetest() {
	  
	  
	  String title=driver.findElement(By.xpath("//a[normalize-space()='Forgot login info?']")).getText();
	  Assert.assertTrue(title.contains("Forgot"));
	  
	  
	  
	  String title1=driver.findElement(By.xpath("//a[text()='Register']")).getText();
	  Assert.assertTrue(title1.contains("Register"));
	  
  }
	  
  
  //admin click, clean, verify msg
  @Test(priority = 6)
  public void product5pagetest() {
	  
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Admin Page']")).click();
	  
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Clean']")).click();
	  
	  String msg=driver.findElement(By.xpath("//b[normalize-space()='Database Cleaned']")).getText();
	  Assert.assertTrue(msg.contains("Cleaned"));
	  
	  
  }
  
  //initialize, verify msg
  @Test(priority = 7, dependsOnMethods = "product5pagetest")
  public void product6lpagetest() {
	  
	 driver.findElement(By.xpath("//button[normalize-space()='Initialize']")).click();
	 
	 String msg=driver.findElement(By.xpath("//b[normalize-space()='Database Initialized']")).getText();
	 Assert.assertTrue(msg.contains("Database"));
	 
	  
	 
  }
  
  //select soap, enter something in soap endpoint, change bal, submit
  @Test(priority = 8, dependsOnMethods = "product6lpagetest")
  public void product7pagetest() {
	  
	  driver.findElement(By.xpath("//input[@id='accessMode1']")).click();
	  driver.findElement(By.xpath("//input[@id='soapEndpoint']")).clear();
	  
	  driver.findElement(By.xpath("//input[@id='soapEndpoint']")).sendKeys("abc1234");
	  
	  driver.findElement(By.xpath("//input[@id='initialBalance']")).clear();
	  driver.findElement(By.xpath("//input[@id='initialBalance']")).sendKeys("700");
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  
  }
  
  
  //click on "about us", capture the "www.parasoft.com"
  @Test(priority = 9)
  public void product8pagetest() {
	  
	  
	  
	  driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
	  String msg=driver.findElement(By.xpath("//p[contains(text(),'For more information about Parasoft solutions plea')]//a[normalize-space()='www.parasoft.com']")).getText();
	  Assert.assertTrue(msg.contains("www"));
		 
	  
  }
  
  //**************
  
  //site click, accept cookies, click on "solutions"
  @Test(priority = 9, dependsOnMethods = "product8pagetest")
  public void product8page1test() throws InterruptedException {
	    
	  
	  driver.findElement(By.xpath("//p[contains(text(),'For more information about Parasoft solutions plea')]//a[normalize-space()='www.parasoft.com']")).click();
	  
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
	  driver.findElement(By.xpath("//a[@title='Solutions']")).click();
	  
  }
  
	 
  //verify the url as "https://www.parasoft.com/solutions/", click on "explore products", verify the url as "https://www.parasoft.com/request-a-demo/"
  @Test(priority = 9)
  public void product8page2test() {
  }
  
  
  //click on "contact us", verify "support" and click on it
  @Test(priority = 9)
  public void product8page3test() {
  }
  
 
  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
