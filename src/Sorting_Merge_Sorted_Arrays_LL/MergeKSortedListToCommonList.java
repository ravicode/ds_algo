package Sorting_Merge_Sorted_Arrays_LL;

import LinkedList.Link;
import LinkedList.LinkedListInsDel;

/*Merge N sorted lists to a single sorted list but comparisons should be minimum*/

///very very important

//compexity= M log (M) (where M is the total size of the lists).

//1. Create an output array of size n*k.
//2. Create a min heap of size k and insert 1st element in all the arrays into a the heap
//3. Repeat following steps n*k times.
//     a) Get minimum element from heap (minimum is always at root) and store 
//     it in output array.
//     b) Replace heap root with next element from the array from which the 
//     element is extracted. If the array doesn�t have any more elements, 
//     then replace root with infinite. After replacing the root, heapify the tree.


// same strategy to merge k sorted array can be applied here.

// TC=  o(nklogk)
//SC = o(nk)
public class MergeKSortedListToCommonList {

	
}
