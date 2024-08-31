package samplepackage;

import org.testng.annotations.Test;

public class ClassC {
 
		@Test() 
		public void CarAone() {
				System.out.println("Car A one ");
				
			}
		@Test()
		 public void CarBone() {
			 
			 System.out.println("Car A two should not execute");
			 
		 }
		 @Test()
		 public void CarCone() {
			 System.out.println("Car A three");
			 
			 
		 }
		 @Test
		 public void invalidCredentials() {
			 System.out.println("This is InvalidCredentials");
		 }
		 
		}



