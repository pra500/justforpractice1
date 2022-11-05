package propertiesfileprac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New1Test {
	
	WebDriver driver;
	
  @Test
  public void fTest() throws IOException {
	  
	  File fi=new File("C:\\Users\\dell\\eclipse-workspace\\Prep\\abc.properties");	  
	  FileInputStream fip=new FileInputStream(fi);	  
	  Properties prop=new Properties();
	  prop.load(fip);
	  
	      WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
driver.findElement(By.xpath(prop.getProperty("opencart.accountpage.emailaddress.xpath"))).sendKeys("pragtigupta18@gmail.com");
driver.findElement(By.xpath(prop.getProperty("opencart.accountpage.password.xpath"))).sendKeys("pra18@123");
driver.findElement(By.xpath(prop.getProperty("opencart.accountpage.login.xpath"))).click();		

driver.findElement(By.xpath(prop.getProperty("opencart.accountpage.Edityouraccountinformation.xpath"))).click();

String heading1=driver.findElement(By.xpath(prop.getProperty("opencart.accountpage.heading"))).getText();
System.out.println(heading1);

driver.findElement(By.xpath(prop.getProperty("add"))).click();










			
	
	  driver.quit();
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
