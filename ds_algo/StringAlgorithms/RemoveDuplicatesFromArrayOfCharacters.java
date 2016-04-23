package StringAlgorithms;

public class RemoveDuplicatesFromArrayOfCharacters {
	
	public static void main(String[] args) {
		String str="abcdgghdklewqlp";
		char []ch=str.toCharArray();
		
		removeDuplicates(ch,ch.length);
		ch=str.toCharArray();
		removeDuplicatesAsOrderGiven(ch,ch.length);  //order is preserved 
		
		
	}
	
	static void removeDuplicatesAsOrderGiven(char []ch,int n)       //TC=O(N)  SC= O(n)
	{
		int ch1[]=new int[255];
		
		
		for(int i=0;i<n;i++)
		{
			if(ch1[ch[i]]==0)
			ch1[ch[i]]++;
		}
		
		
		for(int i=0;i<n;i++)
		{
			if (ch1[ch[i]]>0)
				
			{
				System.out.print(ch[i]);
				ch1[ch[i]]--;
			}
			
		}
	}
	
	static void removeDuplicates(char []ch,int n)   //TC=O(1)  SC= O(n)
	{
		int i=0,j=0;
		for( i=0;i<n;i++)
		{
			for(j=i+1;j<n;)
			{
				if(ch[i]==ch[j])
				{
					
					ch[j]=ch[--n];
					ch[n]=' ';
				}
				else
					j++;
			}
			
		}
		//ch[i]=ch[++j];
		//ch[++i]='\0';
		
		System.out.println(new String(ch));
	}

}
