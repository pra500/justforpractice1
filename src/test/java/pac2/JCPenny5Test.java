package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JCPenny5Test {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");

	}

	
	// Careers, if logic, enter software - IT Technician
	@Test(priority = 1)
	public void careeslinks1Test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@aria-label='Careers']")).click();
		Set<String> set=driver.getWindowHandles();
		
		
		Iterator<String> itr=set.iterator();
		String par=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		
		String tet=driver.findElement(By.xpath("//span[text()='Careers at JCPenney']")).getText();
		System.out.println(tet);
		Assert.assertTrue(tet.contains("at"));
		
		
		
		
		

	}
	
	//learn more, click on sign in
	@Test(priority = 2, dependsOnMethods = "careeslinks1Test")
	public void careeslinks2Test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@href='/pages/why-jcp'][normalize-space()='Learn more »']")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(), 'Sign In')])[2]")).click();
		
	}
	
	
	
	
	//click on "my job applications", clk on "reset account"
	@Test(priority = 3, dependsOnMethods = "careeslinks2Test" )
	public void careeslinks3Test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//li[@id='HRS_SCH_WRK$0_row_2']")).click();
		
Set<String> set=driver.getWindowHandles();
		
		
		Iterator<String> itr=set.iterator();
		String par=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
				
		//***************************  			
		
		
		driver.findElement(By.xpath("//a[text()='Reset Account']")).click();
		
		
		
	}
	
	//hover on SSN card	
	
	@Test(priority = 4, dependsOnMethods = "careeslinks3Test")
	public void careeslinks4Test() throws InterruptedException {
		
		WebElement wb=driver.findElement(By.cssSelector("input#JCP_REREG_WRK_NATIONAL_ID"));		
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		
				
	}	
		
	
	

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
