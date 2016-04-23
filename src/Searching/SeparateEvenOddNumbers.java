package Searching;
import java.util.Arrays;


public class SeparateEvenOddNumbers {
	
	public static void main(String[] args) {
		/*int arr[]={11,34,13,45,9,110,8,90,30};*/
		int arr[]={1,0,1,0,1,0,0,1,0,0,0};
		int j=arr.length-1;
		for(int i=0;i<j;)
		{
			if(arr[i]%2!=1)
				i++;
			else
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			
			if(arr[j]%2!=0)
				j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
