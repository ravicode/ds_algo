package Basics_Java_Classes_Syntax;

/*
 * static block is used for any technology to initialize static data member in dynamic way,or
 *  we can say for the dynamic initialization of static data member static block is being used..
 *  Because for non static data member initialization we have constructor but we do not have any
 *   place where we can dynamically initialize static data member
 */
public class Test_static {

    static{
        System.out.println("Static-1");
    }
Test_static()
{
	System.out.println("constructor body 3");
}
    {
        System.out.println("Non-static block-2");
    }

    public static void main(String[] args) {
        Test_static t = new Test_static();
       // Test t2 = new Test();
    }
}