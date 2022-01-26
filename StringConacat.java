package string;

public class StringConacat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		s=s.concat("Bro");
		System.out.println(s);
		
		  long startTime = System.currentTimeMillis();
	      
	      for(int i = 0; i < 5000; i++) {
	         String result = "This is"
	            + "testing the"
	            + "difference"+ "between"
	            + "String"+ "and"+ "StringBuffer";
	      }
	      long endTime = System.currentTimeMillis();
	      System.out.println("Time taken for string" 
	         + "concatenation using + operator : " 
	         + (endTime - startTime)+ " ms");
		
		
		
	      long startTime1 = System.currentTimeMillis();
	      
	      for(int i = 0; i < 5000; i++) {
	         StringBufferMethod result = new StringBufferMethod();
	         result.append("This is");
	         result.append("testing the");
	         result.append("difference");
	         result.append("between");
	         result.append("String");
	         result.append("and");
	         result.append("StringBuffer");
	      }
	      long endTime1 = System.currentTimeMillis();
	      System.out.println("Time taken for String concatenation" 
	         + "using StringBuffer : "
	         + (endTime1 - startTime1)+ " ms");

	}

}
