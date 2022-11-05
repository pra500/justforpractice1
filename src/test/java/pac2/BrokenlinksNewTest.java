package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrokenlinksNewTest {
	
	WebDriver driver;
	

  @BeforeClass
  public void beforeClass() {

        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();			
		driver.get("https://www.orangehrm.com/");

  }
  
  @Test(priority = 1)
  public void fTest() throws IOException {
	  
	  List<WebElement> list=driver.findElements(By.tagName("a"));
	  System.out.println(list.size());
		for(int i=0;i<=list.size()-1;i++)
		{
			WebElement wb=list.get(i);
			String sth=wb.getAttribute("href");
			getlinks(sth);
			
		}
		
  }
  
  public static void getlinks(String link) throws IOException
	{
		try
		{
			
		
		URL ui=new URL(link);
		HttpURLConnection hp=(HttpURLConnection) ui.openConnection();
		hp.setConnectTimeout(2000);
		hp.connect();
		
		if(hp.getResponseCode()==200)
		{
		System.out.println(link + "not broken");
		}
		else if(hp.getResponseCode()==hp.HTTP_NOT_FOUND)
		{
			System.out.println(link + "broken");
		}
		
	
	}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
