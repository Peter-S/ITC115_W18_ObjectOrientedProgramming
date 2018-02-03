
public class VN2_4NestedforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= i; k++) {
					System.out.print(i);
					//System.out.println();
				}
				System.out.println();
			}
			//System.out.println();
		}
		System.out.println("bye");
	}

}
