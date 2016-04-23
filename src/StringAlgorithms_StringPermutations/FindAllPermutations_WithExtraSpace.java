package StringAlgorithms_StringPermutations;

import java.util.HashMap;
import java.util.Map;

/*Given a string. Print all permutations of it.
 Discussion on time complexity and optimization.*/

public class FindAllPermutations_WithExtraSpace {
	// static Map<String,String>  mp=new HashMap<String,String>();  //to print non-duplicate permutations of string
	static void findPerm(char ch[], char branch[], int len, int level,
			boolean[] visited) {
		if (level >= len - 1) {  //level - depth of recursion
			System.out.println(branch);
			//mp.put(new String(branch),new String(branch));
			return;
		}

		for (int i = 0; i < len; i++) {
			if (!visited[i]) {
				visited[i]= true;
				branch[++level] = ch[i];
				findPerm(ch, branch, len, level, visited);
				level--;
				visited[i] = false;
			}
		}

	}

	public static void main(String[] args) {

		String str = "hello";
		char ch[] = str.toCharArray();
		int len = str.length();

		char branch[] = new char[len];
		int top = -1;

		boolean [] visited = new boolean[len];
		for (int i = 0; i < len; i++)
			visited[i] = false;

		findPerm(ch, branch, len, top, visited);
		
		
	/*	for(Map.Entry<String, String> m:mp.entrySet())
		{
			System.out.println(m.getKey().toString());
		}*/
	}

}
