
public class VN2_5DrawingComplexFigureswithforLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int line = 1; line <= 5; line++) {
			//print (-4 * line + 20)
			for (int slash = 1; slash <= (-4 * line + 20); slash++) {
				System.out.print("/");
			}
			
			for (int star = 1; star <= (8 * line -8); star++) {
				System.out.print("*");
			}
			for (int slash = 1; slash <= (-4 * line + 20); slash++) {
				System.out.print("\\");
			}
			System.out.println();
		}
		

	}

}
