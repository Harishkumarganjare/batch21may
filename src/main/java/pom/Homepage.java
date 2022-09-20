package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	
	WebDriver driver ;

	@FindBy (xpath="//span[(text()='Admin')]")
	private WebElement Admintab;
   


	@FindBy (xpath ="//span[(text()='PIM')]")
	private WebElement pimtab;
	
	 public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver= driver;
	}
       public boolean verifyadmintab()
       {
    	boolean result = Admintab.isDisplayed();
    	return result;
       }
       public void clickonpimtab()
       {
    	   pimtab.click();
       }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

