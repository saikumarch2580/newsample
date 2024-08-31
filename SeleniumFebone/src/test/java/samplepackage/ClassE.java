package samplepackage;

import org.testng.annotations.Test;

public class ClassE {
  
	@Test(priority =1, groups= {"regression", "sai"})
	public void facebook() {
		
		System.out.println("This is Facebook");
	}
	@Test(priority =2, groups= {"regression", "smoke"})
	public void twitter() {
		
		System.out.println("This is twitter");
	}
	@Test(priority =3, groups= {"regression", "smoke"})
	public void orkut() {
		
		
			System.out.println("This is orkut");
		
	}
}
