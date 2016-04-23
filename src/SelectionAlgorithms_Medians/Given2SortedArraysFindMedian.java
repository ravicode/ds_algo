package SelectionAlgorithms_Medians;

//3 ways:-

/* a)  copy both arrays in 3rd array (m+n)  , and sort by quicksort and median is middle element.  
 TC= o((m+n)log(m+n))
 SC= o(m+n)

 b) merge by using merge subroutine og merge sort in o(m+n) and find middle element
 TC=o(m+n)
 SC=o(m+n)
 http://www.geeksforgeeks.org/median-of-two-sorted-arrays/

 c) below procedure
 TC=o(log(min(m,n))
 SC=no extra space 

 */
//Given 2 sorted arrays, find the median element. (without extra space)

//find median of these 2 given arrays

/*ar1[] = {1, 12, 15, 26, 38}
 ar2[] = {2, 13, 17, 30, 45}
 For above two arrays m1 = 15 and m2 = 17

 For the above ar1[] and ar2[], m1 is smaller than m2. 
 So median is present in one of the following two subarrays.

 [15, 26, 38] and [2, 13, 17]
 Let us repeat the process for above two subarrays: 

 m1 = 26 m2 = 13.
 m1 is greater than m2. So the subarrays become

 [15, 26] and [13, 17]
 Now size is 2, so median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
 = (max(15,13) + min(26, 17))/2 
 = (15 + 17)/2
 = 16*/
//o(logn)
//solve by divide and conqueur

/* other way :-
 * 
 * You are given two sorted arrays and you have to print the median 
obtained after 
merging them in log(n) time complexity.
(http://www.geeksforgeeks.org/median-of-two-sorted-arrays/)
*/

// algo- 
// 1. max heap contains minimum elemtns
// min heap conatin max elements
// 2.  if total numbe rof elemtns are even then max heap and  min heap contain equal elemts
// if total numbe rof elements is odd, then max heap contain 1 more element then min heap

// 3.  give 1 -1 elemts from both the arrays to max and mean heap
// 4. take anothe set of elemtns fom each aray , compare with max elemtn of max heap , the smallest among the new set 
// of entries , if it is more then put it in min heap  and put eplaced and new one and new one is mi heap
//5.  so, by doning this all  minimum elemtns from both arrays will come in max heap  and all largest elemtns will
// come in min  heap

// 6.now take average of min and max heap oot elemtns , thats the median.
 

public class Given2SortedArraysFindMedian {

	static int findMedian(int ar1[], int l1, int r1, int ar2[], int l2, int r2) {

		if ((r1 == l1 + 1) && (r2 == l2 + 1)) {
			int mid = (Math.max(ar1[l1], ar2[l2]) + Math.min(ar1[r1], ar2[r2])) / 2;
			return mid;
		}

		int mid1 = (l1 + r1) / 2;
		int med1 = ar1[mid1];

		int mid2 = (l2 + r2) / 2;
		int med2 = ar2[mid2];

		if (med1 == med2)
			return med2;

		if (med1 < med2)
			return findMedian(ar1, mid1, r1, ar2, l2, mid2);
		else
			return findMedian(ar1, l1, mid1, ar2, mid2, r2);

		// return 1;
	}

	public static void main(String[] args) {

		int ar1[] = { 1, 12, 15, 26, 38 };
		int ar2[] = { 2, 13, 17, 30, 45 };

		int p = findMedian(ar1, 0, ar1.length - 1, ar2, 0, ar2.length - 1);

		System.out.println(p);

	}

}
