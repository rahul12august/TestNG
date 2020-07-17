package testNgPackage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExecutionOnSauceLabs {
	static final String USERNAME = "rahul12august";
	static String ACCESSKEY = "961344e7-9376-4583-8808-04d2d5ad3610";
	public static final String URL = "https://" + USERNAME + ":" + ACCESSKEY + "@ondemand.saucelabs.com:443/wd/hub";
	WebElement element = null;

	@Test
	public void f() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		//DesiredCapabilities caps = DesiredCapabilities.safari();
		//caps.setCapability("platform", "MacOS 10.14");
		caps.setCapability("version", "latest");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://test.techlift.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("title of page is: " + driver.getTitle());
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println("Number of Web elements are : " +elements.size());
		driver.quit();
	}
}
