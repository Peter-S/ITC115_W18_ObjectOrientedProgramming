import java.util.Arrays;

public class VN7_3ArrayShiftingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1, 3, 8, 0, 19, 24, 0, 7, 2, 0};
		test (list1);
		int [] list2 = {7, 3, 0, 4, 6, 0, 0, 13, 78, 0, 0, 19};
		test (list2);
		int[] list3 = {1, 2, 3, 4, 5};
		test (list3);
		int[] list4 = {0, 0, 0};
		test (list4);
		int[] list5 = {};
		test (list5);
	}
	
	public static void test(int[] list) {
		System.out.println("Before rearanging " + Arrays.toString(list));
		removeZeros(list);
		System.out.println("After zeros have been moved " + Arrays.toString(list));
		System.out.println();
	}
	
	public static void removeZeros(int[] list){
		///int[] temp = new int[list.length];
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != 0) {
				//temp[count] = list[i];
				list[count] = list[i];
				count ++;
				
			}

		}
		for (int i = count; i < list.length; i++) {
			list[i] = 0;
		}
		//for (int i = 0; i < temp.length; i++) {
			//list[i] = temp[i];
		//}
		
	}

}
