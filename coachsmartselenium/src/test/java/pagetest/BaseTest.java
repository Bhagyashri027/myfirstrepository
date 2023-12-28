package pagetest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utils.BaseUtil;
import utils.ReportUtils;

public class BaseTest {
	WebDriver driver;
	
	@BeforeSuite
	protected void initialise() {
		ReportUtils.initReport();
	}
	
	@BeforeMethod
	public void init(Method method) throws IOException {
		
		//String browser = "Chrome";
		
		ReportUtils.creatTest(method.getName());
		String browser = BaseUtil.getConfigValue("browser");
		
		switch (browser.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				ReportUtils.log.info("Chrome Browser Launched");
				break;
			case "firefox":
				driver = new FirefoxDriver();
				ReportUtils.log.info("Firefox Browser Launched");
				break;
			case "edge":
				driver = new EdgeDriver();
				ReportUtils.log.info("Edge Browser Launched");
				break;
			default:
				ReportUtils.log.info("No Browser Launched");
				throw new NullPointerException();
		}
					
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(BaseUtil.getConfigValue("implicitwait"))));
		//driver.get(BaseUtil.getConfigValue("url"));
		String url = BaseUtil.getConfigValue("url");
		driver.get(url);
		ReportUtils.log.info("URL Launched " + url);
	}
	

	@AfterMethod
	public void endmethod() {
		driver.quit();
		ReportUtils.log.info("Browser Closed");
	}
	
	@AfterSuite
	public void teardown() {
		ReportUtils.generatereport();
	}

}
