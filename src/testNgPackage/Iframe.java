package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
  @Test
  public void iFrameWebElement() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///Users/rahultiwari/Downloads/IframeTest.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("reg"); //switch by id
	  WebElement element=driver.findElement(By.id("reg")); 
	  driver.switchTo().frame(element); //switch by webelement
	  //driver.switchTo().frame(1); //switch by index
	  driver.findElement(By.id("email")).sendKeys("abc@abc.com");
	  driver.switchTo().defaultContent();
	  //driver.quit();
	  
	  //Below lines are for iframe inside another iframe
	  driver.switchTo().frame("javatpoint");
	  driver.switchTo().frame("reg");
	  driver.findElement(By.id("email")).sendKeys("abc@abc.com");
	  driver.switchTo().frame("javatpoint");
	  driver.switchTo().defaultContent();
  }
}
