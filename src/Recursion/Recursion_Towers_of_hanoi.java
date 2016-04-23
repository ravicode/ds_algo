package Recursion;


/*
 * A modification of Towers of Hanoi problem: Consider 3 towers A(source), B(auxiliary), C(destination) and n discs. All usual constraints of the original problem hold true, but a new constraint is added: No disc(s) can be moved directly from A to C or from C to A, B has to be used in between.

Solution: For n discs and towers A,B,C as source, auxiliary and destination respectively, consider the following function:

Move(n discs, A,B,C)
{

    If(n==1) print(nth disc, A->B->C);

    Else
    {

        Move(n-1 discs, A,B,C);

        print(nth disc, A->B);

        Move(n-1 discs, C,B,A);

        print(nth disc, B->C);

        Move(n-1 discs, A,B,C);

    }
}
It will take O(3^n) time instead O(2^n) as in the normal Towers of Hanoi problem.

The interviewer seemed quite impressed with the solution.
 */

public class Recursion_Towers_of_hanoi {

	public static void main(String[] args) {
		towers_of_hanoi(4,'1','3','2');
	}
	
	
	static void towers_of_hanoi(int n, char from,char top,char aux)
	{
		if(n==1)
		{
			System.out.println(from + "->"+top);
			return;
		}
		
		towers_of_hanoi(n-1, from,aux,top);
		System.out.println(from + "->"+top);
		towers_of_hanoi(n-1,aux,top,from);
		
	}
}
