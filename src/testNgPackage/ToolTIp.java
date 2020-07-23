package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTIp {
  @Test(enabled=true)
  public void toolTipExample() { 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.findElement(By.name("q")).sendKeys("a");
	  WebElement element=driver.findElement(By.xpath("(//div[@role='button'])[2]"));
	  Actions action=new Actions(driver);
	  action.moveToElement(element).perform();
	  if(driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).isDisplayed()) {
		  System.out.println("Search by voice is displayed");
	  }else {
		  System.out.println("Search by voice is not displayed");
	  }
	  //driver.quit();
	  
  }
  
 
  
  
  
  
  
  
  
  
  @Test(enabled=false)
  public void dragAndDropExample() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://gojs.net/latest/samples/htmldragdrop.html");
	  //driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.switchTo().frame("iframeResult");
	  WebElement source = driver.findElement(By.xpath("//div[contains(text(),'Tea')]"));
	  WebElement target = driver.findElement(By.xpath("//canvas"));
	  Actions action=new Actions(driver);
	  Action dragAndDrop = action.clickAndHold(source)
			  .moveToElement(target)
			  .release(target)
			  .build();
	  dragAndDrop.perform();	  
	  //driver.quit();
  }
}
