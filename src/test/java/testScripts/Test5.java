package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Test5 extends BaseClass
{
	@Test
	public void tc_ac_005()
	{
		SoftAssert soft= new SoftAssert();
		home.getMyAccountTab().click();
		home.getRegisterTab().click();
		Map<String, String> map=excel.readData("Sheet1");
		register.sendNewUserInfo(map.get("First Name"), map.get("Last Name"), map.get("Email"),map.get("Telephone") , map.get("Password"), map.get("Password confirm"));
		register.clickOnNoCheckbox();
		
	
		register.clickOnContinueButton();
		soft.assertTrue(user.getLogo().isDisplayed());
		soft.assertAll();
	}

}
