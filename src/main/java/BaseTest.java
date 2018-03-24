import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BaseTest {

	
	public static AppiumDriver<IOSElement> cap() throws MalformedURLException {
		AppiumDriver<IOSElement> driver;
	 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "iOS");
		 caps.setCapability("platformVersion", "10.2"); 
		 caps.setCapability("deviceName", "iPhone 6"); 
		 caps.setCapability("bundleid", "com.indianic.quickee");
		 caps.setCapability("app", "/Users/indianic/Downloads/Quickee.app"); 
		 caps.setCapability("automationName", "XCUITest");
		 caps.setCapability("autoAcceptAlerts","true");
		driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Waiting for Dialogs");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	        System.out.println("Tap on ALLOW");
	    } catch (Exception e) {
	        System.err.println("no alert visible after 10 sec.");
	    }
		return driver;
}}
