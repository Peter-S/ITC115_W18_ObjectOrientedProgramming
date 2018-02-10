import java.util.*;
public class RandomWalk {
// This program starts at 0 and randomly steps up one number or 
//	down one number till it reaches 3 or -3.  iIt reports the numbers and 
//	finally the max number selected at the end.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize random, starting position and the max variable. 
		//I tried 0 to start with on the max variable and quickly learned it
		//can guess -1, -2, -3.
		Random number = new Random();
		int position = 0;
		int max = -1;
		
		//while loop with the exit parameters
		while (position != 3 && position != -3) {
			//generates n, a random number between 0-99
			int n = number.nextInt(100);
			//if loop ups the position if the number is below 50 and
			//decreases if is above 49
			if (n < 50) {
				position++;
				//if loop to adjust the max variable
				if (position > max) {
					max = position;
				}
			}else {position--;
			}
			System.out.println("Position = " + position);
		}
		System.out.println("Max Position = " + max);
	}
}
