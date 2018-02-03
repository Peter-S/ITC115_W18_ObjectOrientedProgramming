
import java.util.Random;
public class VN5_1RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's roll some dice");
		Random rand = new Random();
		int odds = 0;
		int count = 0;
		while (odds < 3) {
			int roll = rand.nextInt(6) + 1;
			count++;
			System.out.println("You rolled a " + roll);
			if (roll % 2 == 1){
				odds++;
			}
			else {
				odds = 0;
			}
		}
		System.out.println("you rolled " + count + " times");
	}
}
