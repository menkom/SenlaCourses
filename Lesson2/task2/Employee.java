import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat; 
import java.text.DateFormat;

public class Employee extends Human{
	Position position;
	Date approvedForPosition;
        ArrayList<Position> prevPositions;
	ArrayList<Room> rooms;
	
	public Employee(String aName, String aSurname, Position aPosition, Date aApprov) {
		super(aName, aSurname);
		this.position = aPosition;
		this.approvedForPosition = aApprov;
	 	this.prevPositions = new ArrayList<Position>();		
		this.rooms = new ArrayList<Room>();		
	}


    	public ArrayList<Position> getPrevPositions() {                                                              
		return this.prevPositions;
	}

	public void addPrevPosition(Position aPosition) {
		this.prevPositions.add(aPosition);
	}

	public void removePrevPosition(Position aPosition) {
		this.prevPositions.remove(aPosition);
		this.prevPositions.trimToSize();
	}

    	public ArrayList<Room> getRooms() {
		return this.rooms;
	}

	public void addRoom(Room aRoom) {
		this.rooms.add(aRoom);
	}

	public void removeAddress(Room aRoom) {
		this.rooms.remove(aRoom);
		this.rooms.trimToSize();
	}
	public String toString(){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		String result = "\nEmployee:\n"+
		  	"name - "+this.name+
			"\nsurname - "+this.surname+
			this.position+
		  	"\napproved for position - "+df.format(this.approvedForPosition);


		result += "\nPassports: ";
		for (int i = 0; i < this.passports.size(); i++) {
			result += "\n"+(i+1)+" "+passports.get(i) + " ";
		}
	 
		result += "\nAddresses: ";
		for (int i = 0; i < this.addresses.size(); i++) {
			result += "\n"+(i+1)+" "+addresses.get(i) + " ";
		}

		result += "\nPreviuos positions: ";
		for (int i = 0; i < this.prevPositions.size(); i++) {
			result += "\n"+(i+1)+" "+prevPositions.get(i) + " ";
		}
	 
		result += "\nRooms: ";
		for (int i = 0; i < this.rooms.size(); i++) {
			result += "\n"+(i+1)+" "+rooms.get(i) + " ";
		}
	 
	        return result;

	}
}