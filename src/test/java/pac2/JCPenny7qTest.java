package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JCPenny7qTest {

	WebDriver driver;


	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");

	}

	@Test(priority = 1)
	public void f1Test() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Window"));

		WebElement wb = driver.findElement(By.xpath("//div[contains(text(),'Men')]"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		String header = driver.findElement(By.xpath("//h1[@data-automation-id='headerTag']")).getText();
		Assert.assertTrue(header.contains("Men"));				

	}

	@Test(priority = 2)
	public void f2Test() {

		WebElement wb = driver.findElement(By.xpath("//div[normalize-space()='Young Adult']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//a[normalize-space()='Airwalk']")).click();
		String header = driver.findElement(By.xpath("//h1[@data-automation-id='headerTag']")).getText();
		Assert.assertTrue(header.contains("Men"));

	}

	@Test(priority = 3)
	public void f3Test() {

		WebElement wb = driver.findElement(By.xpath("(//div[normalize-space()='Women'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//a[contains(text(),'New Arrivals')]")).click();

	//String header = driver.findElement(By.xpath("//h1[@data-automation-id='headerTag']")).getText();
		//Assert.assertTrue(header.contains("Women"));
		
		
		String header = driver.findElement(By.xpath("//p[text()='Tops ']")).getText();
		Assert.assertTrue(header.contains("Tops"));

	}

	@Test(priority = 4)
	public void f4Test() {
		

		driver.findElement(By.xpath("//a[@title='JCPenney Home']")).click();

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());

		for (int i = 0; i <= links.size() - 1; i++) {
			if (links.get(i).getText().equalsIgnoreCase("Rebates")) {
				WebElement wb = links.get(i);
				wb.click();
				break;
			}
		}

		String header = driver.findElement(By.xpath("//h1[text()='Rebate Center']")).getText();
		Assert.assertTrue(header.contains("Rebate"));

	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
