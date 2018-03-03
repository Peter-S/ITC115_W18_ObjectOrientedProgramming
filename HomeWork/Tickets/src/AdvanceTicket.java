//This class extends Ticket and defines pricing for tickets bought early

public class AdvanceTicket extends Ticket{
	//creates var for early purchase
	public int numberOfDays;
	
	//constructor with 2 parameters (the first from the super class)
	public AdvanceTicket (int ticketNumber, int numberOfDays) {
		super(ticketNumber);	
	}
	
	// sets the discount price based on numbers of days before event tickets are purchased
	public double getPrice() {
		if (numberOfDays >= 10) {
			return 30.00;
		}else {
			return 40.00;
		}
	}
	
}
