package StringAlgorithms;

public class RemoveCharacter {

	
public static void removeCharacter(String str){
		
		char rem='a';
		String new1="";
		char arr[]= str.toCharArray();
		int size=str.length();
		
		for(int i=0;i<size;i++)
		{
			
			if(arr[i]==rem)
			{
				
			}
			else
			{
				new1=new1+arr[i];
			}
			
		}
		
		System.out.println("new String= "+ new1);
	}
	

public static void main(String[] args) {
	
	String str="ravi kumar";
	removeCharacter(str);
}
}
