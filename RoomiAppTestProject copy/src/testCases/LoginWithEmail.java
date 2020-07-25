package testCases; 

import org.testng.annotations.Test;

import pageObjects.AfterLoginPage;
import pageObjects.RoomiLogin;
import pageObjects.RoomiLogout;
import testCore.TestCore;

public class LoginWithEmail extends TestCore {
	
	@Test
	public void main() throws Exception{
		RoomiLogin Login = new RoomiLogin(driver);
		AfterLoginPage Verify = new AfterLoginPage(driver);
		RoomiLogout Logout = new RoomiLogout(driver);
		
		log.debug("Clicking on Login button");
		Login.ClickOnLogin(driver);
		
		Login.SelectLoginMethod(driver, "Email");
	
		String username = Config.getProperty("username");
		String password = Config.getProperty("password");
		
		log.debug("Logging with Email");
		Login.EnteringValuesForEmail(driver, username, password);
		
		log.debug("Verifying whether Logged in to Roomi App");
		//Verify.VerifyLoggedInRoomi(driver);
		Logout.verifyLoggedIn(driver);
		Thread.sleep(2000);
		
		log.debug("Loging out from the App");
		Logout.ClickOnLogout(driver);
	}
}
