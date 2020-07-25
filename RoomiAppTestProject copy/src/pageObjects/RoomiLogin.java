package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomiLogin {

	public WebDriver driver;
	
	public RoomiLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Log In")
	private WebElement Login_Button;
	
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
	
	public void ClickOnLogin(WebDriver driver)
	{
		System.out.println("Clickin on Loggin button");
		Login_Button.click();
	}
	
	public void SelectLoginMethod(WebDriver driver, String method) {
		System.out.println("Selecting Login method as "+method);
		if (method=="Email") {
			Email_Login.click();
		}
		else {
			FB_Login.click();
		}
	}
	
	public void EnteringValuesForEmail(WebDriver driver, String user, String pass) {
		try{
			UserName.sendKeys(user);
		}
		catch (Throwable e) {
			System.out.println("Email not found: " + e.getMessage());
			
		}

		try {
			Password.sendKeys(pass);
		}
		catch (Throwable e) {
			System.out.println("Password not found: " + e.getMessage());
		}	
		try {
			Login_Submit.click();
		}
		catch(Throwable e) {
		    System.out.println("loginbutton not found: "+ e.getMessage());
		   }
	}
	
	public void EnteringValuesForFB(WebDriver driver, String user1, String pass1) {
		try{
			FB_User.sendKeys(user1);
		}
		catch (Throwable e) {
			System.out.println("Email for FB not found: " + e.getMessage());
			}

		try {
			FB_Password.sendKeys(pass1);
		}
		catch (Throwable e) {
			System.out.println("Password for FB not found: " + e.getMessage());
			}	
		try {
			FB_Login_Button.click();
		}
		catch(Throwable e) {
		    System.out.println("loginbutton not found: "+ e.getMessage());
		   }
	}
	
	

		}

