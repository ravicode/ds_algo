package Basics_Java_Classes_Syntax;






import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerBigIntege {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        BigInteger a1=in.nextBigInteger();
        BigInteger a2=in.nextBigInteger();
        BigInteger s1=a1.add(a2);
        BigInteger p1=a1.multiply(a2);
        System.out.println(s1);
         System.out.println(p1);
    }
}