package Basics_Java_Classes_Syntax;


import java.io.*;
/*format
Sample input 
3
10 2 5
12 4 4
6 2 2


Sample Output 
6
3
5
*/



import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankFormat {

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        int t = in.nextInt();;
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }*/
    Solve(1,1,1);
    }
    
    private static long Solve(int n, int a, int b)
    {
        StringBuffer r=new StringBuffer("rai");
        
        String s=r.reverse().toString();
        String s1=r.toString();
        System.out.println(s1 +" " +s);
         //Write code to solve each of the test over here
        int numOFChoc=n/a;
        int n1;
        if(numOFChoc>=b)
            {
            n1=numOFChoc-b;
int b1=numOFChoc/b;
            numOFChoc+=b1;
while(b1>b)
{
b1=b1/b;
numOFChoc+=b1;
}
            if((n1+1)%b==0)
                numOFChoc+=1;
            
        }
             return numOFChoc;
        
        
    }
    
    
}

