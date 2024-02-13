package testScripts;




import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import genericlibrary.BaseClass;

public class homePageTest extends BaseClass{
	@Test
	 public  void hometest_001() throws InterruptedException {
//		scrollWindowTo(driver, 0, 600);
//		Thread.sleep(2000);
//		
//		scrollWindowBy(driver, 0, -200);
//		Thread.sleep(2000);
		HomePage homePage=new HomePage(driver);
//		
//		scrollIntoView(driver, homePage.getLaptopimg14dot1(), true);
//		Thread.sleep(2000);
//		
//		scrollIntoView(driver, homePage.getLaptopimg14dot1(), false);
//		Thread.sleep(2000);
		
		handleDiasableorHiddenButton(homePage.getSearchbutton());
		Thread.sleep(3000);
		acceptAlert(driver);
		Thread.sleep(3000);
		 handleHiddenOrTextField(homePage.getSearchtextfield(),"books");
		 Thread.sleep(3000);
		 handleDiasableorHiddenButton(homePage.getSearchbutton());
		Thread.sleep(3000);
		 
		 
		

	}

}
