package Greedy_Algorithms;

import java.util.Arrays;

/*
 Given, the starting and ending time of different meetings, 
 what is the minimum number of conference rooms that will be enough to accommodate
 all of them.

 He asked me to code it.E.g, : 

 I/p : Meeting I � 8:30 � 12:50

 Meeting II � 10:15 � 11:30

 Meeting III � 11:45 � 1:30

 */

/*
 * /* Another Question:-  
Given n appointments with the start time, end time and a boolean variable hasConfilct, 
we have to set the boolean variable hasConflict of those appointments
 that conflict with the other appointments. 

Example:  Appointment1: (2:00-3:00)
	  Appointment2: (2:30-3:30)
	  Appointment3: (4:00-6:00) I have to set the the hasConflict of Appointment 1 and 2 as true.
Initially, I did it in O(n^2). But then he asked me to optimize the solution. 
After some discussion, I was able to solve it in O(nlogn).

*/
 

public class MeetingSchedulingProblem_NumberOFConflictingAppointments {
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
		int start[] = { 830, 1015, 1145 };
		int end[] = { 1250, 1130, 1330 };

		// System.out.println(Arrays.toString(end));
		// System.out.println("-----------");
		quickSort(end, start, 0, end.length - 1);

		System.out.println(Arrays.toString(start));
		System.out.println(Arrays.toString(end));

		overlapIntervals(end, start);

	}

	static void overlapIntervals(int end[], int start[]) {
		int e = end.length;
		
		int c = 1;
		int j=0;

		for (int i = 0; i < (e - 1); i++) {
			if (end[j] <= start[i + 1])

			{
j=i;
			} else {
				c++;

			}

		}

		System.out.println("Number of meeting rooms required=" + c);
		
		System.out.println("Number of conflicting appointments=" + c);
	}

}
