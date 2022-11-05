package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTestOnly3TestingTest {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.findElement(By.xpath("//img[@id='Image1_img']")).click();

	}

	// verify title
	@Test(priority = 1)
	public void getTest() {

		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Most"));

	}

//verify Products and "App & Browser Testing Made Easy" 
	@Test(priority = 2)
	public void get1Test() {

		boolean b = driver.findElement(By.xpath("//button[@id='product-menu-toggle']")).isDisplayed();
		Assert.assertTrue(b);

		String text = driver.findElement(By.xpath("//h1[normalize-space()='App & Browser Testing Made Easy']"))
				.getText();
		Assert.assertTrue(text.contains("App"));

	}

//mouse hover on products menu and click on "app automate" option
	@Test(priority = 3)
	public void get2Test() {

		WebElement wb = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath(
				"//div[@class='dropdown-link-wrapper']//div[@class='dropdown-link-heading'][normalize-space()='App Automate']"))
				.click();

	}

	@Test(priority = 4)
	public void get3Test() {

		driver.findElement(By.xpath("//a[text()='Get started free']")).click();
		// driver.findElement(By.xpath("//a[text()='Sign in with Google']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sign up with Google']")).click();
		boolean b = driver.findElement(By.xpath("//a[normalize-space()='privacy policy']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
