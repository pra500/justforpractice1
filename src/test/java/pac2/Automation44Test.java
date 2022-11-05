package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Automation44Test {

	WebDriver driver;


	@BeforeMethod
	public void beforemethod()
	{		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
	}
	
	
	@Test(priority = 1)
	public void firstpageTest() {

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());

		List<WebElement> textboxes = driver.findElements(By.xpath("//input"));
		System.out.println(textboxes.size());
		
		

	}

	@Test(priority = 2)
	public void ContactusTest() {

		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();

		WebElement wb = driver.findElement(By.xpath("//select[@id='id_contact']"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Customer service");

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragtigupta18@gmail.com");

		driver.findElement(By.xpath("//input[@id='id_order']")).clear();
		driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("prg3345");

		driver.findElement(By.xpath("//input[@id='fileUpload']")).sendKeys("C:\\Users\\dell\\Desktop\\pramod tips.txt");

	}

	@Test(priority = 3, dependsOnMethods = "ContactusTest")
	public void NewsletterTest() {

		driver.findElement(By.xpath("//input[@id='newsletter-input']")).clear();

		driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys("pragtigupta18@gmail.com");
		driver.findElement(By.xpath("//button[@name='submitNewsletter']")).click();

		String msg = driver.findElement(By.xpath("//p[@class='alert alert-danger']")).getText();

		Assert.assertTrue(msg.contains("This"));

	}

	
	@Test(priority = 4, dependsOnMethods = "NewsletterTest")
	public void cartTest() {

		driver.findElement(By.xpath("//b[normalize-space()='Cart']")).click();

		String st1 = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();

		Assert.assertTrue(st1.contains("is"));

		String syth = driver.findElement(By.xpath("//h1[@id='cart_title']")).getText();
		Assert.assertTrue(syth.contains("CART"));

	}
	
	
	

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
