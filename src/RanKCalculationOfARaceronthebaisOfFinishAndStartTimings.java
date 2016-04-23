


/*
 * Question : -
 * You have the start time, end time and index number of racers in a race. 
 * You need to tell the rank of each racer. The rank is calculated as following: 
 * if racer B starts after racer A but finishes before racer A,
 *  then the rank of racer A increases by 1.
 *  
Eg : - 
 
Index 	Start Time 	End time
0		100		170
1		80		150
2		120		165
3		110		145

Output
Index		Rank
2		0
3		0
1		1
0		2 
I did it in O(n^2), but I think there should be an O(nlogn) algorithm for this.

sort according to start time and start from  backwards of array 

if(startB[i+1] > startA[i]   &&  endB[i+1] < endA[i] )
{
racerARank++;
}

 */
public class RanKCalculationOfARaceronthebaisOfFinishAndStartTimings {
/* 
 * 1. quicksort with two different arrays with start time
   2.
   if(startB[i+1] > startA[i]   &&  endB[i+1] < endA[i] )
{
racerARank++;
}

3. 


*/
	
	
	
	public static void main(String[] args) {
 
		//o(n2) algorithm
	}
}
