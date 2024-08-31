package April.may;

public class EmployeeDetails {
	
	String name;
	int id;
	String Collage;
	
	
	public EmployeeDetails(String name, int id, String Collage) {
		
		this.name = name;
		this.id= id;
		this.Collage= Collage;
			
	}
	
	public String GetName() {
		
		return name;
	}
	
	public int GetId() {
		
		return id;
	}
	
	public String GetCollageName() {
		
		return Collage;
	}

	public static void main(String[] args) {
		
		
		EmployeeDetails ts = new EmployeeDetails("sairam", 100, "Adithya");
		
		System.out.println("Employee name is "+ts.GetName());
		System.out.println("Collage name is "+ts.GetCollageName());
		System.out.println("Employee id is "+ ts.GetId());
		System.out.println("-----------------------------");
		System.out.println(ts.name);
		System.out.println(ts.id);
		System.out.println(ts.Collage);
		
	}

}
