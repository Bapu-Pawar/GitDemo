package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;

public class OverviewPage {
	WebDriver driver;
	
	@FindBy(id = "finish")
	WebElement finishButton;
	
	public OverviewPage() {
		driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickFinish() {
		finishButton.click();
	}

}
