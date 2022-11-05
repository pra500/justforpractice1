package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {

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
	
	@Test(priority = 1)
	public void verifyfiltersTest() {
		driver.findElement(By.xpath("//a[normalize-space()='New products']")).click();

		String msg = driver.findElement(By.xpath("//p[contains(text(), 'No new products.')]")).getText();
		Assert.assertTrue(msg.contains("No"));
	}

	@Test(priority = 2)
	public void vrrifyyellowdressTest() {
		driver.findElement(By.xpath("//a[normalize-space()='New products']")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Printed Chiffon Dress'])[1]")).click();

		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}

	@Test(priority = 3)
	public void vrrifyyellowdress2Test() {
		driver.findElement(By.xpath("//a[normalize-space()='Best sellers']")).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Best"));

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
