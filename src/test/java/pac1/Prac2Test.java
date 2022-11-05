package pac1;

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

public class Prac2Test {
	
	WebDriver driver;
	
	
 
  @BeforeClass
  public void beforeClass(){
	  
	     WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17");
		
	
	
	  	  
  }
  
  
  
  @Test(priority = 1)
  public void fTest() throws IOException {
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Prep\\JC.properties");
		FileInputStream fip=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fip);
	  
	 boolean b= driver.findElement(By.xpath(pr.getProperty("search.xpath"))).isDisplayed();
	 System.out.println(b);
	 
	 driver.findElement(By.xpath(pr.getProperty("laptops.xpath"))).click();
	  
	 boolean b1= driver.findElement(By.xpath(pr.getProperty("heading.xpath"))).isDisplayed();
	 System.out.println(b1);
	 
  }

  
  @Test(priority = 2)
  public void f1Test() {
		String title=driver.getTitle();
		System.out.println(title);
	 
  }
  
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
