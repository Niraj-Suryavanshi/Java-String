package string;

public class LastOccurenceOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig="Hello world,Hello Reader";
		int lastIndex=strOrig.lastIndexOf("Hello");
		
		if(lastIndex==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found at location "+lastIndex);
		}
		
		  String t1 = "Tutorialspoint";
	      int index = t1.lastIndexOf("p");
	      System.out.println(index);

	}

}



















