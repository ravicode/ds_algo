package Dynamic_Programming_OptimalStrategy;
//http://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/

/*Problem statement: Consider a row of n coins of values v1 . . . vn, 
where n is even. We play a game against an opponent by alternating turns. 
In each turn, a player selects either the first or last coin from the row, 
removes it from the row permanently, and receives the value of the coin. 
Determine the maximum possible amount of money 
we can definitely win if we move first.
*/

/*Note: The opponent is as clever as the user.

Let us understand the problem with few examples:

    1. 5, 3, 7, 10 : The user collects maximum value as 15(10 + 5)

    2. 8, 15, 3, 7 : The user collects maximum value as 22(7 + 15)

Does choosing the best at each move give an optimal solution?

No. In the second example, this is how the game can finish:

1.
��.User chooses 8.
��.Opponent chooses 15.
��.User chooses 7.
��.Opponent chooses 3.
Total value collected by user is 15(8 + 7)

2.
��.User chooses 7.
��.Opponent chooses 8.
��.User chooses 15.
��.Opponent chooses 3.
Total value collected by user is 22(7 + 15)

So if the user follows the second game state, maximum value can be collected although the first move is not the best.

There are two choices:
1. The user chooses the ith coin with value Vi: The opponent either chooses (i+1)th coin or jth coin. The opponent intends to choose the coin which leaves the user with minimum value.
i.e. The user can collect the value Vi + min(F(i+2, j), F(i+1, j-1) )

. The user chooses the jth coin with value Vj: The opponent either chooses ith coin or (j-1)th coin. The opponent intends to choose the coin which leaves the user with minimum value.
i.e. The user can collect the value Vj + min(F(i+1, j-1), F(i, j-2) )

F(i, j)  represents the maximum value the user can collect from 
         i'th coin to j'th coin.

    F(i, j)  = Max(Vi + min(F(i+2, j), F(i+1, j-1) ), 
                   Vj + min(F(i+1, j-1), F(i, j-2) )) 
Base Cases
    F(i, j)  = Vi           If j == i
    F(i, j)  = max(Vi, Vj)  If j == i+1
    
    
    
    Why Dynamic Programming?
The above relation exhibits overlapping sub-problems. In the above relation, F(i+1, j-1) is calculated twice.
*/

public class WinByMaximumValue {
	
	
	static int optimalStrategyOfGame(int arr[], int n) {   
		// Create a table to store solutions of subproblems  
		int table[][]=new int[n][n];
		int gap, i, j, x, y, z;      
		// Fill table using above recursive formula. Note that the table   
		// is filled in diagonal fashion (similar to http://goo.gl/PQqoS),  
		// from diagonal elements to table[0][n-1] which is the result.    
		for (gap = 0; gap < n; ++gap)     {        
			for (i = 0, j = gap; j < n; ++i, ++j)    
			{            
				// Here x is value of F(i+2, j), y is F(i+1, j-1) and        
				// z is F(i, j-2) in above recursive formula          
				x = ((i+2) <= j) ? table[i+2][j] : 0;         
				y = ((i+1) <= (j-1)) ? table[i+1][j-1] : 0;          
				z = (i <= (j-2))? table[i][j-2]: 0;               
				table[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));    
				}     }       
		return table[0][n-1]; }  // Driver program to test above function 
	
	
	
	public static void main(String[] args) {{   
		
		int arr1[] = {8, 15, 3, 7};      //choose 7 first
		int n = arr1.length;     
		System.out.println(optimalStrategyOfGame(arr1, n));    
		
		
		
		int arr2[] = {2, 2, 2, 2};   
		n = arr2.length; 
		System.out.println(optimalStrategyOfGame(arr2, n));   
		
		
		int arr3[] = {20, 30, 2, 2, 2, 10};       //choose 10 first
		n = arr3.length; 
		System.out.println(optimalStrategyOfGame(arr3, n));   
			}
		

		

	}

}
