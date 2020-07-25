package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomiLogout {
	public WebDriver driver;

	public RoomiLogout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//*[@id=\"react-root\"]/div/div[1]/div[2]/div[3]/div[3]/img")
	@FindBy(xpath ="/html/body/div[1]/div/div[1]/div[2]/div[3]/div[3]/img")
	private WebElement ProfileImg_Button;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/li")
	private WebElement Logout_Button;

	public void ClickOnLogout(WebDriver driver) {
		System.out.println("Clickin on profile image");
		ProfileImg_Button.click();

		System.out.println("Clickin on Logout");
		Logout_Button.click();
	}

	public void verifyLoggedIn(WebDriver driver) {

		try {
			Thread.sleep(1000);
			System.out.println("Verifying inside Roomi or Not");
			ProfileImg_Button.click();
			System.out.println("Logged in to Roomi App");
		} catch (Exception e) {

			System.out.println("   Not logged in  Yet incorrect username or password    " + e.getMessage());
			driver.quit();
			System.out.println("Exiting as username or password is not correctly passed");
			System.exit(1);

		}

		System.out.println("Clickin on Logout");
		Logout_Button.click();
	}
}
