package Greedy_Algorithms;


import java.util.Arrays;

//movie start time = { 0,3,5,1,8,5}
//movie end time=    { 6,4,7,2,9,9}  

// do it in o(nlogn)    1.sort in nlogn 2. scan to find number of intervals in n 
//so nlogn + n ~  nlogn

//Question -  find max. number of movies to watch

//Question- int movieStartTime[]={10,12,14,9,16}   
//
//int movieEndTime[]={11,13,17,15,18}
//
//a person needs to see movies between these time slots, find maximum 
//number of movies he/she can watch;


//Algo 

/*The greedy choice is to always pick the next activity whose finish time is least among the 
 * remaining activities and the start time is more than or equal to the finish time of
previously selected activity. We can sort the activities according to their finishing time 
so that we always consider the next activity as minimum finishing time activity. 

1) Sort the activities according to their finishing time
2) Select the first activity from the sorted array and print it.
3) Do following for remaining activities in the sorted array.
��.a) If the start time of this activity is greater than the finish time of previously 
selected activity then select this activity and print it.

*/
public class MovieMarathon {

	public static void main(String[] args) {
		int movieStart[] = { 0, 3, 5, 1, 8, 5 };

		int movieEnd[] = { 6, 4, 7, 2, 9, 9 };

		for (int i = 0; i < movieEnd.length; i++) {
			int temp = 0;

			for (int j = i + 1; j < movieEnd.length; j++) {
				if (movieEnd[i] > movieEnd[j]) {
					temp = movieEnd[i];
					movieEnd[i] = movieEnd[j];
					movieEnd[j] = temp;

					temp = movieStart[i];
					movieStart[i] = movieStart[j];
					movieStart[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(movieStart));
		System.out.println(Arrays.toString(movieEnd));

		int counter = 1;
		/*
		 * for(int i=0;i<movieEnd.length;i++) { for(int
		 * j=i+1;j<movieStart.length;j++) { if(movieEnd[i]<=movieStart[j]) {
		 * counter++;
		 * 
		 * break; }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		int j = 0;
		for (int i = 0; i < movieEnd.length - 1; i++) {

			if (movieEnd[j] <= movieStart[i + 1]) {
				System.out.println(j);
				j = i + 1;
				counter++;

			}
		}
		System.out.println(j);
		System.out.println("Number of movies to see =" + counter);
	}
}
