package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OnlyTesting1Test {

	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

	}

	// multiselect drop down
	@Test(priority = 1)
	public void multiselectTest() {

		WebElement wb = driver.findElement(By.xpath("//select[@name='FromLB']"));
		Select sel = new Select(wb);
		List<WebElement> list = sel.getOptions();

		for (int i = 0; i <= list.size() - 1; i++) {
			
			if (list.get(i).getText().equalsIgnoreCase("Maxico")) {
				list.get(i).click();

				break;
			}
		}

		driver.findElement(By.xpath("//input[@value='->']")).click();

	}

	// show me prompt click, enter some data in it
	// @Test(priority = 2)
	public void showmepromptTest() {

	}

	// click on "browser stack" and accept the cookies and verify if the
	// "Developers" menu is present or not
	@Test(priority = 3)
	public void browserstackTest() {
		// img[@id='Image1_img']

		driver.findElement(By.xpath("//img[@alt='Sponsors List']")).click();

		driver.findElement(By.xpath("//button[text()=' Accept All ']")).click();

		String dev = driver.findElement(By.xpath("//button[@id='developers-menu-toggle']")).getText();

		Assert.assertTrue(dev.contains("Dev"));

	}

	
	@AfterClass
	
	public void afterClass() {

		driver.quit();
	}

}
