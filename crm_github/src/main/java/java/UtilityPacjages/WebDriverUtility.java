package UtilityPacjages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class WebDriverUtility {
	

	public static void maximizeWindow(WebDriver driver)
	{
	driver.manage().window().maximize();
	}
	
	
	public static void implicitWait(WebDriver driver)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	
	public void switchWindow(WebDriver driver, String Tittle)
	{
		Set<String> Windows1 = driver.getWindowHandles();
		 Iterator<String> it1 = Windows1.iterator();
		 while(it1.hasNext())
			{
			String ite1 = it1.next();	
			driver.switchTo().window(ite1);
			String CurrentWindow1 = driver.getTitle();
			if(CurrentWindow1.contains(Tittle))
			{
				break;
			}
			}
		 }
	
	public void alertAccept(WebDriver driver)
	{
		
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss(WebDriver driver)
	{
		
		driver.switchTo().alert().dismiss();
	}
	
	public void selectMetho(WebElement ele, int i)
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
	
	public void selectMethod(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public void selectMethod(String value, WebElement ele)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	
	public void actionsMoveToElement(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
		
	
	

}
