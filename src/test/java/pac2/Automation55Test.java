package pac2;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Automation55Test {
	
	WebDriver driver;

	@BeforeMethod
	@Parameters("Browser")
	public void beforeMethod(String br) {	
		
		if(br.equalsIgnoreCase("chrome"))
		{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else
		{
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		

	}

	// broken links
	@Test(priority = 1)
	public void fTest() throws IOException {

		List<WebElement> list = driver.findElements(By.tagName("//a"));
		System.out.println(list.size());
		for (int i = 0; i <= list.size() - 1; i++) {
			WebElement wb = list.get(i);
			String sh = wb.getAttribute("//href");
			totallinks(sh);
		}

	}

	public static void totallinks(String shhh) throws IOException {

		URL url = new URL(shhh);
		HttpURLConnection hp = (HttpURLConnection) url.openConnection();
		hp.setConnectTimeout(4000);
		hp.connect();
		if (hp.getResponseCode() >= 400) {
			System.out.println(shhh + "it's broken");
		} else {
			System.out.println(shhh + "it's not broken");
		}

	}

	@Test(priority = 2)
	public void f1Test() {

		driver.findElement(By.xpath("//b[normalize-space()='Cart']")).click();

		driver.findElement(By.xpath("//a[@title='Specials']")).click();

		WebElement wb = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("In stock");

	}

	//@Test(priority = 3, dependsOnMethods = "f1Test")
	public void f2Test() {

		WebElement wb1 = driver.findElement(By.xpath("//a[@title='My addresses']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb1);

	}

	//@Test(priority = 4, dependsOnMethods = "f1Test")
	public void f3Test() {

		WebElement wb2 = driver.findElement(By.xpath("//a[@title='Contact us']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb2);

		WebElement wb3 = driver.findElement(By.xpath("//select[@id='id_contact']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", wb3);

	}

	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
