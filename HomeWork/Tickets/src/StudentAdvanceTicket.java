// This class extends Advance Ticket and handles student pricing
public class StudentAdvanceTicket extends AdvanceTicket{
	
	// constructor with 2 parameters (from super class and advanced class)
	public StudentAdvanceTicket (int ticketNumber, int numberOfDays) {
		super(ticketNumber, numberOfDays);
	}
	
	// Overrides getPrice and does the math for Student tickets
	public double getPrice() {
		return super.getPrice() / 2;
	}
	
	//adds  a reminder to the toSting for students to bring ID
	
	public String toString() {
			return super.toString() + "Student Price: Please show ID." ;
		}
		
	}

