package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class Testclassb
	{
		@BeforeClass
		public void beforeClass()
		{
	    System.out.println("BeforeClass_class B");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			 System.out.println("BeforeMethod_class B");
		}
		@Test
		public void testA()
		{
		System.out.println("testA_class B");
		}
		@Test
		public void testB()
		{
		System.out.println("testB_classB");
		}
		@Test
		public void testC()
		{
		System.out.println("testC_classB");
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("afterMethod_class B");
		}
		@AfterClass
		public void afterclass()
		{
		System.out.println("afterclass_class B");
		}

	









	}









