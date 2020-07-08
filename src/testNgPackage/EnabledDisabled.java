package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class EnabledDisabled {
	@Test(enabled=true)
	  public void firstMethod() {
		  System.out.println("First");
		  System.out.println("Question");
		  
	  }
	  
	  @Test(enabled=false)
	  public void secondMethod() {
		  System.out.println("Second");
	  }
	  
	  @Test(enabled=true)
	  public static void thirdMethod() {
		  System.out.println("Third");
	  }
	 
}
