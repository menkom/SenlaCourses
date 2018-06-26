public class Position{
	String name;
        Department department;
	
	public Position(String aName, Department aDep) {
	        System.out.println(this.getClass().getName());
		this.name = aName;
           	this.department = aDep;               
	}

	public String toString(){
		return "\nPosition:\n"+"name - "+this.name+this.department;
	}

}