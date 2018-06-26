import java.text.DateFormat;
import java.text.SimpleDateFormat; 
import java.util.Date;
import java.text.ParseException;

public class MainClass{
	
	public static void main(String[] args) {  
		Department department1John = new Department("Accountant");
		Department department2John = new Department("Students");
		Position currentPositionJohn = new Position("Main Accountant", department1John);
		Position prev1PositionJohn = new Position("Small Accountant", department1John);
		Position prev2PositionJohn = new Position("Student", department2John);

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                
		Date approvDate = null;
                Date issuedDate = null;
                Date validTill = null;


		try {
			approvDate = df.parse("25/06/2018");
			issuedDate = df.parse("03/01/2018");
			validTill = df.parse("04/08/2020");
		} catch (ParseException e) {
    			e.printStackTrace();
		}

                Employee employeeJohn = new Employee("John", "Smith", currentPositionJohn, approvDate);
		
		employeeJohn.addPrevPosition(prev1PositionJohn);
		employeeJohn.addPrevPosition(prev2PositionJohn);

		Passport passportJohn = new Passport("KH","2341200",issuedDate, validTill);
		employeeJohn.addPassport(passportJohn);

		Address addressHome = new Address("230012","Grodno","Pushkina","37",24);
               	employeeJohn.addAddress(addressHome);

		Room roomToWork = new Room("4207", new Address("230000","Grodno","Syvorova","127A",0));
	        employeeJohn.addRoom(roomToWork);


		System.out.println(employeeJohn);
	}
}