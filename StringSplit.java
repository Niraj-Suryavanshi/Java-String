package string;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="t u t o r i a l s";
		String []words=s1.split("\\s");//split by space
		for(String str:words)
		{
			System.out.println(str);
		}
		
		  System.out.println();
		  
		  String str = "jan-feb-march";
		  
	      String[] temp;
	      
	      String delimeter = "-";
	      
	      temp = str.split(delimeter);
	      
	      for(int i = 0; i < temp.length; i++) 
	      {
	         System.out.println(temp[i]);
	         System.out.println("");
	         str = "jan.feb.march";
	         delimeter = "\\.";
	         temp = str.split(delimeter);
	      }
	      
	      
	      for(int i = 0; i < temp.length; i++) 
	      {
	          System.out.println(temp[i]);
	          System.out.println("");
	          temp = str.split(delimeter,2);
	          
	          for(int j = 0; j < temp.length; j++)
	          {
	             System.out.println(temp[j]);
	          }
	       }

	}

}
