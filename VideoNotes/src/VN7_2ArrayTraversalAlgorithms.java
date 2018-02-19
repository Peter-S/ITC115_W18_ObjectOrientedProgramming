import java.util.Arrays;
import java.util.*;

public class VN7_3ArrayTraversalAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {5, 7, 7, 7, 8, 22, 22, 31, 35, 35, 40, 40, 40, 41};
		test (list1);
		int[] list2 = {1, 2, 11, 17, 19, 23, 24, 25, 31, 34, 40, 41};
		test (list2);
		int[] list3 = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
		test (list3);
		int[] list4 = {65};
		test (list4);
		int[] list5 = {};
		test (list5);
	}
	
	public static void test(int[] list) {
		System.out.println("Testing " + Arrays.toString(list));
		System.out.println("    length = " + list.length);
		System.out.println("    unique = " + numUnique(list));
	}
	
	public static int numUnique(int[] list) {
		if(list.length == 0)
			return 0;
		else {
		int count = 1;
		for(int i = 1; i < list.length; i++){
			if (list [i] != list[i -1] ) {
				count++;	
			}
			
		}
		return count;
		}
	}
}
