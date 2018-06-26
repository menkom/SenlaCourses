public class Department{
	String name;
	
	public Department(String aName) {
	        System.out.println(this.getClass().getName());
		this.name = aName;               
	}

	public String toString(){
		return "\nDepartment:\n"+"name - "+this.name;
	}
}