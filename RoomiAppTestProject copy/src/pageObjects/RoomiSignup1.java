package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomiSignup1 {
public WebDriver driver;
	
	public RoomiSignup1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sign Up")
	private WebElement SignUp_Button;
	
	@FindBy(className="aut-button-email")
	private WebElement Email_Login;
	
	@FindBy(className="aut-button-facebook")
	private WebElement FB_Login;
	
	@FindBy(name="username")
	private WebElement UserName;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(id="email")
	private WebElement FB_User;
	
	@FindBy(id="pass")
	private WebElement FB_Password;
	
	@FindBy(className="aut-button-submit")
	private WebElement Login_Submit;
	
	@FindBy(name="login")
	private WebElement FB_Login_Button;
	
	
}
