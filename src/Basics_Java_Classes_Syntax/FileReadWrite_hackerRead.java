package Basics_Java_Classes_Syntax;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite_hackerRead {

	public static void main(String[] args) {
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(
					"C:\\Users\\Ravi\\workspace\\Home\\src\\file1.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String s = bf.readLine();
			while (s != null) {
				System.out.println(s);
				s = bf.readLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		String content = "This is the content to write into fil1e";

		File file = new File("C:\\Users\\Ravi\\workspace\\Home\\src\\file2.txt");
		if (file.exists() || !file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			BufferedWriter bf1=null;
			
				try {
					bf1 = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
					bf1.write(content);
					bf1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
	}

}
