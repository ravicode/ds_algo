package Searching;
//an array of 1�N no is given to you, but one no is missing, how will you find that.

/*
 * /*
 * )There are two arrays. One contains n digits and the other n-1 digits. How to find the missing digit in the second array?
I asked the interviewer if I can assume that the elements are unique. He said yes. 
Then I solved it using XOR method. He asked what if the nos are negative or fration. 
I said that as two negative numbers or 2 decimal numbers will be stored in the same way
 in memory 
therefore XOR will work for that cases as well.
 */

//by sorting
//by xor
//by hashmap
//by array of integers
public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		findDuplicateNumber(10);
	}
	
	
	public static void findDuplicateNumber(int num)
	{
		int sum=num*(num+1)/2;
		
		int sum1=1+2+3+5+6+7+8+9+10;
		
		int num1=sum-sum1;   //it gives 4
		
		System.out.println(num1);
		
		
		/* 
		 *     10!/ 1*2*3*5*6*7*8*9*10   ( it also gives 4) 
		 * 
		 */
	}

}
