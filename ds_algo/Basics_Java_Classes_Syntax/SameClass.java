package Basics_Java_Classes_Syntax;


public class SameClass {
	
	
//	public static void func(ArithmeticException s)
//	{
//		System.out.println("String4");
//	} 
	
	public static void func(Object s)
	{
		System.out.println("String1");
	}

	public static void func(String s)
	{
		System.out.println("String3");
	}
	
	public static void func(String[] s)
	{
		System.out.println("String2");
	}

	public static void func(int s)
	{
		System.out.println("int");
	}
	
//	public static void func(Integer s)
//	{
//		System.out.println("Integer");
//	}
//	
	
//	public static void func(Exception s)
//	{
//		System.out.println("String3");
//	}
	

	
	public static void main(String[] args) {		
		func("r");
		func(new Integer(2));
	}
}
