package testScripts;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository.RegistersPage;
import genericlibrary.BaseClass;
import genericlibrary.ExcelUtility;

public class RegisterTest extends BaseClass{
	@DataProvider(name="RegisterEmail")
	public String[][] data() throws EncryptedDocumentException,IOException{
	return ExcelUtility.getRowData("rahul");
}

  @Test(dataProvider = "RegisterEmail")
  
	
	public void Register_001(String FirstName,String LastName,String Email,String Password,String confirmpassword){
		
		HomePage homepage=new HomePage(driver);
		//RegistersPage register=new RegistersPage(driver);
		homepage.getRegisterlink().click();
		RegistersPage register=new RegistersPage(driver);
		register.getMaleradiobutton().click();
		register.getFirsttextfield().sendKeys(FirstName);
		register.getLasttextfield().sendKeys(LastName);
		register.getEmailtextfield().sendKeys(Email);
		register.getPasswordtextfield().sendKeys(Password);
		register.getConfirmpasswordtextfield().sendKeys(confirmpassword);
		register.getRegisterbutton().click();
		homepage.getLogoutlink().click();
	}

}
