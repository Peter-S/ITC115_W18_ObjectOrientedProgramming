
import java.util.*;
public class VN_TEST_BLOCK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		test (list1);
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		test (list2);
	}
	
	public static void test(double[] list) {
		System.out.println("Is Sorted "   + isSorted(list));
	}
	
	public static boolean isSorted(double[] list) {
		for (int i = 0; i < list.length -1; i++) {
			if (list[i] > list[i + 1])
				return false;
				
		}return true;
	}
}
