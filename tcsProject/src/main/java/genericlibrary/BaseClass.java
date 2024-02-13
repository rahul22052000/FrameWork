package genericlibrary;


import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass  extends UtilityMethods{
    public  WebDriver driver;
    public ExtentReports reports;
    public ExtentTest test;
     @BeforeSuite
 	public void  beforeSuite(){
    	 reports=new ExtentReports("./Reports./"+getSystemDataandTime()+".html");
 		System.out.println("Before suite");
 	}
     @AfterSuite
     public void afterSuite() {
    	 reports.flush();
     	System.out.println("After suite");
     }
     @BeforeTest
     public void beforetest() {
     	System.out.println("Before Test");
     }
     @AfterTest
     public void afterTest() {
     	System.out.println("After Test");
     }
     @BeforeClass
     public void beforeclass() throws IOException  {
    	 
    	 String browser=FileUtility.getProperty("browser");
    	 String url=FileUtility.getProperty("url");
    	 
    	 if(browser.equalsIgnoreCase("chrome")) {
    		 driver=new ChromeDriver();
    	 }
    	 else if(browser.equalsIgnoreCase("firefox")) {
    		 driver=new FirefoxDriver();
    	 }
    	 else if(browser.equalsIgnoreCase("edge")) {
    		 driver=new EdgeDriver();
    	 }
    	 else{
    		 driver=new ChromeDriver();
    	 }
    	 driver.manage().window().maximize();
    	 initObjects(driver);
    	 driver.get(url);
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 System.out.println("Before Class");
     }
     @AfterClass
     public void afterclass() {
    	 driver.quit();
    	 System.out.println("After Class");
     }
     @BeforeMethod
     public void beforeMethod(Method method)   {
    	  test=reports.startTest(method.getName());
    	     HomePage homepage=new HomePage(driver);
//    	     LoginPage loginpage=new LoginPage(driver);
//    	     //click on login link
//    	     homepage.getLoginlink().click();
//    	     
//    	     //enter email address
//    	     loginpage.getEmailtextfield().sendKeys("rahulraviraj979@gmail.com");
//    	     
//    	     //enter password address
//    	     loginpage.getPasswordtextfield().sendKeys("password");
//            
//    	     //click on login button
//    	     loginpage.getLoginbutton().click();
     }
    	 
     @AfterMethod
     public void AfterMethod() {
    	 //click on logout link
    	 HomePage homePage=new HomePage(driver);
    	// homePage.getLogoutlink().click();
    	 reports.endTest(test);
    	 System.out.println("logout done in after method");
     }

    	 
     }



