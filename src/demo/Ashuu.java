package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ashuu {
	 
	 
		
		@BeforeClass
		public void beforeClass()
		{
			 
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("afterss");
		}
		
		
		@Test
		public void test()
		{
			System.out.println("afclass");
		}
		
		
		
		
		@AfterMethod
		public void afterMethod ()
		{
			System.out.println("erclass");
		}
		
		
		@AfterClass
		public void afterClass ()
		{
			System.out.println("afterclass");
		}
		
		
	}

