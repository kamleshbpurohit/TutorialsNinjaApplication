package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Test2 extends BaseClass 
{
	@Test
	public void tc_it_003()
	{
		SoftAssert soft=new SoftAssert();
		home.getMyAccountTab().click();
		home.getLoginTab().click();
		Map<String, String> map=excel.readData("Sheet1");
		login.setLoginInfo(map.get("Email"),map.get("Password"));
		login.clickOnLoginButton();
		user.setSearchTextBox(map.get("Search"));
		user.clickOnSearchButton();
		
		soft.assertTrue(search.checkSearchList(map.get("Search")));
		soft.assertAll();
		
	}

}
