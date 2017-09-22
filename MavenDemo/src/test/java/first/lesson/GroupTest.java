package first.lesson;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups=("group1"))
	public void GroupTest() {
		System.out.println("THIS IS GROUP 1");
	}
	
}
