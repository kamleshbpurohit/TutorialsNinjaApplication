package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the elements and respective business libraries of user page after logging in
 * @author Kamlesh B
 *
 */
public class UserPage
{
	//declaration
	@FindBy(xpath="//input[@name=\"search\"]")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//span/button[@type=\"button\"]")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[text()=\"Password\"]")
	private WebElement passwordTab;
	
	@FindBy(xpath="//a[text()=\"Newsletter\"]/following-sibling::a[text()=\"Logout\"]")
	private WebElement logoutTab;
	
	@FindBy(xpath="//div[@id=\"logo\"]")
	private WebElement yourStoreLogo;
	
	//initialization
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	/**
	 * This method will write the data into the search textbox
	 * @param data
	 */
	public void setSearchTextBox(String data)
	{
		searchTextBox.sendKeys(data);
	}
	
	/**
	 * This method will click on search button
	 */
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	/**
	 * This method will click on password tab
	 */
	public void clickOnPasswordTab()
	{
		passwordTab.click();
	}
	
	/**
	 * This method will click on logout tab
	 */
	public void clickOnlogoutTab()
	{
		logoutTab.click();
	}
	
	/**
	 * This method is used to get the logo of the userPage after logging in
	 * @return
	 */
	public WebElement getLogo()
	{
		return yourStoreLogo;
	}
}
