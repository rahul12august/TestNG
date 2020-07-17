package testNgPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assertion {
	@Test(enabled=false)
	public void assertJava() throws Exception {
		String s1="RahulT";
		String s2="Rahul";
		int i=10;
		int j=10;
		if(s1.equals(s2)) {
			System.out.println("String validation passes");
		}else {
			throw new Exception("String validation fails");
		}
		if(i==j) {
			System.out.println("Int validation passed");
		}else {
			throw new Exception("Int Validation fails");
		}
		
	}
	
	@Test
	public void assertTestNg() {
		String s1="RahulT";
		String s2="Rahul";
		int i=10;
		int j=10;
		Assert.assertEquals(s1, s2);
		Assert.assertEquals(i, j);
	}
}
