package string;

public class MatchRegionInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String first_str = "Welcome to Microsoft";
	      String second_str = "I work with Microsoft";
	      boolean match = first_str.regionMatches(11, second_str, 12, 9);
	      System.out.println("first_str[11 -19] == " + "second_str[12 - 21]:-"+ match);
	}

}
