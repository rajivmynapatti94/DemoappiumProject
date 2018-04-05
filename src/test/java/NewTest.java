import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NewTest {
	
	public IOSDriver driver;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Back Icon\"]")
public	WebElement backButton;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField")
	public	WebElement email;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public	WebElement password;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Eye Icon\"]")
	public WebElement viewPassword;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Forgot your password?\"]")
	public	WebElement forgotPassword;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Sign In\"]")
	public	WebElement signInButton;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Facebook\"]")
	public	WebElement fbLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Phone Number\"]")
	public	WebElement phoneNumberLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Welcome Back!\"]")
	public	WebElement WelcomeText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"or Sign In with\"]")
	public	WebElement OtherText;
	
	
	
	@BeforeTest
	public void testing() throws MalformedURLException{
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "iOS");
		 caps.setCapability("platformVersion", "10.2"); 
		 caps.setCapability("deviceName", "iPhone 6"); 
		 caps.setCapability("bundleid", "com.indianic.quickee");
		 caps.setCapability("app", "/Users/indianic/Downloads/Quickee.app"); 
		 caps.setCapability("automationName", "XCUITest");
		 caps.setCapability("autoAcceptAlerts","true");
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
		@Test
		public void App() throws InterruptedException{
	//Calling all the page factory element here
			PageFactory.initElements(new AppiumFieldDecorator(driver,20,TimeUnit.SECONDS), this);
			
//Waiting for the dialog
			System.out.println("Waiting for Dialogs");
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    try {
		        wait.until(ExpectedConditions.alertIsPresent());
		        driver.switchTo().alert().accept();
		        System.out.println("Tap on ALLOW");
		    } catch (Exception e) {
		        System.err.println("no alert visible after 10 sec.");
		    }
		 
		   //Tap on Login link
		    	//driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\")").click();
		    driver.findElementByName("Login").click();
		    			Thread.sleep(3000);
		    	
		    //Sends keys on email text field
		    			email.sendKeys("test@grr.la");
		    	
		    //Sends keys on password text field
		    	password.sendKeys("123456");
		    	
		   //click or Tap on View password icon
		    	viewPassword.click();
		    			Thread.sleep(2000);
		    			
		   //Click or Tap on Sign In button
		    	signInButton.click();
		    	
		   //Accept the Dialog for User does not Exit
		    			Thread.sleep(2000);
		    	driver.switchTo().alert().accept();
		    	System.out.println("Accepted the alert");
		    	
		    	
		    
			
		}
		
		
		//		@AfterTest
				public void teardown(){

	//End of Testing
			driver.quit();
		
	}

}
