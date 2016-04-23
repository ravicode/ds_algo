package StringAlgorithms;


public class CheckPalinDrome {
	
	public static void main(String[] args) {
		
		String str="ravi kumar";
		
		String str1= reverseRecursion(str);
		if(str.equals(str1))
			System.out.println("Palindrome");
		
		char flag=palineDrome(str);
		if(flag=='y')
		System.out.println("Palindrome");
		
	}
	
	
	
	public static char palineDrome(String str)

	{
		
		char arr[]= str.toCharArray();
		int size=str.length();
		int len=str.length()/2;
		System.out.println("Length="+len);
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]==arr[size-i-1])
			{
				
				if(i==len-1)
				return 'y' ;
			}
			else
			{
				break ; 
			}
		}
		
		System.out.println("--------No Plaindrome");
		return 'n';
		
	}
	
	
	
	
	public static String reverseRecursion(String str)
	{
		
		if(str.length()<2)
			return str;
		
		return reverseRecursion(str.substring(1)) + str.charAt(0);
		
	}
}




//r a v i k u m a r 