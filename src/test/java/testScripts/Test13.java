package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Test13 extends BaseClass
{
	@Test
	public void tc_ac_013()
	{
		SoftAssert soft=new SoftAssert();
		home.getMyAccountTab().click();
		home.getLoginTab().click();
		Map<String, String> map=excel.readData("Sheet1");
		login.setLoginInfo(map.get("Email"), map.get("Password"));
		login.clickOnForgotPasswordButton();;
		soft.assertTrue(user.getLogo().isDisplayed());
		soft.assertAll();
	}
}
