package samplepackage;

import org.testng.annotations.DataProvider;

public class MultipleTwo {
	
	 @DataProvider(name="sampletwo")
	    public String[][] getdata() {
	    	
	    	String[][] data1 = {{"saimultiplevehicle", "Sairam@123"},{"zambiacountry", "Sairam@123"}, {"generaluat","Sairam@123"}};
	    	
	    	return data1; 
}
}