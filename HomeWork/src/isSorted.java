// This program sets up a couple of test arrays and traverses them comparing
//the numbers to see if list is sorted, highest to lowest

		////////I commented out the body of my first program, it runs fine, but I wanted to do it with a boolean statement, it also works
public class isSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//sets up test arrays and calls test method
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		test (list1);
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		test (list2);
	}
	////////I commented out the body of my first program, it runs fine, but I wanted to do it with a boolean statement, it also works
/*	
	//test method traverse arrays, leaving out the last number in the array
	//it compares position 0 to position 1 to see if 0 is less then 1 and so on.
	public static void test(double[] list) {
	//set up flag, if first position is not less then second, add to flag
		int flag = 0;
	//for loop goes through the array
		for (int i = 0; i < list.length -1; i++) {
			if (list[i] > list[i + 1]) {
				flag++;
			} 		
		}
	//if/else statement that says if the flag is greater then 0, the list is not in order
	//and if flag equals 0 the list is sorted
		if (flag > 0) {
			System.out.println("Is Sorted False");
		}else System.out.println("Is Sorted True");
	}
}
*/
	
	
	// this method takes in the arrays and prints the "is sorted" statement, calls isThisSorted and returns true or false
	public static void test(double[] list) {
		System.out.println("Is Sorted "   + isThisSorted(list));
	}
	//boolean method to determine if the list is in order, if item in the zero position 
	//is greater then the item in the 1 position, return false, otherwise return true
	public static boolean isThisSorted(double[] list) {
		for (int i = 0; i < list.length -1; i++) {
			if (list[i] > list[i + 1])
				return false;
				
		}return true;
	}
}
