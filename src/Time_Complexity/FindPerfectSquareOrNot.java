package Time_Complexity;


/*
 Question:- Given a number N. find is it perfect square or not. cannot use any library functions.

 */


/*
 * 
 * Solution:- 
 * 
 * If n is a perfect square , then there is a much simple method.
subtract n from consecutive odd numbers like 1,3,5 ...... until n is greater than equal to 0. The number of subtraction operation is square root of n.
for example let say n=16.
then, 16-1=15,
15-3=12,
12-5=7,
7-7=0,
so there we have done subtraction 4 times. Hence square root of 16 is 4.
 */

public class FindPerfectSquareOrNot {

	public static void main(String[] args) {
int num=16;
		
		int i=0;
		while(num>0)
		{
			System.out.println(num);
			num=num-(2*i+1);
			i++;
			
		}
		System.out.println(num);
		if(num==0)
			System.out.println("this is pefect square="+i);
		else
			System.out.println("this is no a perfect square");
			
	}
	
}
