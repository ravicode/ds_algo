

// Find number of occurrences of 0 to 9 upto 1 to 100

public class FindNumOfOccurrences {
	public static void main(String[] args) {
		findCount(1);
	}
	

	public static void findCount(int num)
	{
int count=0;
		
		for(int i=0;i<100;i++)
		{
			int a=i/10;
			int b=i%10;
			
			if(a==num)
			{
				count++;
				System.out.println(i);
			}
			
			if(b==num)
			{
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println("Number of "+ num +"'s= "+count);
	}
	
	
}
