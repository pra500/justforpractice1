package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AutomationpracTest {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragtigupta18@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pra18@123");
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();

	}

	// TC1: verify the msg as "Newsletter : Invalid email address.", verify the
	// title as "My Store"
	@Test(priority = 1)
	public void newsletterclick() {

		
		driver.findElement(By.xpath("//button[@name='submitNewsletter']")).click();

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("My"));

		String msg1 = driver.findElement(By.xpath("//p[text()=' Newsletter : Invalid email address.']")).getText();
		Assert.assertTrue(msg1.contains("email"));

	}

	// TC2: click on "seleniumframework" link, verify the title as "Selenium Framework | Selenium, Cucumber, Ruby, Java et al."
	@Test(priority = 2)
	public void seleniumframeworkclick() {

		driver.findElement(By.xpath("//a[text()='Selenium Framework']")).click();

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Ruby"));
		
		

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
