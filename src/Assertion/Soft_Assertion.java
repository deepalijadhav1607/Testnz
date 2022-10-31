package Assertion;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
		SoftAssert soft = new SoftAssert();
		
		
	@Test
	public void Demo() {
		soft.assertEquals("Java", "Java");
		System.out.println("Executed Successful");
		
		soft.assertEquals("Selenium", "Selenium");
		System.out.println("Successful done");
		
		soft.assertAll();
		// it will collect the result of all the assertion and in case of any assertion failed that time
    	//it will marked the test as failed
	}
		@Test
		public void Demo1() {
			soft.assertEquals("Deepali", "Deepali");
			System.out.println("Done");
			soft.assertTrue(true);
			
			soft.assertFalse(false);
			
			soft.assertEquals(true, true);
		//	soft.assertEquals(false, true); (will return fail)
			soft.assertAll();
		}
	}
	

