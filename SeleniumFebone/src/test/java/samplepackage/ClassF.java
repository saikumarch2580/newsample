package samplepackage;

import org.testng.annotations.Test;

public class ClassF {
	
	@Test(priority =1, groups= {"smoke"})
	public void school() {
		
		System.out.println("this is school");
	}
	@Test(priority =2, groups= {"smoke", "sai"})
	public void collage() {
		
		System.out.println("This is collage");
	}
    @Test(priority =3, groups= {"regression", "sai"})
	public void job() {
		
		System.out.println("This is new job");
	}
}
