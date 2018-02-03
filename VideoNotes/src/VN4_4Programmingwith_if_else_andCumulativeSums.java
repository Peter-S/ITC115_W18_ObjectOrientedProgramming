import java.util.Scanner;

public class VN4_4Programmingwith_if_else_andCumulativeSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console =  new Scanner(System.in);
		System.out.print("Max number? ");
		int max = console.nextInt();
		
		int primeCount = 0;
		for (int i = 2; i <= max; i++) {
			if (countFactors(i) == 2){
				primeCount++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		double percent = 100.0 * primeCount / max ;
		System.out.println(primeCount + " Primes" + "(" + percent +"%)");
		
		

	}
	
	public static int countFactors(int number) {
		//look at each int from 1 to number see whether it
		//is a factor of number. count them and return total
		//  cumulaitive sum
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number %  i == 0) {
				count++;
			}
			
		}
		return count;
	}

}
