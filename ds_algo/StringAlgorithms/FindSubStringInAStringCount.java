package StringAlgorithms;


//Check the no of repeated occurences of a substring in a string

public class FindSubStringInAStringCount {
	
	
	static String str="abcdfbcbcapb";
	static String sub="bc";
	
	
	static void findSubStringOccurence()
	{
		
		int len1=str.length();
		int len2=sub.length();
		int count=0;
		for(int i=0;i<len1-len2+1;i++)
		{
			String s=str.substring(i,i+len2);
		
			if(s.equals(sub))
				count++;
		}
			System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		findSubStringOccurence();
	}

}
