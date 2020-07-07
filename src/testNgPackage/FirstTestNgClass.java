package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FirstTestNgClass {
  @Test(priority=3)
  public void firstMethod() {
	  System.out.println("First");
  }
  
  @Test(priority=2)
  public void secondMethod() {
	  System.out.println("Second");
  }
  
  @Test(priority=1)
  public void thirdMethod() {
	  System.out.println("Third");
  }
  
  @Test(priority=0, enabled=false)
  public void z() {
	  System.out.println("Zebra");
  }
  
}
