package Basics_Java_Classes_Syntax;



//said right

//done
public class VariableBindingMethodBindingJavaInheritanceQuestion {

	
	
	public static void main(String[] args) {
		A obj=new B();
		System.out.println(obj.x);
		obj.print();
	}
	
}
	
	class A
	{
		int x=1;
		
		void print()
		{
			System.out.println("parent");
		}
	}
	
	class B extends A
	{
		int x=2;
		
		void print()
		{
			System.out.println("child");
		}
	}
