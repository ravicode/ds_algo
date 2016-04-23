package Sorting;

public class BubbleSort1 {
	
	
	public static void bubbleSrt(int arr1[])
	{
		int len=arr1.length-1;
		int temp=0;
boolean flag=true;    //just to save extra cycles
		for(int k=0;k<len && flag;k++)
		{
			flag=false;
		for(int i=0;i<len-k;i++)
		{
			if(arr1[i]>arr1[i+1])
			{
				flag=true;
				temp=arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
			
		}
		if(flag)
			display(arr1);
		
		}
		
		
	}
	

	public static void display(int arr2[]){
		int len=arr2.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[]= { 2,11,4,13,15,6,7,10,3};
		int key= 6;
		
		bubbleSrt(arr);
	
	}

}
