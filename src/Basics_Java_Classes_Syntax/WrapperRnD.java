package Basics_Java_Classes_Syntax;


public class WrapperRnD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a;
		Integer i1=128;
		Integer i2=128;
		StringBuffer b=new StringBuffer("1bc");
		StringBuffer c=new StringBuffer("1bc");
		
		if(b.equals(c))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(i1.equals(i2))
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
		if(i1.compareTo(i2)==0)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		if(i1==(i2))
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
