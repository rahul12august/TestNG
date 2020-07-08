package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumTestNg {
	private static WebDriver driver=null;
  @Test
  public void actualTesting() {
	  driver.findElement(By.xpath("//a[text()='Login/Register']")).click();
	  driver.findElement(By.name("checkUsername")).sendKeys("abc@abc.com");
	  driver.findElement(By.xpath("(//button[text()='Proceed'])[1]")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Password'])[1]")).sendKeys("abc@abc.com");
	  driver.findElement(By.xpath("(//button[text()='Sign In'])[1]")).click();
	  driver.findElement(By.name("otp")).sendKeys("1111");
	  driver.findElement(By.xpath("//button[text()='Verify']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", 
			  System.getProperty("user.dir")+File.separator+"chromedriver");
	 driver=new ChromeDriver(); 
	 driver.get("https://www.freecharge.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
