
package Matrix;


/*
 * In a matrix of characters, find an string. 
String can be in any way (all 8 neighbors to be considered), 
like find Microsoft in below matrix.


A-C-P-R-C

X-S-O-P-C

V-O-V-N-I

W-G-F-M-N

Q-A-T-I-T


String Microsoft is present in the matrix above ?

 */



/*
 * 
 * use hashmap technique

Algo:

1.

create a temp bool array of size 26

traverse through matrix and makes entry in temp bool array (if exist then leave it)

[if you don't wast to much memory mean 26 + 26 ...then while you traversing in matrix if a character is in lower case then convert it into upper case and them make entry ]

2.

then traverse SearchString array and check for all entery

[while you traversing treat each character in upper case]

for ex.

your matrix is

A-C-P-R-C

X-S-O-P-C

V-O-V-N-I

W-G-F-M-N

Q-A-T-I-T

then temp array would be: from zero to 25 ( means 26 )

1 0 1 0 0 1 1 0 1 0 0 0 1 1 1 1 1 1 1 1 0 1 1 1 0 1

then search you string �Microsoft� in the temp bool array 


complexity analysis :

size of temp array is 26 which don�t depend on size of Matrix or no. of element So O(26)~O(1)


step one : complexity will be O(n*m) [ matrix size is n*m]

step two: complexity will be O(N) [string size is N] [searching always O(1)]


so total time complexity O(max(n*m,N)) and space complexity ~O(1)

 */
public class FindMicrosoftStringInGivenMatrix {

	
	//by hashmap ..
	//time comlexity = o(mn)
}


/*
 * Step-1
 find first character of the required string in the matrix and store the index in i and j
 Step-2
 find the neighbour of the index element and check with the next character of search string.
 if it is matched store the index element and recursively call it for new index until all the element of the search string have not been traversed..

worst time complexity:O(m*n*k*8)�. k is the size of the search string.

*/
