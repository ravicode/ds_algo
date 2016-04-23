package Searching;
import java.util.HashMap;
import java.util.Map;


public class FindFirstRepeatedNumber {
	
	void findFirstRepeated(int arr[])
	{
		Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i],mp.get(arr[i])+1);
				
			}else
				mp.put(arr[i],1);
		}
		int i;
		for( i=0;i<mp.size();i++)
		{
			if(mp.get(arr[i])>1)
			{
				break;
			}
		}
		
		if(i!=mp.size())
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args) {
		int arr[]={3,2,1,2,2,3,5};
		new FindFirstRepeatedNumber().findFirstRepeated(arr);
	}

}
