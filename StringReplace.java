package string;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Hello";
		System.out.println(str.replace('o', 'z'));
		System.out.println(str.replaceFirst("He", "Ne"));
		System.out.println(str.replaceAll("He","Ne"));

	}

}
