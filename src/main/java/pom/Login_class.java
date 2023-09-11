package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_class
{
	WebDriver driver;
	@FindBy (xpath="//a[text()= 'Login']")WebElement loginbutton;
	
	public Login_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;  //to inti this driver as a globally
		
	}
	
	public void login()
	{
		loginbutton.click();
	}
	

}
