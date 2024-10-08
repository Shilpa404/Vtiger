package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountandAction {
	public AccountandAction(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement enterorg;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement search;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement selectorg;
	

	public WebElement getEnterorg() {
		return enterorg;
	}
	
	public WebElement getSearch() {
		return search;
	}

public WebElement getSelect() {
		return selectorg;
	}

	public void searchorg(String org)
	{
		enterorg.sendKeys(org);
		search.click();
	   
	}
	  public void clickSelect()
	  {
		  selectorg.click();
			
			
	  }
	

}
