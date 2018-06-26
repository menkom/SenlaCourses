public class Room{
	String number;
        Address address;
	
	public Room(String aNumber, Address aAddress) {
	        System.out.println(this.getClass().getName());
		this.number = aNumber;
           	this.address = aAddress;               
	}

	public String toString(){
		return "\nRoom:\n"+"number - "+this.number+this.address;
	}

}