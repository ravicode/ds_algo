package Heap;

import java.util.ArrayDeque;
import java.util.Deque;

/*Given an array and an integer k, find the minimum for each and every
 contiguous subarray of size k. I told that I know the approach. 
 I told that I will implement it using dequeue. So he asked me to implement 
 dequeue class with push_back, push_front, pop_back, pop_front. */

//sliding window problem
//1)  by using heap               nlogk 
// create heap  logk
// everytime print topmost and replace it with last element
// replace last element with next element from window ....
// heapify again   logk

//so,we do it for n times, hence nlogk

/*

 2. by creating BST
 for(int i=k;i<arr.length;i++)
 {
 if(i<k)
 createBST(arr[i]);  (klogk)
 findMin(); //left most node   (k)
 insertInHeap(arr[i]);  (n-k)log(k)//check which child is max , remove that maximum child
 }

 so total tc= k logk + k + nlogk -klogk=   nlogk 
 space=  o(n)


 3. by Deque 
 t.c=  o(n)
 
 4. 1) brute force(naive) solution-     o(nw) // w=window size, n =number of elements
 */
public class MinimumSumInSlidingWindow {

	static void loopMethod(int arr[]) {
		int k = 3;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= arr.length - k; i++) {
			// max = arr[i];
			min = Integer.MAX_VALUE;
			for (int j = i; j < i + k; j++) {
				if (arr[j] < min)
					min = arr[j];

			}

			System.out.println(min);

			// o(n^2) // brute force
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		//loopMethod(arr); // o(n2)
		System.out.println("\n\n\n");

		dequeMethod(arr); // o(n)
	}

	static void dequeMethod(int arr[]) {
		Deque<Integer> a = new ArrayDeque<Integer>();
		int k = 3;
		int min1 = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			min1 = arr[i];
			if (i != 2)
				a.addLast(arr[i]);

			if (i == 2) {
				if (min1 > a.peekFirst())
					min1 = a.peekFirst();
				if (min1 > a.peekLast())
					min1 = a.peekLast();

				a.addLast(arr[i]);
			}

		}
		System.out.println(min1);

		for (int i = 1; i <= arr.length - k; i++) {
			a.pollFirst();

			min1 = arr[i + 2];
			if (min1 > a.peekFirst())
				min1 = a.peekFirst();

			if (min1 > a.peekLast())
				min1 = a.peekLast();

			// System.out.println(arr[i]);
			a.addLast(arr[i + 2]);
			// System.out.println("add="+arr[i+2]);
			System.out.println(min1);
		}

	}

}
