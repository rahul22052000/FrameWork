package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {
	public DesktopPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

	