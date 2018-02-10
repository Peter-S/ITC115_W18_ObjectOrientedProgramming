
import java.util.*;
import java.io.*;

public class VN6_2LineBasedProcessing {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("paper.txt"));
		expandFile (input);	
	}
	
	public static void expandFile(Scanner input) {
		while (input.hasNextLine()) {
			String text = input.nextLine();
			if (text.charAt(0) == '.') {
				System.out.println(text.substring(1));
				for (int i = 1; i <= text.length() - 1; i++) {
					System.out.print("-");
					//System.out.println();
				}
				System.out.println();
			}
			else {
				System.out.println(text);
			}
		}
	}
}


