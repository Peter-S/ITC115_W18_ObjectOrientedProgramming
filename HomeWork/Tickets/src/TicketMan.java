// Ticket 'man' , oops, I meant TicketMain. (not sure if changing file names is a good idea)
// Creates new tickets, sets the parameters, loops through and prints the information
public class TicketMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket[] tickets = new Ticket[5];
	    tickets[0] = new Ticket(1);
	    tickets[1] = new AdvanceTicket(2, 5);
	    tickets[2] = new AdvanceTicket(3, 15);
	    tickets[3] = new StudentAdvanceTicket(4, 5);
	    tickets[4] = new StudentAdvanceTicket(5, 15);
	    
	    for (int i = 0; i < 5; i++) {
	    	System.out.println(tickets[i]);
	    	System.out.println();
	    }

	}

}
