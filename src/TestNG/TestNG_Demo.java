package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	@BeforeSuite
	public void January() {
		System.out.println("@BeforeSuite ---- January");
	}
		@BeforeTest
		public void Febrauray() {
			System.out.println("@BeforeTest-----Febrauray");
		}
		
		@BeforeClass
		public void March() {
			System.out.println("@BeforeClass---March");
		}
		
		@BeforeMethod
		public void April() {
			System.out.println("@BeforeMethod----April");
		}
	
//	@Test
//	public void May() {
//		System.out.println("@Test--------- May");
//		}
//		
//		@Test
//		public void June() {
//			System.out.println("@Test----------June");
//		}
		
		@AfterMethod
		public void July() {
			System.out.println("@AfterMethod ---------July");
		}
		
		@AfterClass
		public void August() {
			System.out.println("@AfterClass-------August");
		}
		
		@AfterTest
		public void September() {
			System.out.println("@AfterTest----------September");
		}
		
		@AfterSuite
		public void Octombar() {
			System.out.println("@AfterSuite---------Octombar");
		}
//		 
		
		@Test
		public void December() {
		System.out.println("@Test-----------December");	
		}
		
		
}
