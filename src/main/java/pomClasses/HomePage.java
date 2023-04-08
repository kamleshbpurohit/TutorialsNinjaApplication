package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective libraries of the homepage
 * @author Kamlesh B
 *
 */
public class HomePage 
{
	//DECLARATION
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	private WebElement myAccountTab;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	private WebElement registerTab;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement loginTab;
	
	
	//INITIALIZATION
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//UTILIZATION
	
	/**
	 * This method will get the my account WebElement
	 * @return
	 */
	public WebElement getMyAccountTab()
	{
		return myAccountTab;
	}
	
	/**
	 * This method will get the register WebElement
	 * @return
	 */
	public WebElement getRegisterTab()
	{
		return registerTab;
	}
	
	/**
	 * This method will get the login WebElement
	 * @return
	 */
	public WebElement getLoginTab()
	{
		return loginTab;
	}
	

	
	
	

	

}
