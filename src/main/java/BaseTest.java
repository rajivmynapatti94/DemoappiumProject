import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BaseTest {
public static IOSDriver driver;
	
	public static IOSDriver cap() throws MalformedURLException {
		
	 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "iOS");
		 caps.setCapability("platformVersion", "10.2"); 
		 caps.setCapability("deviceName", "iPhone 6"); 
		 caps.setCapability("bundleid", "com.indianic.quickee");
		 caps.setCapability("app", "/Users/indianic/Downloads/Quickee.app"); 
		 caps.setCapability("automationName", "XCUITest");
		 caps.setCapability("autoAcceptAlerts","true");
		driver = new IOSDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
}
	public void MethodSwipeUp(int durations) throws InterruptedException{
		
		Dimension	size = driver.manage().window().getSize();
			int height=size.getHeight();
			int width=size.getWidth();
			 int startx= width/2;
			int starty=(int)(height * 0.60);
			
			int endy=(int)(height *0.30);
			
			driver.swipe(startx, starty, startx, endy, durations);
			System.out.println("I have swiped ");
			Thread.sleep(2000);
			
			driver.swipe(startx, starty, startx, endy, durations);
			System.out.println("i have swipped too");
			}
}