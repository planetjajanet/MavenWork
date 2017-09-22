package first.lesson;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestngSecondDemo {

	@Test(dependsOnMethods= {"SecondTest"}, alwaysRun=true, groups="group1")
	public void FirstTest() {
		System.out.println("Hi i am first");
	}
	
	@Test(groups="group1")
	public void SecondTest() {
		System.out.println("Hi i am second");
	}
	
	@Test
	public void ThirdTest() {
		System.out.println("Hi i am third");
	}
	
	@Test
	public void FourthTest() {
		assertEquals(2,2);
	}
}
