package testNgPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test(enabled=false)
	public void method1() {
		String str1="test";
		String str2="test";
		Assert.assertEquals(str1,str2);
		int x=1;
		int y=2;
		Assert.assertEquals(x,y);
	}
	
	@Test
	public void method2() throws Exception {
		String str1="test";
		String str2="test1";
		if(str1.equals(str2)) {
			System.out.println("Both Values are equal");
		}else {
			throw new Exception("Both Values are NOT equal");
		}
		int x=1;
		int y=2;
		if(x==y) {
			System.out.println("x and y Values are equal");
		}else {
			throw new Exception("x and y Values are NOT equal");
		}
	}
}
