package testng.programs.dealsPage;

import org.testng.annotations.Test;

public class GroupsHandling {

	
	@Test(groups= {"group1"})
	public void method1() {
		System.out.println("mehtod1");
	}
	@Test(groups= {"group2"})
	public void method2() {
		System.out.println("method2 from groupshandling class");
	}
	
	
	
}
