package pac2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
	
	public static void getlinks(String link) throws IOException
	{
		try
		{
			
		
		URL ui=new URL(link);
		HttpURLConnection hp=(HttpURLConnection) ui.openConnection();
		hp.setConnectTimeout(2000);
		hp.connect();
		
		if(hp.getResponseCode()>=400)
		System.out.println(link + "broken");
		
		else
		{
			System.out.println(link + "not broken");
		}
		
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17");
		 // driver.findElement(By.xpath("//img[@id='Image1_img']")).click();
		  //driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();	
	// driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-live']")).click();
		  
	 
	List<WebElement> list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for(int i=0;i<=list.size()-1;i++)
	{
		WebElement wb=list.get(i);
		String sth=wb.getAttribute("href");
		getlinks(sth);
		
	}
	
	driver.close();
		
	
	
	
	
		

	}

}
