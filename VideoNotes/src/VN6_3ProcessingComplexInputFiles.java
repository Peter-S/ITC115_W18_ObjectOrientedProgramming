
import java.io.*;
import java.util.*;

public class VN6_3ProcessingComplexInputFiles {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(new File("hours.txt"));
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScan = new Scanner (line);
			
			int id = lineScan.nextInt();
			String name = lineScan.next();
			double hours = 0.0;
			int count = 0;
			while (lineScan.hasNextDouble()) {
				hours += lineScan.nextDouble();
				count++;
		}
		//System.out.printf(name  + " worked " + hours + " or " + hours/count + " a day");
		System.out.printf("%s worked %.2f (%.2f hours a day)\n", name, hours, hours/count);
		}
		
		}
	}

