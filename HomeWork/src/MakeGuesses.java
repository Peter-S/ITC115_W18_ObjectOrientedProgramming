import java.util.Random;
public class MakeGuesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program will randomly generate numbers between 1-50
		//until it hits 48 or higher. It will list the numbers and
		//tell you how many guesses it took. 
		
		System.out.println("Let's see how many guesses it takes!");
		Random rand = new Random();
		
		//Initialize variables
		int guessNumber = 0;
		int count = 0;
		
		//Start while loop
		while (guessNumber != 1 ) {
			int guess = rand.nextInt(50) + 1;
			count++;
			System.out.println("Guess = " + guess);
			
		//Check number if less than 48, continue guessing & if greater than 47
		//exit the loop and print out the count of guesses
			if (guess < 48) {
				guessNumber = 0;
			}
			else {
				guessNumber = 1;
			}						
		}
		System.out.println("Total Guesses = " + count);
	}
}