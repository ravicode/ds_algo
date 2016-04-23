package StringAlgorithms;

import java.util.StringTokenizer;
/*
Given a string, reverse the word, but keep the comma, number and space.*/

public class ReverseStringsInSentence {
	
	static String wordReversal(String str)
	{
		char ch[]=str.toCharArray();
		int p=str.length();
		for(int i=0;i<p/2;i++)
		{
			char c=ch[i];
		ch[i]=ch[p-i-1];
		ch[p-i-1]=c;
			
	}	
	
		return new String(ch);
		
		
	}
	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("Ajay is a good boy . but , he likes to code ");
		//StringBuffer str1="ggg";
	
		StringTokenizer st=new StringTokenizer(str.toString()," ");
		System.out.println(str );
		while(st.hasMoreTokens())
		{
			/*System.out.print(new StringBuffer(st.nextToken()).reverse()+ " ");*/
			
			System.out.print(wordReversal(st.nextToken())+ " ");
		}
		
	
	}

}
