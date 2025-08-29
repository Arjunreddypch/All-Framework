package testng.programs.dealsPage;

import org.testng.annotations.Test;

public class GroupsHandling2 {

	
	@Test(groups= {"group2"})
	public void method3() {
		System.out.println("mehtod3 from groupsHandling2 class");
	}
	@Test(groups= {"groups3"})
	public void method4() {
		System.out.println("mehtod4");
	}
	
	
}
