package testCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestCore {
	public WebDriver driver;
	public Properties Config = new Properties();
	public Logger log = Logger.getLogger("devpinoyLogger");
	
	@BeforeClass
	public void init() throws Exception{
		FileInputStream fis1 = new FileInputStream("/Users/nayanmahindra/Downloads/RoomiAppTestProject/src/properties/Config.properties");
		Config.load(fis1);
		
		System.out.println("Opening Url");
		if (Config.getProperty("browser")=="firefox") {
			log.debug("Opening Firefox Browser");
			driver = new FirefoxDriver();
		}
		else if(Config.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/nayanmahindra/Downloads/chromedriver");
		log.debug("Opening Chrome Browser");
		driver = new ChromeDriver();
	 	}
		else if(Config.getProperty("browser").equals("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		log.debug("Opening IE Browser");
		driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.debug("Opening "+Config.getProperty("url"));
		driver.get(Config.getProperty("url"));			
	}
	
	@AfterTest
	public void End() {
		log.debug("Closing Browser....");
		driver.quit();
	}
	
}
