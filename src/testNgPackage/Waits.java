package testNgPackage;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Waits {
	private static WebDriver driver=null;
	
	WebElement element=null;
  @Test(enabled=false)
  public void f() {
	  element=driver.findElement(By.xpath("//a[text()='Login/Register']"));
	  //explicitWaitAndClick(element);
	 fluentWait();
	  element.click();
	  driver.findElement(By.name("checkUsername")).sendKeys("abc@abc.com");
  }
  @Test
  public void anotherExampleForWait() {
	  driver.findElement(By.xpath("(//a[contains(@href,'dth')])[1]")).click();
	  explicitWaitForVisibility();
	  element=driver.findElement(By.xpath("//p[text()='Just give us a few details']"));
	  System.out.print(element.getText().toString());
  }
  
  @BeforeMethod
  public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver", 
			  System.getProperty("user.dir")+File.separator+"chromedriver");
	 driver=new ChromeDriver(); 
	 driver.get("https://www.freecharge.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
  }
  
  public void fluentWait() {
	  
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(10, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//a[text()='Login/Register']"));
		    	 //return element;
		     }
		   });
  }
  public void explicitWaitAndClick(WebElement element) {
	  WebDriverWait wait=new WebDriverWait(driver,20);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.
//			  xpath("//a[text()='Login/Register']")));
	  wait.until(ExpectedConditions.elementToBeClickable(element)).click();
  }
  
  public void explicitWaitForVisibility() {
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.
			  visibilityOfElementLocated(By.xpath("//span[text()='Pay your dth bill']")));
  }
}
