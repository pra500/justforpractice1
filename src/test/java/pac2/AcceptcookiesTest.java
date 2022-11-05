package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AcceptcookiesTest {
	
	
	WebDriver driver;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/handling-cookies-in-selenium-webdriver/");
		Thread.sleep(3000);
  }

  
  
	
  @Test
  public void fTest() {
	  
	  
	  driver.findElement(By.xpath("//a[@class='cbtn btn_accept_ck allow__btn']")).click();
	  
	  
	  
	  
	  
	  
	  
  }
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
