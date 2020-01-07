package testCases;

import java.util.Set;

import org.testng.annotations.Test;

import pageObjects.AfterLoginPage;
import pageObjects.RoomiLogin;
import pageObjects.RoomiLogout;
import testCore.TestCore;

public class LoginWithFB extends TestCore {
	@Test
	public void main() throws Exception{
		RoomiLogin Login = new RoomiLogin(driver);
		AfterLoginPage Verify = new AfterLoginPage(driver);
		RoomiLogout Logout = new RoomiLogout(driver);
		
		log.debug("Clicking on Login button");
		Login.ClickOnLogin(driver);
		
		Login.SelectLoginMethod(driver, "Fb");
		
		String CurrentWindow = driver.getWindowHandle();
		Set<String> winHandles = driver.getWindowHandles();

		for (String wHandle : winHandles) {

			driver.switchTo().window(wHandle);

		}
	
		String username = Config.getProperty("FB_username");
		String password = Config.getProperty("FB_password");
		
		log.debug("Login with Email");
		Login.EnteringValuesForFB(driver, username, password);
		
		driver.switchTo().window(CurrentWindow);
		
		log.debug("Verifying whether Logged in to Roomi App");
		Verify.VerifyLoggedInRoomi(driver);
		
		Thread.sleep(2000);
		
		log.debug("Loging out from the App");
		Logout.ClickOnLogout(driver);
	}

}
