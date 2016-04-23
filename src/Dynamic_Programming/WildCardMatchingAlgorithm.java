package Dynamic_Programming;

public class WildCardMatchingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="xaylmz";
String pattern="x?y*z";
		boolean stringMatches=  isMatch(str,pattern);
		
		System.out.println("\n\n Is String and  pattern Matches="+stringMatches);
	}

	static boolean isMatch(String str,String pattern)
	{
		
		char str1[]=str.toCharArray();
		
		char pat1[]=pattern.toCharArray();
		
		int strLen=str1.length;
		int patternlength=pat1.length;
		
		
		
		boolean mat[][]=new boolean[strLen+1][patternlength+1];
		
		mat[0][0]=true;
		for(int i=1;i<strLen+1;i++)
		{
			mat[i][0]=false; // since an emptry Substring of pattern dosnt matches with substring of string
		}
		
		
		for(int i=1;i<patternlength+1;i++)
		{
			mat[0][i]=false; // since an emptry Substring of string dosnt matches with substring of patrern
		}
		
		for(int i=1;i<strLen+1;i++)
		{
			for(int j=1;j<patternlength+1;j++)
			{
				if(pat1[j-1]==str1[i-1])    //when chararacters matches  , it means true or value which is alrewady ignrnign cureent characersa and that is at dialgonal
				{
					mat[i][j]=mat[i-1][j-1];
				}
				
				if(pat1[j-1]=='?')  //ignore curretn   charcters and go to diagonal
				{
					mat[i][j]=mat[i-1][j-1];
				}
				
				if(pat1[j-1]=='*')   // either left is true or upper is true, take  that * means zero subsequence or soe charcters at that postion.
				{ 
					
					mat[i][j]=(mat[i-1][j]?mat[i-1][j]:mat[i][j-1]);
				}
				
			}
		}
		
		
		for(int i=0;i<strLen+1;i++)
		{
			for(int j=0;j<patternlength+1;j++)
			{
				System.out.print(mat[i][j]+" ");
			
			}
			System.out.println();
		}
		
		return mat[strLen][patternlength];
	}
}
