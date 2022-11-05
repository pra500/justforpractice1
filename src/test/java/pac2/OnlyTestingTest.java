package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class OnlyTestingTest {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

	}

	@Test(priority = 1)
	public void fileTest() {

		driver.findElement(By.xpath("//input[@name='img']")).sendKeys("C:\\Users\\dell\\Desktop\\amuthan api.txt");

	}

	@Test(priority = 2)
	public void dropdownTest() {

		WebElement wb = driver.findElement(By.xpath("//select[@name='FromLB']"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Russia");
		driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
