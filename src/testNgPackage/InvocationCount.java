package testNgPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=10)
  public void f() {
	  System.out.println("Hello");
  }
  
  public static void main(String ar[]) {
	  for(int i=0;i<10;i++) {
		  System.out.println("Hello");
	  }
	  
  }
 
}
