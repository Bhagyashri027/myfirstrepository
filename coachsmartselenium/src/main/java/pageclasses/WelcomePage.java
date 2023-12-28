package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ReportUtils;

public class WelcomePage {
	//locators
	//methods using the locators
	WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		this.driver  = driver;
	}
 
	
	By Headingtitle = By.xpath(" //h1[text( )='Welcome to the-internet']");
	By Subheadingtitle = By.xpath("//h2[text( ) ='Available Examples']");
	By Footer = By.linkText("Elemental Selenium");
	
	public String getheadingtext() {
		WebElement heading = driver.findElement(Headingtitle);
		String headingtext = heading.getText();
		ReportUtils.log.info("Heading Tilte is" + headingtext);

		return headingtext;
	}
	
	public String getsubheadingtext() {
		WebElement subheading = driver.findElement(Subheadingtitle);
		String subheadingtext = subheading.getText();
		ReportUtils.log.info("Sub-Heading Tilte is" + subheadingtext);
		return subheadingtext;
	}
	
	public String getfooter() {
		WebElement footertextlink = driver.findElement(Footer);
		String footertext =footertextlink.getText();
		ReportUtils.log.info("Footer Text is" + footertext);
		return footertext;
	}

}
