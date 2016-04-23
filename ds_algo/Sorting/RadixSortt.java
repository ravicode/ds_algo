package Sorting;

import java.util.ArrayList;
import java.util.List;

public class RadixSortt {

	public void radixSort(int arr[], int maxDigits){
		int exp = 1;//10^0;
		for(int i =0; i < maxDigits; i++){
			List<Integer> bucketList[] = new ArrayList[10];
			for(int k=0; k < 10; k++){
				bucketList[k] = new ArrayList<Integer>();
			}
			for(int j =0; j < arr.length; j++){
				int number = (arr[j]/exp)%10;
				bucketList[number].add(arr[j]);
			}
			exp *= 10;
			int index =0;
			for(int k=0; k < 10; k++){
				for(int num: bucketList[k]){
					arr[index] = num;
					index++;
				}
			}
		}

		System.out.println("Sorted numbers");
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] +", ");
		}
	}

	public static void main(String[] argv){
		int n = 5;
		int arr[] = {1,4,2,3,5,10,8};
		new RadixSortt().radixSort(arr, 2);
	}
}
