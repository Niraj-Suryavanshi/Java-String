package string;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="aagyecodingkrne";
		String reverse=new StringBufferMethod(string).reverse().toString();
		System.out.println("String before reverse "+string);
		System.out.println("String after reverse "+reverse);
		
		System.out.println();
		
		String input="achha to hum sikhaye apko";
		
		System.out.println("Original string :"+input);
		System.out.print("String after reverse :");
		
		char [] try1 =input.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
		{
			System.out.print(try1[i]);
		}
		

	}

}
