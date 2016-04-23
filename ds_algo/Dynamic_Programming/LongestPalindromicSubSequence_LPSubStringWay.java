package Dynamic_Programming;



public class LongestPalindromicSubSequence_LPSubStringWay {

	static void findLon(String str)
	{
		char ch[]=str.toCharArray();
		int mat[][]=new int[ch.length][ch.length];
		
		int curr_len=1; int max_len=0;
		for(int i=0;i<ch.length;i++)
		{
			
				mat[i][i]=1;
			
		}
		
		
		int palBeginAt=0;
		
		//find palidromic for length 2
		for(int i=0;i<ch.length-1;i++)
		{
			
		if(ch[i]==ch[i+1])
		{
			mat[i][i+1]=2;
		//	palBeginAt=i;
			//max_len=2;
			
		}
		}
		
		//find palindromic for length more that 2
		for(int i=3;i<=ch.length;i++)
		{
			curr_len=i;
			for(int j=0;j<ch.length-i+1;j++)
			{
				//System.out.println(str.substring(j,j+i));
				
				if(ch[j]!=ch[j+i-1])
				mat[j][j+i-1]=Math.max(mat[j+1][j+i-1], mat[j][j+i-1-1]);
				
				 if((ch[j]==ch[j+i-1] /*&& mat[j+1][j+i-1-1]==true*/))//if end character matches and then rest mid substring is already true bcoz we have calaculated shorted string before only
				{
					mat[j][j+i-1]=2+mat[j+1][j+i-1-1];// true;
					//max_len=i;
					//palBeginAt=j;
				}
				
				
			
				
			}
		}
		
		System.out.println("Palidromic Longest SubSequence="+ mat[0][ch.length-1]+"\n");
	//	System.out.println("Palindrome is="+ str.substring(palBeginAt,max_len+1));
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
String str="agbdba";
		findLon(str);
	}

}
