import java.util.ArrayList;

public class Human{
	String name;
	String surname;
        ArrayList<Passport> passports;
	ArrayList<Address> addresses;
	
	public Human(String aName, String aSurname) {
	        System.out.println(this.getClass().getName());
		this.name = aName;
		this.surname = aSurname;
		this.passports = new ArrayList<Passport>();		
		this.addresses = new ArrayList<Address>();		
	}


    	public ArrayList<Passport> getPassports() {
		return this.passports;
	}

	public void addPassport(Passport aPassport) {
		this.passports.add(aPassport);
	}

	public void removePassport(Passport aPassport) {
		this.passports.remove(aPassport);
		this.passports.trimToSize();
	}

    	public ArrayList<Address> getAddresses() {
		return this.addresses;
	}

	public void addAddress(Address aAddress) {
		this.addresses.add(aAddress);
	}

	public void removeAddress(Address aAddress) {
		this.addresses.remove(aAddress);
		this.addresses.trimToSize();
	}
}