import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class QuickeeAppTest extends BaseTest {
	//public IOSDriver driver;
	 //public static AppiumDriver<IOSElement> driver;
	@Test
	 public void openapp() throws MalformedURLException, InterruptedException{

//Call the BaseTest class here
	IOSDriver driver= cap();

	
		 System.out.println("Waiting for Dialogs");
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    try {
		        wait.until(ExpectedConditions.alertIsPresent());
		        driver.switchTo().alert().accept();
		        System.out.println("Tap on ALLOW");
		    } catch (Exception e) {
		        System.err.println("no alert visible after 10 sec.");
		    }

		
		    
//Tap on Login button
		    driver.findElementById("Login").click();
		
//Get the PageFactory Element
			LoginPageElementScreen LoginScreen= new LoginPageElementScreen(driver);
			
//Get the Enter_credentails method
			LoginScreen.enter_credentails("shivani.gor@indianic.com", "test123");
	
			Thread.sleep(10000L);
	
//Calling SwipeUp method from baseTest
			MethodSwipeUp(5000);
	
	
	
	}
}
