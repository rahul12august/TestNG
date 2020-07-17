package testNgPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {
	static String errorValidation="";
	SoftAssert sAssert=new SoftAssert();
	  @Test(enabled=false)
	  public void method1() throws Exception {
		  String s1="Rahul";
		  String s2="Rahul";
		  if(s1.equals(s2)){
			  System.out.println("String validation passes");
		  }else {
			  errorValidation+="String validation fails"+s1+ "is not equals to " +s2 +"\n";
		  }
		  int i1=10;
		  int i2=20;
		  if(i1==i2){
			  System.out.println("Int validation passes");
		  }else {
			  errorValidation+="String validation fails"+i1+ "is not equals to " +i2 +"\n";
		  }
		  if(! errorValidation.isEmpty()) {
			  throw new Exception(errorValidation);
		  }
	  }
	  
//	  @Test(enabled=true)
//	  public void method2() {
//		  
//	  }
//	  
//	  @AfterTest
//	  public void verify() throws Exception {
//		  if(! errorValidation.isEmpty()) {
//			  throw new Exception(errorValidation);
//		  }
//
//	  }
	  
	  //Selenium Verification
	  
	  @Test
	  public void seleniumVerification() {
		  int x=10;
		  int y=10;
		  String s1="Test";
		  String s2="Test1";
		  sAssert.assertEquals(x, y);
		  sAssert.assertEquals(s1, s2);
		  sAssert.assertAll();
	  }
	  
}
