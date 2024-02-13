package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	   @FindBy(id="Email")
	    private WebElement emailtextfield;
	    
	    @FindBy(name="Password")
	    private WebElement passwordtextfield;
	    @FindBy(id="RememberMe")
	    private WebElement remindmebutton;
	    @FindBy(xpath ="//input[@value='Log in']")
	    private WebElement loginbutton;
		public WebElement getEmailtextfield() {
			return emailtextfield;
		}
		public WebElement getPasswordtextfield() {
			return passwordtextfield;
		}
		public WebElement getRemindmebutton() {
			return remindmebutton;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
	    
	}


