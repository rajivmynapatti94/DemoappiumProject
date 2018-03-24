import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;

public class QuickeeAppTest extends BaseTest {
	
	 //public static AppiumDriver<IOSElement> driver;

	 public static void main(String[] args) throws MalformedURLException, InterruptedException  {

//Call the BaseTest class here
		 AppiumDriver<IOSElement> driver= cap();

//Tap on Login button
		 driver.findElementByName("Login").click();
		 Thread.sleep(3000);

//Get the PageFactory Element
	LoginPageElementTest LoginScreen= PageFactory.initElements(driver, LoginPageElementTest.class);

//Get the Enter_credentails method
	LoginScreen.enter_credentails("Test@grr.la", "123456");
		
		
		
}}
