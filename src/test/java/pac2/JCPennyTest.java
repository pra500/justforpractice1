package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class JCPennyTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");

		driver.findElement(By.cssSelector("input#searchInputId")).clear();
		driver.findElement(By.cssSelector("input#searchInputId")).sendKeys("tshirt");

		driver.findElement(By.xpath("//span[normalize-space()='womens t shirts']")).click();
		driver.findElement(By.xpath("(//a[@data-automation-id='product-title'])[1]")).click();

	}

	//@Test(priority = 1)
	public void productpage1Test() {

		driver.findElement(By.xpath("//button[text()=' Reviews']")).click();

		String review1 = driver
				.findElement(By.xpath("//h3[text()='    Was great, fit great, wish the sleeves were longer   ']"))
				.getText();

		Assert.assertTrue(review1.contains("Was"));

	}

	//@Test(priority = 2)
	public void productpage2Test() {

		driver.findElement(By.xpath("//button[@data-for='American Navy']")).click();

		driver.findElement(By.xpath("//button[text()='petites']")).click();
		driver.findElement(By.xpath("//button[text()='petite small']")).click();
		String text1 = driver.findElement(By.xpath("(//p[text()='POWER PENNEY DEAL!'])[1]")).getText();

		Assert.assertTrue(text1.contains("DEAL!"));

		driver.findElement(By.xpath("(//div[@data-automation-id='deliveryOptionRadioBtnLabel'])[1]")).click();

	}

	//@Test(priority = 3, dependsOnMethods = "productpage2Test")
	@Test(priority = 3)
	public void productpage3Test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("(//div[@data-automation-id='deliveryOptionRadioBtnLabel'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='find-store-input-field']")).sendKeys("560045");
		
				
		driver.findElement(By.xpath("//button[@data-automation-id='search-by-zipcode']")).click();
		
		
		Thread.sleep(5000);
				
		String msg=driver.findElement(By.xpath("//p[text()='Sorry, there are no stores nearby. Just in case, make sure you entered a valid city, state, or ZIP Code.']")).getText();
		
		Assert.assertTrue(msg.contains("Sorry"));
		
		
		
	}
	
	//@Test(priority = 4)
	public void productpage4Test() {
		
		
		//input[@id='find-store-input-field']
		

	}


	
	
	@AfterMethod
	public void teardown() {

		driver.quit();

	}

}
