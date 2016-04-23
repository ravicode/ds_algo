package Dynamic_Programming;

public class LongestPalindromeSubString {

	static void findLon(String str)
	{
		char ch[]=str.toCharArray();
		int mat[][]=new int[ch.length][ch.length];
		
		int curr_len=1; int max_len=0;
		//palindrome substring for length=1
		for(int i=0;i<ch.length;i++)
		{
			
				mat[i][i]=1;
			
		}
		int palBeginAt=0;
		
		//palindrome substring for length=2
		for(int i=0;i<ch.length-1;i++)
		{
			
		if(ch[i]==ch[i+1])
		{
			mat[i][i+1]=1;
			palBeginAt=i;
			max_len=2;
			
		}
		}
		
		//palindrome substring for length=3
		for(int i=3;i<=ch.length;i++)
		{
			curr_len=i;
			for(int j=0;j<ch.length-i+1;j++)
			{
				//System.out.println(str.substring(j,j+i));
				
				if(ch[j]!=ch[j+i-1])
				mat[j][j+i-1]=0;
				
				 if((ch[j]==ch[j+i-1] && mat[j+1][j+i-1-1]==1))//if end character matches and then rest mid substring is already true bcoz we have calaculated shorted string before only
				{
					mat[j][j+i-1]=1;
					max_len=i;
					
					palBeginAt=j;
				}
				
				
			
				
			}
		}
		
		if(max_len==ch.length) max_len--;
		
		System.out.println("Maximum Longest Substring="+ max_len+"\n");
		//System.out.println(palBeginAt+" "+max_len);
		System.out.println("Palindrome is="+ str.substring(palBeginAt,max_len+1));
		System.out.println();
		
		
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=0;j<ch.length;j++)
			{
		System.out.print(mat[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="BANANA";
		findLon(str);
	}

}
