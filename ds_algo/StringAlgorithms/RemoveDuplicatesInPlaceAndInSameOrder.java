package StringAlgorithms;

import java.util.Arrays;

//Convert a string into a string without duplicates without 
//changing the order of characters IN PLACE. 
//EG: Input: Bananas Output: Bans.
public class RemoveDuplicatesInPlaceAndInSameOrder {
	
	static void remDup(char ch[])
	{
		int len=ch.length;
		
		int top=-1;
		for(int i=0;i<len;i++)
		{
			char c=ch[i];
			if(c!=' ')
			ch[++top]=c;
			for(int j=i+1;j<len-1;j++)
			{
				if(c==ch[j])
					ch[j]=' ';
				else
					if(ch[j]!=' ')
					ch[++top]=ch[j];
				
				
				
			}
		top=i;
		}
		
		int k=-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				System.out.println(ch[i]);
				ch[++k]=ch[i];
				//ch[i]=' ';
			}
			else
				ch[i]=' ';
			
		}
		
		System.out.println(Arrays.toString(ch));
		
	}
	
	
	public static void main(String[] args) {
		String str="Bananas";
		
		remDup(str.toCharArray());
	}

}
