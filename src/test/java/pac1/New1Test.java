package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class New1Test {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
            
		//driver initialization****************
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragtigupta18@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pra18@123");
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		
	}

	// TC1:Verify if the user clicks on "Our stores" link then he will be landing on
	// "stores" page and verify the page title as "Stores - My Store"
	@Test(priority = 1)
	public void verifytitleTest() {

		driver.findElement(By.xpath("//a[@title='Our stores']")).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Stores"));

	}

	// TC2: Verify if the user enters "Bangalore" in "your location" text box and
	// selects "25" in "radius" and click on "search" btn, then an alert box will be
	// displayed
	// having the msg as "Bangalore not found" and the user should be able to close
	// it
	@Test(priority = 2)
	public void enterlocationTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[@title='Our stores']")).click();
		driver.findElement(By.xpath("//input[@class='form-control grey']")).clear();

		driver.findElement(By.xpath("//input[@class='form-control grey']")).sendKeys("Goa");

		WebElement wb = driver.findElement(By.id("radiusSelect"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("25");

		driver.findElement(By.xpath("//button[@name='search_locations']")).click();

		driver.findElement(By.xpath("//a[@title='Close']")).click();

	}

	// TC3: Verify if the user is able to click on "My credit slips" link then
	// should be navigated to the "credit slips" page and verify the msg as "You
	// have not received any credit slips."
	@Test(priority = 3)
	public void verifycreditslipsTest() {
		driver.findElement(By.xpath("//a[@title='Our stores']")).click();
		driver.findElement(By.xpath("//a[@title='My credit slips']")).click();

		String msg = driver.findElement(By.xpath("//p[text()='You have not received any credit slips.']")).getText();
		Assert.assertTrue(msg.contains("You"));

	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

}
