package Greedy_Algorithms;

import java.util.Arrays;

/*2.) Given few sets of intervals print out the the entire intervals without 
 * overlapping, 
 if they overlap then combine them into one.
 Sample test case: 
 
 //http://www.geeksforgeeks.org/merging-intervals/

 Input :    (5,7) (1 , 6) (2 ,4) (10 ,14) (8,9) 
 Output :   (1,7) (8,9) (10,14) */


/*Another Solution -
 * * An efficient approach is to first sort the intervals according to starting time. Once we have the sorted intervals, we can combine all intervals in a linear traversal. The idea is, in sorted array of intervals, if interval[i] doesn’t overlap with interval[i-1], then interval[i+1] cannot overlap with interval[i-1] because starting time of interval[i+1] must be greater than or equal to interval[i]. Following is the detailed step by step algorithm.

1. Sort the intervals based on increasing order of 
    starting time.
2. Push the first interval on to a stack.
3. For each interval do the following
   a. If the current interval does not overlap with the stack 
       top, push it.
   b. If the current interval overlaps with stack top and ending
       time of current interval is more than that of stack top, 
       update stack top with the ending  time of current interval.
4. At the end stack contains the merged intervals. 
 */


public class IntervalOverlapProblem_MergeOverlappedIntervals {
	static int partition(int end[], int start[], int left, int right) {
		int pivot = end[right];
		int i = left - 1;

		for (int j = left; j <= right; j++) {

			if (end[j] <= pivot) {
				i++;

				int t = end[j];
				end[j] = end[i];
				end[i] = t;

				t = start[j];
				start[j] = start[i];
				start[i] = t;

			}
		}

		// System.out.println(Arrays.toString(end) + " " +i);
		return i;

	}

	static void quickSort(int end[], int start[], int left, int right) {
		if (left < right) {
			int pivot = partition(end, start, left, right);
			quickSort(end, start, left, pivot - 1);
			quickSort(end, start, pivot + 1, right);

		}

	}

	public static void main(String[] args) {
		// test case 1
		int start[] = { 5, 1, 2, 10, 8 };
		int end[] = { 7, 6, 4, 14, 9 };

		// Output : (1,7) (8,9) (10,14)

		// test case 2
		/*
		 * int start[]={6,1,2,4}; int end[]={8,9,4,7}; //output 1,9
		 */

		/*
		 * //test case 3 int start[]={1,7,4,10}; int end[]={3,9,6,13}; //output
		 * [1, 4, 7, 10] [3, 6, 9, 13]
		 */
		// System.out.println(Arrays.toString(end));
		// System.out.println("-----------");
		quickSort(end, start, 0, end.length - 1);

		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));

		overlapIntervals(end, start);

	}

	static void overlapIntervals(int end[], int start[]) {
		int e = end.length;
		int s = start.length;
		int c = 0;

		for (int i = 0; i < (e - 1); i++) {
			if (end[i] >= start[i + 1])

			{
				int min = Math.min(start[i], start[i + 1]);
				int max = Math.max(end[i], end[i + 1]);
				 start[i + 1] = min;
				 end[i+1]=max;

				start[i] = end[i] = 0;

			}

			
		}
		System.out.println("--Final Overlapped Interval list--");
		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));
	}

}
