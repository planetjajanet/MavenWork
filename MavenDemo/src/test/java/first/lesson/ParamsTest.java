package first.lesson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamsTest {
	
	@Test(dataProvider="getData")
	public void UserId(String name, String subject) {
		System.out.println("Name: " + name + " Subject: " + subject);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object obj[][] = {
				{"Janet", "Info Sys"},
				{"Emily", "Comp Sci"}
		};
		return obj;
	}
	
}
