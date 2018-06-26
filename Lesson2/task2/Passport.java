import java.util.Date;
import java.text.SimpleDateFormat; 
import java.text.DateFormat;

public class Passport{
	String series;
	String number;
	Date issuedDate;
	Date validTill;
	
	public Passport(String aSeries, String aNumber, Date aIssuedDate, Date aValidTill) {
	        System.out.println(this.getClass().getName());
		this.series = aSeries;
		this.number = aNumber;
		this.issuedDate = aIssuedDate;
		this.validTill = aValidTill;
	}

	public String toString(){
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return "\nPassport:\n"+
 			"series - "+this.series+
 			"\nnumber - "+this.number+
 			"\nissued date - "+df.format(this.issuedDate)+
 			"\nvalid till - "+df.format(this.validTill);
	}
}