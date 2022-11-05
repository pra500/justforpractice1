package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class OnlyTesting2Test {
	
	
	WebDriver driver;

	  @BeforeClass
	  public void beforeClass() {
		  
		  

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

	  }
	  
 // @Test(priority = 1)
  public void multiselectTest() throws InterruptedException {
	    
	  WebElement wb = driver.findElement(By.xpath("//select[@name='FromLB']"));
		Select sel = new Select(wb);
		if(sel.isMultiple())
		{
			sel.selectByVisibleText("Italy");
			sel.selectByVisibleText("Spain");
			Thread.sleep(5000);
		}
		
		
		//https://www.softwaretestingmaterial.com/sample-webpage-to-automate/
	  
  }
  
  
  @Test(dataProvider = "ddd")
  public void get44(String sth, String sth1)
  {
	
	  System.out.println(sth + sth1);
  }
  
  
  
  @DataProvider(name="ddd")
  public Object[][] mydata1()
  {
	  return new Object[][] {{"un1", "pwd1"}};
	
	//return new Object[][] {{"un1", "pwd1"}, {"umm", "kkk"}, {"l", "li"}};
	
	  
  }
  
  
  
  
  
  
@Test(priority = 2)
public void tTest() {
  
  
	
	
	
	


	
  
  
}

  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
