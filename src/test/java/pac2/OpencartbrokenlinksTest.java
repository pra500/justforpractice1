package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OpencartbrokenlinksTest {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {

	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("ruchi818@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("pra18@123");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		
		}

  
  
  @Test(priority = 1)
  public void fTest() {
	  
	  driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();
	  
	  List<WebElement> list=driver.findElements(By.tagName("//a"));
	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		  WebElement wb=list.get(i);
		 String sth=wb.getAttribute("//href");
		 brokenlinks(sth);
	  }
	 
  }
  
  
  public static void  brokenlinks(String s)
  {
	  try
	  {
		  URL url=new URL(s);
		  HttpURLConnection hp=(HttpURLConnection)url.openConnection();
		  hp.setConnectTimeout(4000);
		  hp.connect();
		  if(hp.getResponseCode()>=400)
           System.out.println(s + "this is a broken link");
		  
		  else
			  System.out.println(s + "this is not a broken link");		  
		 
	  }
	  
	  catch (Exception e) {
		e.printStackTrace();
	}
	  
	  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
