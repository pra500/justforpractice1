package pac1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class New35Test {
 
	
	@DataProvider(name="mydata1")
	public Object[][] getdata()	
	{
		
		Object[][] arr1=new Object[1][1];
		
		arr1[0][0]="prag";
		arr1[0][1]="yy";
		
		return arr1;
				
		
	}
  
  
  
	@Test(dataProvider = "mydata1")
	public void geee(String name, String fname)
	{
		
		
		
	}
	
	
  
  
}
