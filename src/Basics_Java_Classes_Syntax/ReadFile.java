package Basics_Java_Classes_Syntax;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadFile {

	
	public static void main(String[] args) {
		try {
FileInputStream in=new FileInputStream(("C:\\Users\\Ravi\\web_workspace\\codes1\\src\\file.txt"));
		
		
			int a=in.read();
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
