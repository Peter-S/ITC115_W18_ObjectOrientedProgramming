//this is the super class that AdvanceTicket will extend from 
//I did not create a WalkUp class, all that information is contained in this class
public class Ticket {
	public int ticketNumber;
	
	//Constructor for ticket object
	public Ticket(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	//method getPrice
	public double getPrice() {
		return 50.00;
	}
	
	//method toString
	public String toString() {
	    String output = String.format("Ticket #%d\nPrice: $%.2f\n", this.ticketNumber, this.getPrice());
		return output;
		
	}
}
	
