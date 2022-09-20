package testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.Login;
import utility.Pojo;

public class Testclassd extends Pojo 
{
WebDriver driver;

	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver=openchromebrowser();
		this.driver=driver;
		
	}	
	
	/*
	@BeforeMethod
	public void beforeMethod()
	{
	System.setProperty("webdriver.chrome.driver","D:\\New folder (10)\\chromedriver.exe");
	     
	
	driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	*/
	
	@Test(priority=1)
	public void homepage() throws InterruptedException
	{
    Thread.sleep(1000);
		Homepage home = new Homepage(driver);
		boolean result=home.verifyadmintab();
		/*home.clickonpimtab();
		*/
		//String Actuakurl= driver.getCurrentUrl();
		//String Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		/*Assert.assertEquals(Actuakurl,Expectedurl );
       */
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
	/*@AfterMethod
	public void quit()
	{
       driver.quit();
	}
	/*@Test
	public void testC()
	{
	System.out.println("testC_classA");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod_class A");
	}
	/*@AfterClass
	public void afterclass()
	{
	System.out.println("afterclass_class A");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest_classA");
	}
	*/

}



