package string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hllo World";
		String anotherString="hello world";
		String str2="Hello World";
		Object objStr=str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
		System.out.println(str.equals(str2));
		String str3=new String("Hello World");
		System.out.println(str2.equals(str3));
		System.out.println(anotherString.equals(str3));
		
		System.out.println();
		
		  String s1 = "tutorialspoint";
	      String s2 = "tutorialspoint";
	      String s3 = new String ("tutorialspoint");
	      System.out.println(s1 == s2);
	      System.out.println(s2 == s3);
		
	}

}
