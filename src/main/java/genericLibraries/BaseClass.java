package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomClasses.AfterSearchPage;
import pomClasses.HomePage;
import pomClasses.Login;
import pomClasses.Register;
import pomClasses.UserPage;

public class BaseClass 
{
	protected ExcelUtility excel;
	protected JavaUtility jUtil;
	protected PropertyFileUtility property;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected AfterSearchPage search;
	protected HomePage home;
	protected Login login;
	protected Register register;
	protected UserPage user;
	
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration()
	{
		excel=new ExcelUtility();
		jUtil=new JavaUtility();
		property=new PropertyFileUtility();
		web=new WebDriverUtility();
		
		property.propertyConfig(IConstantPath.PROPERTIES_PATH);
		String browser = property.fetchProperty("browser");
		String url = property.fetchProperty("url");
		Long time = Long.parseLong(property.fetchProperty("time"));
		driver = web.openApplication(browser, url, time);
	}
	
	@BeforeMethod
	public void methodConfiguration()
	{
		excel.excelInitialization(IConstantPath.EXCEL_PATH);
		
		search= new AfterSearchPage(driver);
		home = new HomePage(driver);
		login = new Login(driver);
		register = new Register(driver);
		user = new UserPage(driver);
		
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		excel.closeWorkbook();
	}
	
	@AfterClass
	public void classTearDown()
	{
		web.quitBrowser();
	}
	//@AfterTest
	//@AfterSuite

}
