package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TechbeamersTest {
	WebDriver driver;

	//@BeforeClass
	public void beforeClass() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/#4httpthe-internetherokuappcom");

	}

	//@Test(priority = 1)
	public void fTest() {

		WebElement wb = driver.findElement(By.xpath("//span[normalize-space()='Tutorials']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//span[normalize-space()='C Programming']")).click();

		String pagetitle = driver.findElement(By.xpath("//h1[@class='page-header-title clr']")).getText();
		Assert.assertTrue(pagetitle.contains("Category"));

	}

	
	@Test(priority = 2)
	@Parameters("browser")
	public void f1Test(String b) {
		
		if(b.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(
					"https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/#4httpthe-internetherokuappcom");

		}
		
		else 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(
					"https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/#4httpthe-internetherokuappcom");
				
		}			
			

		WebElement wb = driver.findElement(By.xpath("//span[normalize-space()='Tutorials']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//span[normalize-space()='Linux Tutorial']")).click();

		String pagetitle = driver.findElement(By.xpath("//h1[@class='page-header-title clr']")).getText();
		Assert.assertTrue(pagetitle.contains("Category"));
			
	}

	//@Test(priority = 3, dependsOnMethods = "fTest")
	public void f2Test() {

		WebElement wb = driver.findElement(By.xpath("//span[normalize-space()='Tutorials']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//span[normalize-space()='MySQL Tutorial']")).click();

		String pagetitle = driver.findElement(By.xpath("//h1[@class='page-header-title clr']")).getText();
		Assert.assertTrue(pagetitle.contains("Category"));

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
