

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AppiumTest {
 
 
 public static AppiumDriver<IOSElement> driver;

 public static void main(String[] args) throws MalformedURLException, InterruptedException  {
 DesiredCapabilities caps = new DesiredCapabilities();
 caps.setCapability("platformName", "iOS");
 caps.setCapability("platformVersion", "10.2"); 
 caps.setCapability("deviceName", "iPhone 6"); 
 caps.setCapability("bundleid", "com.example.apple-samplecode.UICatalog");
 caps.setCapability("app", "/Users/indianic/Library/Developer/Xcode/DerivedData/UICatalog-ggqvvxqydlozkdedvweajagquvqu/Build/Products/Debug-iphonesimulator/UICatalog.app"); 
 caps.setCapability("automationName", "XCUITest");
driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


//driver.findElement(By.name("Action Sheets")).click();
//driver.findElementByXPath("/AppiumAUT/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell").click();
//driver.findElementById("Okay / Cancel").click();

	//not working
//driver.findElement(MobileBy.IosUIAutomation("type(\"XCUIElementTypeCell\")")).click();
 

/*TouchAction ta=new TouchAction(driver);
 ta.tap(144, 156).perform();
 */
}}
