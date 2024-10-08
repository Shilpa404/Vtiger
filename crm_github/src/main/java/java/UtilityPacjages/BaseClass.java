package UtilityPacjages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Repository.ExtraPage;
import Repository.LoginPage;

public class BaseClass {
	
	PropertyUtility putil=new PropertyUtility();
public 	WebDriver driver;

//public 	static WebDriver sdriver=null;
	@BeforeSuite
	public void ConfigBS()
	{
		System.out.println("DB connection");
	}
	@AfterSuite
	public void ConfigAS()
	{
		System.out.println("DB connection close");
	}
	@BeforeTest
	public void ConfigBT()
	{
		System.out.println("pre condition");
	}
	@AfterTest
	public void ConfigAT()
	{
		System.out.println("post condition");
	}
	@Parameters("BROWSER")
	@BeforeClass
	public void ConfigBC(String browser) throws Throwable
	{
		String BROWSER=browser;
		//String BROWSER = putil.systemLogin("Browser");
		String URL = putil.systemLogin("Url");
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		WebDriverUtility.maximizeWindow(driver);
		//Implicit wait
		WebDriverUtility.implicitWait(driver);
		driver.get(URL);
		
		
	}
	@AfterClass 
	public void ConfigAC()
	{
	driver.quit();	
	}
	@BeforeMethod
	public void ConfigBM() throws Throwable
	{
	String USERNAME = putil.systemLogin("Username");
		String PASSWORD = putil.systemLogin("Password");

		LoginPage LP=new LoginPage(driver);
		  LP.Loginusenamepasswordloginbtn(USERNAME,PASSWORD);
	}
	@AfterMethod
	public void ConfigAM()
	{
		ExtraPage EP=new ExtraPage(driver);
		EP.clickLogout();
		driver.close();
	}
	
	
}
