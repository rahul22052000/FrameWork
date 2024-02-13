package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistersPage {


		
	
	public RegistersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement firsttextfield;
	
	@FindBy(name="LastName")
	private WebElement lasttextfield;
	
	@FindBy(name="Email")
	private WebElement emailtextfield;
	
	@FindBy(name="Password")
	private WebElement passwordtextfield;
	
	@FindBy(name="ConfirmPassword")
	private WebElement confirmpasswordtextfield;
	
	@FindBy(id="register-button")
	private WebElement registerbutton;
	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}
	public WebElement getFirsttextfield() {
		return firsttextfield;
	}
	public WebElement getLasttextfield() {
		return lasttextfield;
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getConfirmpasswordtextfield() {
		return confirmpasswordtextfield;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}



}

	    
	


