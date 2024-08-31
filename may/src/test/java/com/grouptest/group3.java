package com.grouptest;

import org.testng.annotations.Test;

public class group3 {
	
	
@Test()	
public void group3one() {
		
		System.out.println("this is groupthreeone in group3");
		
		
	}
@Test(groups = {"smoke"})	
public void group3two() {
		
		System.out.println("this is group3two in group3");
		
		
	}
@Test()
public void group3three() {
	
	System.out.println("this is group3three in group3");
	
	
}
	

}
