package string;

public class SearchWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello dosto !";
		int index=a.indexOf("dosto");
		if(index==-1)
		{
			System.out.println("Word  not found in string");
		}
		else
		{
			System.out.println("Word Found at index "+index);
		}
		
		System.out.println(a.contains("Hello"));// search a word within a String object
	}

}
