package propertiesfileprac;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NeweeeeTest {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	   WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().maximize();			
				driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
  }

  @Test
  public void fTest() throws IOException {
	  
	  File f=new File("C:\\Users\\dell\\eclipse-workspace\\Prep\\src\\test\\java\\propertiesfileprac\\form333.properties");
	  FileInputStream fip=new FileInputStream(f);
	  Properties prop=new Properties();
	  prop.load(fip);
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	
	  
	  
	  
	  
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
