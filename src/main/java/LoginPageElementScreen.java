import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageElementScreen {
	
	public IOSDriver driver;
	
	public LoginPageElementScreen (IOSDriver driver){
	//PageFactory.initElements(driver, LoginPageElementScreen.class);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
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
	
	
	public LoginPageElementScreen  enter_credentails(String uid,String pass)
	{
	email.sendKeys(uid);
	password.sendKeys(pass);
	signInButton.click();
	// driver.switchTo().alert().accept();
	//backButton.click();
	return this;
	}

	
	
}
