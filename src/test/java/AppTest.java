import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

public class AppTest extends BaseTest{
	
	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver<?> driver=cap();
		
		driver.findElementByCssSelector("text(\"Views\")").click();
		
		
		
	}

	

}
