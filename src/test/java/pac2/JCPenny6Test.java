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

public class JCPenny6Test {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.onlineinterviewquestions.com/selenium-interview-questions/");
	}

	// print total links, total textboxes
	@Test(priority = 1)
	public void fTest() {

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());

		List<WebElement> inputboxes = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(inputboxes.size());

	}

	// click on "hibernate" link, then first link, then subscribe, capture the msg
	@Test(priority = 2)
	public void f1Test() {

		driver.findElement(By.cssSelector("a[href='/programming/']")).click();
		String urli = driver.getCurrentUrl();
		System.out.println(urli);

	}

	// click on java play f/w, get the url and print it, close the pop up
	@Test(priority = 3)
	public void f2Test() {

		driver.findElement(By.cssSelector("a[href='/microsoft/']")).isDisplayed();
		String urli = driver.getCurrentUrl();
		System.out.println(urli);

	}

	@Test(priority = 4)
	public void f3Test() {

		driver.findElement(By.xpath("//a[@href='https://www.onlineinterviewquestions.com/java/']")).isDisplayed();
		
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
