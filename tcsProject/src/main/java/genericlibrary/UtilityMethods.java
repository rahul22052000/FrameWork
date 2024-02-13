package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	Select selectOption;
	static JavascriptExecutor jse;
	public void selectByIndex(WebElement dropdown,int index) {
		selectOption=new Select(dropdown);
		selectOption.selectByIndex(index);
	}
    public void selectByValue(WebElement dropdown,String value) {
    	selectOption=new Select(dropdown);
    	selectOption.selectByValue(value);
    }
 public void selectByVisibleText(WebElement dropdown,String text) {
	   selectOption=new Select(dropdown);
	   selectOption.selectByVisibleText(text);
 } 
 
 
   public String getWebTakeScreenshot(WebDriver driver)  {
	   String imgpath="./Screenshots/"+getSystemDataandTime()+".png";
	 TakesScreenshot ts=(TakesScreenshot)driver;

	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 
	 File perm=new File(imgpath);
	 
	 try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return "."+imgpath;
   }
	 
	 public String getwebelementTakeScreenshot(WebElement element) throws IOException {
		 String imgpath="./Screenshots/"+getSystemDataandTime()+".png";
		 File temp=element.getScreenshotAs(OutputType.FILE);
		 
		 File perm=new File(imgpath);
		 FileHandler.copy(temp, perm);
		 
		 return "."+imgpath;
	 }
	 
	 
	  public String getSystemDataandTime() {
		 return LocalDateTime.now().toString().replace(":","_").replace("-", "_");
	  }
		 
	 
    public static void switchToWindowByTitle(WebDriver driver, String title) {
    	Set<String> allWindows=driver.getWindowHandles();
    	
    	for (String window:allWindows) {
    		driver.switchTo().window(window);
    		
    		if (driver.getTitle().contains(title)) {
    	}
      }
    }
    public static void switchToWindowByURL(WebDriver driver,String url) {
    	Set<String> allWindows=driver.getWindowHandles();
    	for(String window:allWindows) {
    		driver.switchTo().window(window);
    		if(driver.getTitle().contains(url)) {
    			break;
    		}
    	}
    	
    	
    }
    
    public static void initObjects(WebDriver driver) {
    jse = (JavascriptExecutor) driver;
    }
    public static void scrollWindowBy(WebDriver driver,int x,int y) {
    	
		
		jse.executeScript("window.scrollBy("+x+","+y+")");
    
    }
    
    public static void scrollWindowTo(WebDriver driver,int x,int y) {
    	jse.executeScript("window.scrollTo("+x+","+y+")");
    }
    public static void scrollIntoView(WebDriver driver, WebElement element, boolean elementPosition) {
    	jse.executeScript("arguments[0].scrollIntoVeiw("+elementPosition+")", element);
    }
    
    public static void handleDiasableorHiddenButton(WebElement element) {
    	jse.executeScript("arguments[0].click()",element);
    
    }
    public static void  handleHiddenOrTextField(WebElement element,String value) {
    	jse.executeScript("arguments[0].value='"+value+"'",element);
    }
    
    public static void acceptAlert(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
 }



 
 