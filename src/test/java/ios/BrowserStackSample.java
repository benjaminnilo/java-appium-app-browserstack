package ios;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BrowserStackSample {

	  public static String userName = "benjaminnilo1";
	  public static String accessKey = "hX8q6zUgT35SDZyeeqG2";

	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("os_version", "14");
	    caps.setCapability("device", "iPhone 12 Pro");
	    caps.setCapability("project", "My First Project");
	    caps.setCapability("build", "My First Build");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
	    caps.setCapability("app", "bs://9bb9356cba1a17597c96b2f6c0fd6324b1bdb87b");

	    IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
	    textButton.click();
	    IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
	    textInput.sendKeys("hello@browserstack.com\n");

	    Thread.sleep(5000);

	    IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

	    if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
	        assert(true);
	    else
	        assert(false);

	    // The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
	    driver.quit();
	  }

}
