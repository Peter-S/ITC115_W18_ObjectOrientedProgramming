import java.util.*;
public class VN5_3Sentinal_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner (System.in);
		
		
		System.out.println("Please enter a number (0 to quit) ");
		int input = console.nextInt();
		int min= input;
		
		
		while(input != 0) {
			
			if(input < min) {
				min = input;
			}
			System.out.println("Please enter a number (0 to quit) ");
			input = console.nextInt();
	
		}	
		System.out.println("The smallest number is " + min);
	}
}
