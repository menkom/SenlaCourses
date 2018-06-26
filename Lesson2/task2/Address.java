public class Address{
	String zip;
	String town;
	String street;
	String house;
	int flat;
	
	public Address(String aZip, String aTown, String aStreet, String aHouse, int aFlat) {
	        System.out.println(this.getClass().getName());
		this.zip = aZip;
		this.town = aTown;
		this.street = aStreet;
		this.house = aHouse;
		this.flat = aFlat;
	}

	public String toString(){
		return "\nAddress:"+
 			"\nzip - "+this.zip+
 			"\ntown - "+this.town+
 			"\nstreet - "+this.street+
 			"\nhouse - "+this.house+
 			"\nflat - "+this.flat;
	}

}