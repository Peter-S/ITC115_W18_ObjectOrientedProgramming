
public class VN3_2ParametersandReturnVaules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(360, 30);
		table(90, 10);

	}
	
	public static void table(int maximum, int increment) {
		System.out.println("n\tsin(n)\tcos(n)");
		int entries = maximum / increment;
		for (int i = 0; i <= entries; i++) {
			int n = i * increment;
			System.out.println(n + "\t" + round2(Math.sin(n)) + "\t" + round2(Math.cos(n)));
			
		}
		System.out.println();
	}
	
	public static double round2(double number) {
		return Math.round(number * 100.0) / 100.0;
		
	}

}
