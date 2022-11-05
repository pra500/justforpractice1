package pac2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewrTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		

	}
	
  @Test(priority = 1)
  public void fTest() {
	  
	  driver.findElement(By.xpath("//img[@id='Image1_img']")).click();
	  driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();	
	 
	  
	  
	  
  }
  
  @Test(priority = 2, dependsOnMethods = "fTest")
  public void f1Test() throws IOException {	  
	  
	   
	  List<WebElement> list=driver.findElements(By.tagName("//a"));	  
	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		  WebElement wb=list.get(i);
		  String sh=wb.getAttribute("href"); 
		  brokenlinks1(sh);
		  
		  
	  }
	
  }
     
    
public static void brokenlinks1(String s) throws IOException {
	
	URL link = new URL(s);
	// Create a connection using URL object (i.e., link)
	HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
	//Set the timeout for 2 seconds
	httpConn.setConnectTimeout(2000);
	//connect using connect method
	httpConn.connect();

	//int count=0;
	int respCode = httpConn.getResponseCode();
	if(respCode >= 400){
	    System.out.println(link+" is a broken link");
	    
	}
	else{
	    System.out.println(link+" is a valid link");
	}
	
	
}
  
  
  

@Test(priority = 3, dependsOnMethods = "fTest")
  public void f2Test() {
	
	driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-automate']")).click();
	
	String s=driver.findElement(By.xpath("//a[@title='Integrations']//span[text()='Integrations']")).getText();
	System.out.println(s);
	
	driver.findElement(By.xpath("//a[@title='Integrations']//span[text()='Integrations']")).click();
	driver.findElement(By.xpath("//a[@class='btn-primary btn-lg col-md-3 has-local-scroll ']")).click();
	  
	  
  }
  
  //free trial
  @Test(priority = 4, dependsOnMethods = "fTest")
  public void f3Test() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']")).click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  boolean b=driver.findElement(By.xpath("//label[@for='tnc_checkbox']//a[@id='terms-url']")).isEnabled();
	  Assert.assertTrue(b);
	  
  }
  
  //click on developers and asserting 2-3 headings
  @Test(priority = 5, dependsOnMethods = "fTest")
  public void f4Test() {	 
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//span[text()='Developers '] "));
	  
	  //WebElement wb=driver.findElement(By.xpath("//button[@id='dev-menu-toggle']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).perform();
	  driver.findElement(By.xpath("//ul[@id='dev-menu-dropdown']//a[normalize-space()='Open Source']")).sendKeys(Keys.ENTER);
	  
	  
			
	  
  }
  
  //enter id , start test, capture the msg as "Enter your email to start your test and unleash the", navigate back
  @Test(priority = 6, dependsOnMethods = "fTest")
  public void f5Test() {
	  
	  driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-live']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='live-form-url']")).sendKeys("www.google.com");
	  driver.findElement(By.xpath("//input[@id='live-form-submit-btn']")).click();
	  
	 String msg= driver.findElement(By.xpath("//div[@class='signup-section__desc']")).getText();
	 System.out.println(msg);
	 
	 driver.navigate().back();
  }
  
  
  //pricing click, asserting "Desktop" and "Empower remote teams!", navigate back
  @Test(priority = 7, dependsOnMethods = "fTest")
  public void f6Test() {
	  
	  driver.findElement(By.xpath("//li[@class='pricing-menu-link']//a[@title='Pricing'][normalize-space()='Pricing']")).click();
	  
	 String desk= driver.findElement(By.xpath("//div[@data-mobile-view='false']//div[@class='plan-wrapper live-desktop-plan comparison-table-exp']//div[@class='plan-name'][normalize-space()='Desktop']")).getText();
	 Assert.assertTrue(desk.contains("Desk"));

	 String empower= driver.findElement(By.xpath("//div[contains(@class,'plan-wrapper enterprise-plan-wrapper comparison-table-exp')]//b[1]")).getText();
	 Assert.assertTrue(empower.contains("Empower"));

	
	  driver.navigate().back();
  }
  
  
  
  
  //products , app automate, view all features, geolocation testing
 @Test(priority = 8, dependsOnMethods = "fTest")
  public void f7Test() {
	 
	 WebElement wb=driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(wb).perform();
	 
	 
	  
	 driver.findElement(By.xpath("//a[@aria-label='App Automate']//div[@class='dropdown-link-heading'][normalize-space()='App Automate']")).click();
	 driver.findElement(By.xpath("//a[normalize-space()='View all features']")).click();
	 String Geolocation=driver.findElement(By.xpath("//span[normalize-space()='Geolocation testing']")).getText();
	 Assert.assertTrue(Geolocation.contains("Geolocation"));
	 
	 
	 driver.findElement(By.xpath("//span[normalize-space()='Geolocation testing']")).click();
	 Set<String> set=driver.getWindowHandles();
	 Iterator<String> itr=set.iterator();
	 String parent=itr.next();
	 String child=itr.next();
	 driver.switchTo().window(child);
	  
	  
  }
  
  //asserting  "GPS Geolocation testing" and "IP Geolocation testing"
 @Test(priority = 9, dependsOnMethods = "f7Test")
  public void f8Test() {
	  
	 String gps=driver.findElement(By.xpath("//a[normalize-space()='GPS Geolocation testing']")).getTagName();
	  
	 System.out.println(gps);
	 
	 String ip=driver.findElement(By.xpath("//a[normalize-space()='IP Geolocation testing']")).getTagName();
	 System.out.println(ip);
	 
	 
	 
	 
	 
	 
  }
  
 
 //tagname practice, broken links 
 
 @Test(priority = 9, dependsOnMethods = "f7Test")
 public void f9Test() {
	  
	 String gps=driver.findElement(By.xpath("//a[normalize-space()='GPS Geolocation testing']")).getTagName();	  
	 System.out.println(gps);
	 
	 String ip=driver.findElement(By.xpath("//a[normalize-space()='IP Geolocation testing']")).getTagName();
	 System.out.println(ip);
	 
	 driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
	 
	 String s1=driver.findElement(By.xpath("//input[@id='text2']")).getTagName();
	 System.out.println(s1);
	 
	 
	 String s2=driver.findElement(By.xpath("//input[@id='radio1']")).getTagName();
	 System.out.println(s2);
	 
	 String s3=driver.findElement(By.xpath("//input[@id='check1']")).getTagName();
	 System.out.println(s3);
	 
	 
 }
 
 @Test(priority = 9, dependsOnMethods = "f8Test")
 public void f10Test() {
	  
	 driver.findElement(By.xpath("//a[normalize-space()='documentation']")).click();
	 
	 String simulate=driver.findElement(By.xpath("//a[normalize-space()='Simulate device offline and airplane mode']")).getText();
	 Assert.assertTrue(simulate.contains("device"));
	 
	 
	 
	 
 }
 
 
 
 @Test(priority = 9, dependsOnMethods = "fTest")
 public void f11Test() {
	  
	//span[@class='item-text'][normalize-space()='Percy']
	 
	 
	 
	 
 }
 
 
 //@Test(priority = 9)
 public void f12Test() {
	  
	
	 
	 
	 
	 
 }
 
 
 
 //@Test(priority = 9, dependsOnMethods = "")
 public void f13est() {
	  
	
	 
	 
	 
	 
 }
 
 
 
// @Test(priority = 9, dependsOnMethods = "")
 public void f14Test() {
	  
	
	 
	 
	 
	 
 }
 
 
 
  

	@AfterClass
	public void afterClass() {

		driver.quit();
	}
}
