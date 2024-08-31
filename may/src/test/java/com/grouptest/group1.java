package com.grouptest;

import org.testng.annotations.Test;

public class group1 {
	@Test()
	public void group1One() {
		
		System.out.println("this is grouponeone in group1");
		
		
	}
@Test()	
public void group1two() {
		
		System.out.println("this is grouponetwo in group1");
		
		
	}
@Test(groups = {"smoke"})
public void group1three() {
	
	System.out.println("this is grouponethree in group1");
	
	
}

}
