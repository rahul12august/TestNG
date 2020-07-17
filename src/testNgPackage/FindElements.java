package testNgPackage;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver=null;
	static final String USERNAME = "rahul12august";
	static String ACCESSKEY="961344e7-9376-4583-8808-04d2d5ad3610";
	public static final String URL = "https://" + USERNAME + ":" + ACCESSKEY + "@ondemand.saucelabs.com:443/wd/hub";
	WebElement element=null;
  @Test(enabled=false)
  public void f() {
	  List<WebElement> elements=driver.findElements(By.xpath("//input"));
	  System.out.print("Number of Web elements are : " +elements.size());
//	  for(int i=0;i<elements.size();i++) {
//		  
//	  }
	  int i=elements.size()-1;
	  elements.get(i).click();;
  }
  @Test(enabled=false)
  public void printNumberOfAnchorTag() {
	  List<WebElement> elements=driver.findElements(By.tagName("a"));
	  System.out.print("Number of Web elements are : " +elements.size());
  }
  
  @Test(enabled=true)
  public void clickOnAllLinks() throws InterruptedException {
	  List<WebElement> elements=driver.findElements(By.tagName("a"));
	  int k=elements.size();
	  for(int i=1;i<k;i++) {
		  if(driver.findElements(By.tagName("a")).get(i).isDisplayed()) {	
			  driver.findElements(By.tagName("a")).get(i).click();
			  Thread.sleep(3000);
			  System.out.println(driver.getTitle());
			  driver.navigate().back();
			  Thread.sleep(3000);
			 
		  }
		  
	  }
  }
  
  @BeforeMethod
  public void openBrowser() {
//	 System.setProperty("webdriver.chrome.driver", 
//			  System.getProperty("user.dir")+File.separator+"chromedriver");
	 driver=new ChromeDriver(); 
	 driver.get("https://test.techlift.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
}

/**
 * 9th July Thursday
Todays Agenda
1) Understand Verification and Assertion
		a) Java
		b) TestNG
2) Clicking on all links in a webPage logic 

A and B
Verify A is equal B > true | false
Verify A is not equal to B > true | false

Verification. : if condition is met , then it is good and it continues execution of next line of code.
If condition is not met, still it will execute next line of code.

Assertion: if condition is met , then it is good and it continues execution of next line of code.
If condition is not met, then it will throw exception and program execution will stop right there.



StaleElementReferenceException
*/
