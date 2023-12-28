package pagetest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.WelcomePage;
import utils.ReportUtils;

public class WelcomePageTest extends BaseTest {
	
	@Test
	public void verifyheadingtext()  {
	
	WelcomePage wp= new WelcomePage(driver);
	String h1 = wp.getheadingtext();
	Assert.assertEquals(h1, "Welcome to the-internet");
	ReportUtils.log.pass("Test Pass: Heading Title is correct");

	}
	
	@Test
	public void verifysubheadingtext() {
		WelcomePage wp= new WelcomePage(driver);
		String h2= wp.getsubheadingtext();
		Assert.assertEquals(h2, "Available Examples");
		ReportUtils.log.pass("Test Pass: SubHeading Title is correct");
		
	}
	
	@Test
	public void verifyfootertext() {
		WelcomePage wp= new WelcomePage(driver);
		String f1= wp.getfooter();
		Assert.assertEquals(f1, "Elemental Selenium");
		ReportUtils.log.pass("Test Pass: Footer Text is correct");
		
	}
	

}
