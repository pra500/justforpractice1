package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HardandSoftAssertTest {
	WebDriver driver;
	 

 
  @BeforeClass
  public void beforeClass() {

      WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/");
		
	  
	  
  }

  @Test
  public void fTest() {
  }
  
  @Test
  public void f1Test() {
  }
  
  @Test
  public void f2Test() {
  }
  
  @Test
  public void f3Test() {
  }
  @AfterClass
  public void afterClass() {
  }

}
