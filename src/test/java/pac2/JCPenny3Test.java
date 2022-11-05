package pac2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class JCPenny3Test {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");

	}

	// click on men, shirts
	//@Test(priority = 1)
	public void menTest() {
		WebElement wb = driver.findElement(By.xpath("//div[normalize-space()='Men']"));
		Actions act = new Actions(driver);

		act.moveToElement(wb).perform();

		driver.findElement(By.xpath(
				"//li[@id='subMenuLevel3:1']//a[@class='iQ2RY dZvy3 VhxJp _06mTn yOFxD B93GH EvPyV'][normalize-space()='Shirts']"))
				.click();

	}

	// fit , slim fit
	//@Test(priority = 2)
	public void shirtsTest() throws InterruptedException {
		driver.findElement(
				By.xpath("//h3[@id='accordionHeader22']//span[@class='ktUDO YMPh6 NzLvj'][normalize-space()='fit']"))
				.click();

		driver.findElement(By.xpath("(//span[text()='fit'])[2]")).click();

		WebElement wb = driver.findElement(By.xpath("//div[text()='Baby & Kids']"));

		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//a[normalize-space()='adidas']")).click();

	}

	//@Test(priority = 3)
	public void adidas1Test() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Shop all adidas Socks for Baby & Kids >>>>']")).click();

		String title = driver.getTitle();

		Assert.assertTrue(title.contains("for"));

	}

	//@Test(priority = 4)
	public void returnpolicyTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[@aria-label='Return Policy']")).click();
		driver.findElement(By.xpath("//span[text()='Some Exclusions Apply']")).click();

		String face = driver.findElement(By.xpath("//strong[text()='Face Masks:']")).getText();

		System.out.println(face);

	}

	//@Test(priority = 5)
		public void findastoreTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Find A Store']")).click();		
		
		
		driver.findElement(By.id("q")).sendKeys("560034", Keys.ENTER);
		

		driver.findElement(By.xpath("//a[text()='Browse By State']")).click();
		
		driver.findElement(By.xpath("//div[@class='Directory-content']//a[text()='California']")).click();
	
		

			

		}
		
		//@Test(priority = 6)
		public void returnpolicy1Test() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()='Find A Store']")).click();		
			
			
			driver.findElement(By.id("q")).sendKeys("560034", Keys.ENTER);
			

			driver.findElement(By.xpath("//a[text()='Browse By State']")).click();
			
			driver.findElement(By.xpath("//div[@class='Directory-content']//a[text()='California']")).click();
		
			
			//WebElement wb=driver.findElement(By.xpath("//img[@class='mk-1 hidden-xs hidden-sm col-md-3 js-lazy loaded']"));
			//wb.click();
			
		
		

			

		}
		
		@Test(priority = 7)
		public void returnpolicy2Test() {
			
			driver.findElement(By.xpath("//a[text()='Find A Store']")).click();		
			
			
			driver.findElement(By.id("q")).sendKeys("560034", Keys.ENTER);
			

			driver.findElement(By.xpath("//a[text()='Browse By State']")).click();
			
			driver.findElement(By.xpath("//div[@class='Directory-content']//a[text()='California']")).click();
			driver.findElement(By.xpath("//a[@aria-label='Company Info']")).click();
			
	
			String str=driver.findElement(By.xpath("//h1[text()='Mission and Values']")).getText();
			System.out.println(str);	
			
			

		
		}
		
		//@Test(priority = 7)
		public void returnpolicy3Test() {
			
driver.findElement(By.xpath("//a[text()='Find A Store']")).click();		
			
			
			driver.findElement(By.id("q")).sendKeys("560034", Keys.ENTER);
			

			driver.findElement(By.xpath("//a[text()='Browse By State']")).click();
			
			driver.findElement(By.xpath("//div[@class='Directory-content']//a[text()='California']")).click();
			
			driver.findElement(By.xpath("//a[@aria-label='Rebates']")).click();
			
			driver.findElement(By.xpath("(//div[@class='list-group-item-heading clearfix'])[2]")).click();
			
			
		}
		
		
		@Test(priority = 8)
		public void get1Test() {
			
			driver.findElement(By.xpath("//div[@class='gAUl-']")).click();
			
			driver.findElement(By.xpath("//button[@id='start-shopping-btn']")).click();
			
			
		
		}
		
		
		//@Test(priority = 9)
		public void get11Test() {
			
          driver.findElement(By.xpath("//div[@class='gAUl-']")).click();
			
			driver.findElement(By.xpath("//button[@id='start-shopping-btn']")).click();
			
            String str=driver.getTitle();
            Assert.assertTrue(str.contains("Sales"));
			
			
		
		}
		
		
		
		//@Test(priority = 10)
		public void get111Test() {
			
			  driver.findElement(By.xpath("//div[@class='gAUl-']")).click();
				
				driver.findElement(By.xpath("//button[@id='start-shopping-btn']")).click();
				
				WebElement wb=driver.findElement(By.xpath("//div[normalize-space()='Toys & Games']"));
				Actions act=new Actions(driver);
				act.moveToElement(wb).perform();
				
				driver.findElement(By.xpath("//a[normalize-space()='Barbie']")).click();
		
		}
		
		
		@Test(priority = 11)
		public void creditcard1Test() throws InterruptedException {
			
			//a[@class='applyBtn']
			
			driver.findElement(By.xpath("//a[@aria-label='Credit Card Benefits']")).click();
			
			
			driver.findElement(By.xpath("//a[@class='applyBtn']")).click();
			//Thread.sleep(4000);
			
			Set<String> set1=driver.getWindowHandles();
			Iterator<String> itr=set1.iterator();
			String ch=itr.next();
			String pa=itr.next();
			
			driver.switchTo().window(ch);
			System.out.println(driver.getTitle());
			
			
			//driver.findElement(By.xpath("//input[@title='Last 4 Digits of your SSN/ITIN']")).sendKeys("6789");
			//driver.findElement(By.xpath("(//input[@class='inputWrap'])[2]")).sendKeys("9800778833");
			
		
		}
		

		@Test(priority = 12)
		public void creditcard2Test() {
			
			driver.navigate().refresh();
			List<WebElement> list=driver.findElements(By.xpath("//a"));
			
			
			for(int i=0;i<=list.size()-1;i++)
			{
				if(list.get(i).getText().equalsIgnoreCase("Rebates"))
				{
					System.out.println(list.get(i).getText());
					break;
			}
			}
			
			
			
			
			
			
		
		}
		

		@Test(priority = 13)
		public void creditcard3Test() {
			
			
			
			
			
			
			
		
		}
		

		@Test(priority = 14)
		public void creditcard4Test() {
			
			
			
			
			
			
			
		
		}
		
		
		
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
