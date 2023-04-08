package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSearchPage
{
	//declaration
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement addToCartTab;
	
	@FindBy(xpath="//div[contains(text(),\" Success\")]/child::a[contains(text(),\"shopping cart\")]")
	private WebElement successCartTab;
	
	@FindBy(xpath="//div[contains(text(),\" Success\")]/child::a[contains(text(),\"wish list\")]")
	private WebElement successWishList;
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	private WebElement myAccountTab;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logoutTab;
	
	@FindBy(xpath = "//div[@class=\"product-thumb\"]/descendant::a[contains(text(),\"Mac\")]")
	private List<WebElement> searchLists;
	
	@FindBy(xpath="//button[@data-original-title=\"Add to Wish List\"]")
	private WebElement wishListTab;
	
	//initialization
		public AfterSearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//utilization
	
		/**
		 * This method clicks on the Add to cart button
		 */
	public void clickOnAddToCart()
	{
		addToCartTab.click();
	}
	
	/**
	 * This method clicks on my account tab
	 */
	public void clickOnMyAccountTab()
	{
		myAccountTab.click();
	}
	
	/**
	 * This method clicks on logout tab
	 */
	public void clickOnLogoutTab()
	{
		logoutTab.click();
	}
	
	/**
	 * This method validates whether the relevant products are displayed after searching a product
	 * @param searchData
	 * @return
	 */
	public boolean checkSearchList(String searchData)
	{
		int count=0;
		for(WebElement e: searchLists)
		{
			String element=e.getText();
			if(element.contains(searchData))
			{
				count++;
			}
		}
		if(count>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * This method return the text of the WebElement after successfully adding product to the cart 
	 * @return
	 */
	public String getSuccessCartText()
	{
		return successCartTab.getText();
	}
	
	/**
	 * This method return the text of the WebElement after successfully adding product to the wishlist 
	 * @return
	 */
	public String getWishListText()
	{
		return successWishList.getText();
	}
		
	/**
	 * This method clicks on wish list
	 */
	public void clickOnWishListTab()
	{
		wishListTab.click();
	}
}
