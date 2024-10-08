package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	public OrganizationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	//locaters
	@FindBy(css="img[src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;
	
	@FindBy(className="dvHeaderText")
	private WebElement valorg;
	
	@FindBy(id="mouseArea_Industry")
	private WebElement ValInd;
	
	@FindBy(id="mouseArea_Type")
	private WebElement Valtype;



	public WebElement getPlusicon() {
		return plusicon;
	}
	
	
	
	public WebElement getValtype() {
		return Valtype;
	}



	public WebElement getValInd() {
		return ValInd;
	}



	public WebElement getValorg() {
		return valorg;
	}



	public void Clickplus()
	{
		plusicon.click();
	}
	public String Validateorg()
	{
		String vorg=valorg.getText();
		return vorg;
	}

	
	
	public String Validateind()
	{
		String Vind = ValInd.getText()	;
		return Vind;
		
	}
	
	public String Validatetype() {
	String Vtype = Valtype.getText();
		return Vtype;
	}

	}
