package first.lesson;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestngDemo {

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before testng test");
	}
	
	@Test
	public void FirstTest() {
		System.out.println("Do the first testng test");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Do the second testng test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After method");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After testng test");
	}
	
}
