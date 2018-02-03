import java.util.Scanner;

public class VN4_2Nested_if_else_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.print("What percentage did you earn? ");
		int percent = console.nextInt();
		
		if (percent >= 90){
		System.out.println("you got an A!");
		}
		
		else if (percent >= 80){
		System.out.println("You got a B");
		}
		
		else if (percent >= 70){
		System.out.println("You got a C");
		}
		
		else if (percent >= 60){
		System.out.println("You got a D");
		}
		
		else 
		System.out.println("you are a goat");
			
		
		System.out.println("thanks");
	}
	
}
