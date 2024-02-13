package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.BaseClass;


public class HomePage extends BaseClass{
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
   @FindBy(partialLinkText="Log in")
   private WebElement loginlink;
   
   @FindBy(partialLinkText ="Books")
   private WebElement booksLink;
   
   @FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
   private WebElement checkmailID;
   
 @FindBy(partialLinkText = "Regist")
  private WebElement registerlink;
 
 @FindBy(xpath = "//input[@class='button-1 search-box-button']")
 private WebElement Searchbutton;
 
 @FindBy(id="small-searchterms")
 private WebElement searchtextfield;


public WebElement getSearchbutton() {
	return Searchbutton;
}

public WebElement getSearchtextfield() {
	return searchtextfield;
}

public WebElement getCheckmailID() {
	return checkmailID;
}


@FindBy(className="ico-logout") 
   private WebElement logoutlink;
@FindBy(linkText = "Shopping cart")
   private WebElement shoppinglink;

@FindBy(linkText = "Computers")
   private WebElement computerslink;
@FindBy(xpath ="//img[@alt='Picture of 14.1-inch Laptop']")
   private WebElement Laptopimg14dot1;

  





public WebElement getLaptopimg14dot1() {
	return Laptopimg14dot1;
}

public WebElement getShoppinglink() {
	return shoppinglink;
}

public WebElement getRegisterlink() {
	return registerlink;
}


public WebElement getLoginlink() {
	return loginlink;
}

public WebElement getComputerslink() {
	return computerslink;
}

public WebElement getBooksLink() {
	return booksLink;
}
public WebElement getLogoutlink() {
	return logoutlink;
}


}



