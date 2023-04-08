package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective business libraries of login page
 * @author Kamlesh B
 *
 */
public class Login
{
	//declaration
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	private WebElement emailTextbox;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	private WebElement loginTab;
	
	@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
	private WebElement continueTab;
	
	@FindBy(xpath = "//input/following-sibling::a[text()=\"Forgotten Password\"]")
	private WebElement forgotPasswordTab;

	
	//initialization
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	/**
	 * This method will write the data into the email and password text box
	 * @param email
	 * @param password
	 */
	public void setLoginInfo(String email, String password)
	{
		emailTextbox.sendKeys(email);
		passwordTextbox.sendKeys(password);
	}

	/**
	 * This method will click on login button
	 */
	public void clickOnLoginButton()
	{
		loginTab.click();
	}
	
	/**
	 * This method will click on continue 
	 */
	public void clickOnContinueButton()
	{
		continueTab.click();
	}
	
	/**
	 * This method will click on forgot password 
	 */
	public void clickOnForgotPasswordButton()
	{
		forgotPasswordTab.click();
	}
	
	
}
