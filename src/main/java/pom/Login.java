package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
		@FindBy (xpath="//input[@name='username']")
	    private WebElement username;
	   
	   
	  @FindBy (xpath="//input[@type='password']")
	  private WebElement password;
	  
	  @FindBy (xpath="//button[@type='submit']")
	   private WebElement Loginbutton;
	  

	public  Login(WebDriver driver)
	   {
	    
	  PageFactory.initElements(driver,this);
		   
	   }
	   
	   public void sendusername()
	   {
		  username.sendKeys("Admin"); 
	   }
	   public void sendpassword()
	   {
		   password.sendKeys("admin123");
	   }
	  public void clickonLoginbutton()
	  {
	 Loginbutton.click();
	   }
	  

	}
			









































