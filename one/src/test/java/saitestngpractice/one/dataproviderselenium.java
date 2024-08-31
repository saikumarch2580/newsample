package saitestngpractice.one;

import java.io.IOException;

import org.testng.annotations.Test;

public class dataproviderselenium {
	
	

	

	@Test(priority = 2)
	public void exceldataprovider() throws Exception {
		
		
				 
				 
				 
				 
				 
	
		
	}
		
		
	
	@Test(priority = 1)	
	String[][] logindata() throws Exception {	
	String path = "C:\\Users\\Sai Anna\\Desktop\\Excel selenium\\dataproviderexcel.xlsx";
	utilityFile utility = new utilityFile(path); 	
    int totalrows = utility.getrowcount("credentials");
	int totalcells = utility.getcellcount("credentials", 1);
	System.out.println(totalrows);
	System.out.println(totalcells);
	
	
	 
	
	String logindata[][] = new String[totalrows][totalcells];
	
	for(int i=0; i<totalrows; i++) {
		 
		 for(int j=0; j<totalcells; j++) {
	
			 logindata [i][j] = utility.celltype("Credentials", i, j);
				 
}	
		 System.out.println();	 
}
	return logindata; 

	}
	
}
