package Basics_Java_Classes_Syntax;

public class interToBinary {
	
	public static void main(String[] args) {
		
		int number=15;
	
	
	//first way       
    //decimal to binary
    String binaryString = Integer.toBinaryString(number);
    System.out.println("decimal to binary: " + binaryString);
   
    //decimal to octal
    String octalString = Integer.toOctalString(number);
    System.out.println("decimal to octal: " + octalString);
   
    //decimal to hexadecimal
    String hexString = Integer.toHexString(number);
    System.out.println("decimal to hexadecimal: " + hexString);


   
//second way
 int binaryString1 = Integer.parseInt(binaryString,2);
    System.out.println("decimal to binary using Integer.toString: " + binaryString1);
   
    //decimal to octal
    octalString = Integer.toString(number,8);
    System.out.println("decimal to octal using Integer.toString: " + octalString);
   
    //decimal to hexadecimal
    hexString = Integer.toString(number,16);
    System.out.println("decimal to hexadecimal using Integer.toString: " + hexString);

}
}