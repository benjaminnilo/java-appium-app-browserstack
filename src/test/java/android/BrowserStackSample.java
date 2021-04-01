package android;

import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserStackSample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "benjaminnilo1");
	      caps.setCapability("browserstack.key", "hX8q6zUgT35SDZyeeqG2");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://c55fb4ffb398a28a73e1d1c14220905a79629b91");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);

	      /* Write your Custom code here */
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
		
	}
}
