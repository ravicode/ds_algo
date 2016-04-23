package Basics_Java_Classes_Syntax;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
      /* try {
			System.setIn(new FileInputStream("C:\\Users\\Ravi\\web_workspace\\codes1\\src\\file.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
     
               Scanner in = new Scanner(System.in);
               int t = in.nextInt();
               for(int i = 0; i < t; i++){
               Solve(in.nextInt());
               }
           }
    
    public static void Solve(int size )
        {
    int it=0;
    boolean flag=false;
        int a5[]=new int[size];
         int a3[]=new int[size];
        
        
        for(int i=0;i<size;i++)
            {
            a5[i]=5*i;
             a3[i]=3*i;
        }
       
          for( it=0;it<size;it++)
            {
              for(int j=0;j<size;j++)
            {
           if((a5[it]+a3[j])==size)
               {
        	   flag=true;
        	if(a3[j]>0)
                {
                 
               for(int m=0;m<a3[j];m++)
                   System.out.print(5);
                
                for(int m=0;m<a5[it];m++)
                   System.out.print(3);
              
            }
               else
                   {
               for(int m=0;m<a5[it];m++)
                   System.out.print(3);
               
               for(int m=0;m<a3[j];m++)
                   System.out.print(5);
               }
               
              // break;
           }
                  
                   
           }
             // break;
        }
          if(it==size && !flag)
              System.out.print(-1);
          System.out.println();
         
    }
    }