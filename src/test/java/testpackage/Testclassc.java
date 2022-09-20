package testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.Login;
import utility.Pojo;

public class Testclassc extends Pojo
{
	 WebDriver driver;
	 
		@BeforeClass
		public void beforeclass()
		{
		WebDriver driver=openchromebrowser();
		this.driver=driver;
		}
		
		
		
		@Test(priority=1)
		public void homepage() throws InterruptedException
		{
	    Thread.sleep(1000);
			Homepage home = new Homepage(driver);
			boolean result=home.verifyadmintab();
			
	        Assert.assertTrue(result);
			
			
		}
		
		@Test(priority=0)  
		public void login()
		{
			Login obj = new Login(driver);
			obj.sendusername();
			obj.sendpassword();
			obj.clickonLoginbutton();
			
		}
		
}

