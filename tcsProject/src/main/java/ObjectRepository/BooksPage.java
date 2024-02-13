package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	 public BooksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath ="//h1[.='Books']")
    private WebElement pageTitle;
    
    @FindBy(partialLinkText ="Computing and Internet")
    private WebElement ComputingandInternetLink;
    
    @FindBy(id="products-orderby")
    private WebElement SortByDropDown;
    
    @FindBy(id="products-pagesize")
    private WebElement DisplayDropdown;
    
    @FindBy(id="products-viewmode")
    private WebElement ViewasDropDown;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public WebElement getComputingandInternetLink() {
		return ComputingandInternetLink;
	}

	public WebElement getSortByDropDown() {
		return SortByDropDown;
	}

	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}

	public WebElement getViewasDropDown() {
		return ViewasDropDown;
	}
}
