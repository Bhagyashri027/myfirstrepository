package pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.FormAuthenticationLoginPage;

public class FormAuthenticationLoginTest extends BaseTest{
	
	@Test
	public void verifyheadingtext() {
		FormAuthenticationLoginPage LP = new FormAuthenticationLoginPage(driver);
		String h1 = LP.getheadingtext();
		Assert.assertEquals(h1, "Login Page");
	};
	
	@Test
	public void verifyusername() {
		FormAuthenticationLoginPage LP = new FormAuthenticationLoginPage(driver);
		LP.enterusername("tomsmith");	
		
	}
	
	@Test
	public void verifypassword() {
		FormAuthenticationLoginPage LP = new FormAuthenticationLoginPage(driver);
		LP.enterpassword("SuperSecretPassword!");	
	}
	
	@Test
	public void verifyloginbutton() {
		FormAuthenticationLoginPage LP = new FormAuthenticationLoginPage(driver);
		LP.loginbuttonclick();
	}
	
	@Test
	public void verifysuccessmessage() {
		FormAuthenticationLoginPage LP = new FormAuthenticationLoginPage(driver);
		String successmessage = LP.getsuccessmessage();
		Assert.assertEquals(successmessage.contains(" You logged into a secure area! "), true);
		
	}

}
