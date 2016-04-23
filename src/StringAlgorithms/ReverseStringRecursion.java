package StringAlgorithms;

//Reverse a string efficiently.
//by recusrion
public class ReverseStringRecursion {

	static String reverse(String str)
	{
		if(str.length()<2)
			return str;
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("ravi"));
	}
}
