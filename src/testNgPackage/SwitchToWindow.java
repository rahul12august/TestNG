package testNgPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToWindow {
  @Test
  public void switchToWindowExample() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://test.techlift.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String handle=driver.getWindowHandle(); //returns a String
	  String title=driver.getTitle(); //Got the page title
	  System.out.println("Title of the page is : "+title);
	  System.out.println("Current window handle is : "+handle);
	  driver.findElement(By.xpath("//a[contains(text(),'Powered by ERPNext')]")).click();
	  Set<String> handles=driver.getWindowHandles(); //Set will not allow duplicate values
	  int size=handles.size(); //2
	  System.out.println("Number of handles are : "+size);
	  List<String> list=new ArrayList<>(size);
	  for(String str: handles) {
		  list.add(str);
	  }
	  
	  System.out.println(list.get(size-1));
	  //2-1=1 list.get(1) return you String value which is present at 1st location of list
	  
	  driver.switchTo().window(list.get(size-1)); //Switching it to newly opened window
	  boolean isPresent=driver.findElement(By.xpath("(//a[contains(text(),'Start Free Trial')])[1]")).
			  isDisplayed();
	  System.out.println(isPresent);
	 // driver.switchTo().defaultContent();
	  driver.switchTo().window(handle); //Parent window switch
	  driver.findElement(By.xpath("//a[contains(text(),'Explore')]")).click();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  
	  //Driver Navigation
	  driver.navigate().to("https://test.techlift.in/contact");
	  
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  driver.navigate().back();
	  
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //driver.close(); // Closes only current window
	  driver.quit(); //Closes all windows which was opened by Selenium
	  
}
}
