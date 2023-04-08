package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective business libraries of Register page
 * @author Kamlesh B
 *
 */
public class Register 
{
	//declaration
	@FindBy(xpath="//input[@name=\"firstname\"]")
	private WebElement firstnameTextbox;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement lastnameTextbox;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	private WebElement emailTextbox;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement passwordconfirmTextBox;

	@FindBy(xpath="//input[@id=\"input-password\"]")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@value=\"0\"]")
	private WebElement noTickbox;
	
	@FindBy(xpath="//input[@name=\"agree\"]")
	private WebElement agreeTextbox;
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	private WebElement continueButton;
	
	//initialization
	public Register(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method fills all the credentials in the Register Page
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param telephonenumber
	 * @param pass
	 * @param confirmPassword
	 */
	public void sendNewUserInfo(String firstname, String lastname, String email, String telephonenumber,String pass,String confirmPassword)
	{
		firstnameTextbox.sendKeys(firstname);
		lastnameTextbox.sendKeys(lastname);
		emailTextbox.sendKeys(email);
		telephone.sendKeys(telephonenumber);
		passwordTextbox.sendKeys(pass);
		passwordconfirmTextBox.sendKeys(confirmPassword);
		
		
	}
	
	/**
	 * This method will click on no check box
	 */
	public void clickOnNoCheckbox()
	{
		noTickbox.click();
	}
	
	/**
	 * This method will select agree text box
	 */
	public void selectAgreeTextbox()
	{
		agreeTextbox.click();
	}
	
	/**
	 * This method will click on continue button
	 */
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
}
