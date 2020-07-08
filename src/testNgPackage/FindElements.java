package testNgPackage;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver=null;
	
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
  public void clickOnAllLinks() {
	  List<WebElement> elements=driver.findElements(By.tagName("a"));
	  for(int i=5;i<elements.size();i++) {
		  if(elements.get(i).isDisplayed()) {
			  elements.get(i).click();
			  
			  System.out.println(driver.getTitle());
			  driver.navigate().back();
			 
		  }
		  
	  }
  }
  
  @BeforeMethod
  public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver", 
			  System.getProperty("user.dir")+File.separator+"chromedriver");
	 driver=new ChromeDriver(); 
	 driver.get("https://test.techlift.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
