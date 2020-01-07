package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLoginPage {

public WebDriver driver;
	
	public AfterLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[2]/a[1]/span")
	private WebElement MyListing;
	
	public void VerifyLoggedInRoomi(WebDriver driver) {
		try {
			Thread.sleep(1000);
			System.out.println("Verifying Inside Roomi or not");
			MyListing.isDisplayed();
			System.out.println("Logged in to Roomi App");
		}
		catch(Exception e){
			System.out.println("Not Logged in Yet " + e.getMessage());
		}
	}
	
	
}
