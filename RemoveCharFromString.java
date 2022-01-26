package string;

public class RemoveCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello buddy ! how are you !!";
		System.out.println(removeCharAt(str,3));
	}

	private static String removeCharAt(String str, int i) {
		// TODO Auto-generated method stub
		return str.substring(0,i) + str.substring(i+1);
	}

}
