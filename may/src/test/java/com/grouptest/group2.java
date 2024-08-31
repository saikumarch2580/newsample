package com.grouptest;

import org.testng.annotations.Test;

public class group2 {

@Test(groups = {"smoke"})
public void group2one() {
		
		System.out.println("this is grouptwoone in group2");
		
		
	}
@Test()	
public void group2two() {
		
		System.out.println("this is group2two in group2");
		
		
	}
@Test()
public void group2three() {
	
	System.out.println("this is grouptwothree in group2");
	
	
}
	
	
	
}
