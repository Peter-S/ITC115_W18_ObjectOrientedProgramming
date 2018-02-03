
public class VN3_3WorkingwithStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert ("Kane, Erica"));
		System.out.println(convert ("Chandler, Adam"));
		System.out.println(convert ("Martin, Tadd"));	

	}
	
	public static String convert(String name) {
		int commaindex = name.indexOf(",");
		String lastName = name.substring(0, commaindex);
		String firstName = name.substring(commaindex + 2, name.length() );
		return firstName + " " + lastName.toUpperCase();
	}

}
