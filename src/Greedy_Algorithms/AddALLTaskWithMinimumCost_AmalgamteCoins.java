package Greedy_Algorithms;
/*
Given n ropes of different length, combine them into a single rope,
such that total cost is minimum.
You can tie two ropes at a time,and cost of tying is sum of length of ropes.
*/
/*
 * Let there be n ropes of lengths stored in an array len[0..n-1]
1) Create a min heap and insert all lengths into the min heap.
2) Do following while number of elements in min heap is not one.
……a) Extract the minimum and second minimum from min heap
……b) Add the above two extracted values and insert the added value to the min-heap.
3) Return the value of only left item in min heap.
 */

/*
 * 
 * Question:-  We have n gold coins. We need to amalgamate all the n coins to create one 
single coin, we can merge two coins at once. The cost of merging two coins 
is equal to the value of those coins. How do we ensure that the cost of
merging n coins in minimum.
Ex: 5 ,8 , 4, 3, 9, 6*/
//use min heap
 
public class AddALLTaskWithMinimumCost_AmalgamteCoins {

}
