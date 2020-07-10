package testNgPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {
	static SoftAssert sa=new SoftAssert();
	static String verification="";
	  @Test(enabled=false)
	  public void method1() {
		  int x=1;
		  int y=2;
		  if(x!=y) {
			  verification=verification+"Values for x and y is not equal";
		  }
	  }
	  
	  @Test(enabled=false)
	  public void method2() {
		  String str1="Rahul1";
		  String str2="Rahul";
		  if(str1.equals(str2)) {
			  //do nothing
		  }else {
			  verification=verification+"Values for str1 and str2 is not equal \n";
		  }
	  }
	  
	  @AfterTest(enabled=false)
	  public void throwException() throws Exception {
		  if(verification.isEmpty()) {
			  System.out.println("Both Test Passes");
		  }else {
			  System.out.println("Verification failed" );
			  throw new Exception(verification);
		  }
	  }
	  //verification is called as Soft Assertion
	 
	  
	  @Test
	  public void softAssertion2() {
		  int x=10;
		  int y=20;
		  sa.assertEquals(x, y);
		  String st1="Rahul";
		  String st2="Rahul";
		  sa.assertEquals(st1, st2);  
		  sa.assertAll(); //This will throw exception
	  }
	  @AfterTest
	  public void afterTest2() {
		  
	  }
	  
}
