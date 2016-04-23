package StringAlgorithms_StringPermutations;

public class FindAllSubstringsOfAString {

	public static void main(String args[])
	   {
	      String string, sub;
	      int i, c, length;
	 
	      String str="abcd";
	     
	      length = str.length();   
	 
	      System.out.println("Substrings of \""+str+"\" are :-");
	 
	      for( c = 0 ; c < length ; c++ )
	      {
	         for( i = 1 ; i <= length - c ; i++ )
	         {
	            sub = str.substring(c, c+i);
	            System.out.println(sub);
	         }
	      }
	   }
}
