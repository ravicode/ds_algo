package Array;
import java.util.Arrays;


public class ShuffleArray {
	
	void shuff(String arr[],int l,int r)
	{
		int c=(l+r)/2;
		int q=1+(l+c)/2;
		if(l==r)
			return;
		
		for(int k=1,i=q;i<=c;i++,k++)
		{
			String tmp=arr[i];
			arr[i]=arr[c+k];
			arr[c+k]=tmp;
		}
		shuff(arr,l,c);
		shuff(arr,c+1,r);
		
	}
	
	public static void main(String[] args) {
		ShuffleArray sf=new ShuffleArray();
		
		String arr[]={"a1","a2","a3","a4","b1","b2","b3","b4"};
		sf.shuff(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
