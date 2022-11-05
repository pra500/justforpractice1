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

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TodayspracTest {
	WebDriver driver;

  @BeforeClass
  public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");

	  
	  
  }
	
  @Test
  public void fTest() throws IOException {
	  
	  File fe=new File("\\Users\\dell\\eclipse-workspace\\Prep\\tod.properties");
	  FileInputStream fip=new FileInputStream(fe);
	  Properties prop=new Properties();
	  prop.load(fip);
	  
	  driver.findElement(By.xpath(prop.getProperty("toysandgames.xpath"))).click();
	  
	  
	  
	  
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(200, 330)", "");
	  
	  boolean b= driver.findElement(By.xpath(prop.getProperty("findastore.xpath"))).isDisplayed();
	  System.out.println(b);  
	  
	  driver.navigate().to("https://www.browserstack.com/guide/login-automation-using-selenium-webdriver");
	  boolean b1= driver.findElement(By.id(prop.getProperty("bethefirst.id"))).isDisplayed();
	  System.out.println(b1);
	  
	  
	  
	  
	  
	  
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
