package testScripts;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.testng.AssertJUnit;









import ObjectRepository.BooksPage;
import ObjectRepository.HomePage;
import genericlibrary.BaseClass;


public class BookTests extends BaseClass{
	@Test
	public void books_001() {
		
		
		HomePage homePage =new HomePage(driver);
		homePage.getBooksLink().click();
	    
		
		BooksPage bookspage=new BooksPage(driver);
		
		AssertJUnit.assertEquals(bookspage.getPageTitle().getText(),"Books","Books page is not displayed");
		
		bookspage.getDisplayDropdown().click();
		selectByIndex(bookspage.getSortByDropDown(),2);
		
		
		selectByVisibleText(bookspage.getDisplayDropdown(), "12");
		bookspage.getViewasDropDown().click();
		
		selectByVisibleText(bookspage.getViewasDropDown(),"Grid");
		
		
       
		
		
	}

	
   @Test
   public void books_002() throws IOException {
	   HomePage homePage=new HomePage(driver);
	   BooksPage booksPage=new BooksPage(driver);
	   
	   
	   getWebTakeScreenshot(driver);
	   getwebelementTakeScreenshot(homePage.getCheckmailID());
	   homePage.getBooksLink().click();
	   getwebelementTakeScreenshot(booksPage.getPageTitle());
	   
	   getwebelementTakeScreenshot(booksPage.getSortByDropDown());
	   
	   switchToWindowByTitle(driver, "Sign up");
	   
   }
   @Test
   public void book_003() throws IOException {
	   HomePage homePage=new HomePage(driver);
	   
	   getWebTakeScreenshot(driver);
	   test.log(LogStatus.INFO,test.addScreenCapture(getWebTakeScreenshot(driver)));
	   test.log(LogStatus.INFO,test.addScreenCapture(getwebelementTakeScreenshot(homePage.getBooksLink())));
   }
}
