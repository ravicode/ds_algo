
//for example, given the string str1 = "120jdvj00ncdnv000ndnv0nvd0nvd0" 

public class RemoveZero {
public static void main(String[] args) {
	

	remove("120jdvj00ncdnv000ndnv0nvd0nvd0" );
}


static void remove(String str)
{
int k=0;
	for(int i=0;i<str.length()-1;i++)
	{
		k++;
		if(str.charAt(i)=='0' && str.charAt(i+1)=='0' )
		{
			i++;
			k++;
		/*	if(str.charAt(i)=='0' && str.charAt(i+1)=='0' )
			{
				i++;
				k++;
			}*/
		}
		else
			System.out.print(str.charAt(i));
	}
	//System.out.print(str.charAt(k));
	System.out.println();
	System.out.println(str);
	
}
}