import java.util.Scanner;

public class VN3_4ProgrammingwithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.print("Triangle Size ");
		int triangleSize = console.nextInt();
		drawTriangle (triangleSize);
		

	}
	
	public static void drawTriangle(int size) {
		for (int line = 1; line <= size; line++) {
			for (int space = 1; space <= -1 * line + 7; space++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars <= 2 * line - 1; stars++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
