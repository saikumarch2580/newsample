package saitestngpractice.one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider = "getdata")

public class dataProvider {
	
	
	public void login(String username, String Password) {
	
		//public void login(String[] s) {
			System.out.println(username);
		
	//	System.out.println("Current Password is:" + username +", "+ Password );
	 
	}

@DataProvider
public String[][] getdata() {
	
/*	 Object[][] data = new Object[3][2];
	 
	 data[0][0] = "generaluat";
	 data[0][1] = "ABC@123";
	 
	 data[1][0] = "saicar";
	 data[1][1] = "DEF@123";
	 
	 data[2][0] = "dangelo.kunde";
	 data[2][1] = "GHI@123";
	 
	 
	return data; */
	
	
	 
	 String[][]olddata = new String[][]{
		 {"saicar", "123"},
		 {"Generaluat", "Sairam@123"}
	 
	 };
	 return olddata;
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	

}
}