package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportExample {
	ExtentReports reports = new ExtentReports("./Reports/Reports.html");
	@Test
	
	public void test() {
		ExtentTest test=reports.startTest("LoginTestScript");
		
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Browser is launched");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO,"Maximized");
		
		driver.get("https://google.com");
		test.log(LogStatus.INFO,"Navigate toGoogle webpage");
		
		test.log(LogStatus.FAIL, "Test script pass");
		
		reports.endTest(test);
		reports.flush();
	}
	@Test
	public void test2() {
		ExtentTest test2=reports.startTest("LoginTestScript");
		
		WebDriver driver=new ChromeDriver();
		test2.log(LogStatus.INFO,"Browser is launched");
		
		driver.manage().window().maximize();
		test2.log(LogStatus.INFO,"Maximized");
		
		driver.get("https://youtube.com");
		test2.log(LogStatus.INFO,"Navigate toGoogle webpage");
		
		test2.log(LogStatus.FAIL, "Test script pass");
		
		reports.endTest(test2);
		reports.flush();
   
	}
}



