package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
public WebDriver driver;
	
	public Settings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

			
			@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[2]/div[3]/div[3]/img")
			private WebElement Displaypicture;
		
			@FindBy(linkText="Settings")
				private WebElement Settings;
			
			@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/form/div/div[1]/div/div/div/iframe")
			private WebElement card_num;
			
			@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/form/div/div[1]/div/div/div/iframe")
			private WebElement expiry;
			
			@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/form/div/div[1]/div/div/div/iframe")
			private WebElement cvc;
			
			@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/form/div/div[1]/div/div/div/iframe")
			private WebElement zip;
            
			@FindBy(xpath="//div[contains(text(),'Submit')]")
			private WebElement submit;
			
			@FindBy(xpath="//div[contains(text(),'Cancel')]")
			private WebElement cancel;
			
			public void EnteringValuesForCard(WebDriver driver, String card) {
				try{
					card_num.sendKeys(card);
				}
				catch (Throwable e) {
					System.out.println("Invalid card number: " + e.getMessage());
				}

				
		

				
			}

}
			
