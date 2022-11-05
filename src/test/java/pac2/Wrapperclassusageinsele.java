package pac2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapperclassusageinsele {
	

	public static void main(String[] args) {
		
		           WebDriver driver;	 
				   WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();	
					driver.get("https://www.amazon.in/");
					
		
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("coconut oil");
	
		

	}

}
