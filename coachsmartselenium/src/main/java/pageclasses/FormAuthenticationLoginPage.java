package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationLoginPage {
	
	WebDriver driver;
	
	public FormAuthenticationLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By Heading = By.xpath("//h2[text()='Login Page']");
	By UserName = By.id("username");
	By Password = By.id("password");
	By LoginButton = By.xpath("//button[@type='submit']");
	By SuccessMessage = By.xpath("//div[contains(@class, 'success')]");
	
	public String getheadingtext() {
		WebElement headingtext = driver.findElement(Heading);
		String headingtitle = headingtext.getText();
		return headingtitle;
		
	}
	public void enterusername(String username) {
		WebElement usernameElement = driver.findElement(UserName);
		usernameElement.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		WebElement passwordElement = driver.findElement(Password);
		passwordElement.sendKeys(password);
		
	}
	
	public void loginbuttonclick() {
		WebElement loginbuttonelement = driver.findElement(LoginButton);
		loginbuttonelement.click();
	}
	
	
	public String getsuccessmessage() {
		WebElement successmessagetext = driver.findElement(SuccessMessage);
		String successmessagetitle = successmessagetext.getText();
		return successmessagetitle;
	}
	

}
