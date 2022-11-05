package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NeTest {
	
	WebDriver driver;
	
  
  @BeforeMethod
  public void beforeMethod() {
	  
	            WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  }
  
  @Test(priority = 1)
  public void fTest() {
	 
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //js.executeScript(document.getElementById("email").value="pragtigupta18@gmail.com";"));
	  
	  js.executeScript("document.getElementById('email').value='pragtigupta18@gmail.com';");
	  
	  js.executeScript("document.getElementById('passwd').value='pra18@123';");
	  
	  js.executeScript("document.getElementById('SubmitLogin').click();");
	 
  }
  
  
  @Test(priority = 2)
  public void f1Test() {
	  
	  
	  driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");
	  
	 WebElement wb= driver.findElement(By.xpath("(//a[text()='Locations'])[1]"));	 
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", wb);
    
    
    JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("window.scrollBy(200, 300)", "");
    
    
   
    
    
    
    
    
    
    
    
    

	  
	
	  
	  
  }
  
  @Test(priority = 3)
  public void f2Test() {
	  System.out.println(driver.getTitle());
	  
	  
  }
  
  @Test(priority = 4)
  public void f3Test() {	
	  System.out.println(driver.getTitle());
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
