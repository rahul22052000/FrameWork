package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
       public ComputerPage (WebDriver driver) {
    	   
    	 PageFactory.initElements(driver, this);
       }
       @FindBy(linkText = "Desktops")
       private WebElement desktoptitle;
       
       @FindBy(linkText = "Created on")
       private WebElement createdropdown;
       
       @FindBy(linkText = "12")
       private WebElement displaydropdown;
       
       @FindBy(linkText = "Grid")
       private WebElement viewasdropdown;
       
       @FindBy(linkText = "Simple Computer")
       private WebElement simplecomputerlink;
       
       @FindBy(id = "add-to-cart-button-75")
       private WebElement addtocartbutton;

	public WebElement getDesktoptitle() {
		return desktoptitle;
	}

	public WebElement getCreatedropdown() {
		return createdropdown;
	}

	public WebElement getDisplaydropdown() {
		return displaydropdown;
	}

	public WebElement getViewasdropdown() {
		return viewasdropdown;
	}

	public WebElement getSimplecomputerlink() {
		return simplecomputerlink;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
       
       
}
