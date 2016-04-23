package StringAlgorithms;

//TC= 0(mn)

// https://www.youtube.com/watch?v=H4VrKHVG5qI  (tushar roy videos)

public class FindSubStringInAString_RabinKarpAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="abfbgafbcd";
		String pattern="fbc";
		
		int patternHash= calculateHash(pattern);
		int textHash=0;
		int patLength=pattern.length();
		int prime=3;
		boolean subStringPresent=false;
		for(int i=0;i<text.length()-patLength+1;i++)
		{
			//subStringPresent=false;
			String sub= text.substring(i,i+patLength);
		
			if(i==0)
				textHash= calculateHash(sub);
			if(i>0)
			{
			textHash=  (textHash-text.charAt(i-1))/prime;
			textHash+=sub.charAt(patLength-1)*(Math.pow(3, patLength-1));
			}
			
				
			
			if(patternHash==textHash)
			{
				boolean eq= isEqual(pattern,sub);
				if(eq)
				{
					subStringPresent=true;
					System.out.println("Pattern match present at "+i+"th location");
					//return;

				}
			}
		}
		if(!subStringPresent)
		System.out.println("Pattern match nt present");
		

	}
	
	static boolean isEqual(String pattern,String sub)
	{
		char patternCh[]=pattern.toCharArray();
		char subCh[]=sub.toCharArray();
		for(int i=0;i<patternCh.length;i++)   // o(m) =pattern length
		{
			if(patternCh[i]!=subCh[i])
			return false;
			
		}
		
		return true;
	}
	static int calculateHash(String str)
	{
		int hash=0;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			hash+=ch[i]*Math.pow(3,i);
		}
		
	//	System.out.println(hash);
		return  hash;
	}

}
