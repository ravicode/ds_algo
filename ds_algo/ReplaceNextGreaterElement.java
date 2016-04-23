

//Given an Array, replace each element in the Array with its Next Element(To its RHS)
//which is Larger than it. If no such element exists, then no need to replace. 
//Ex: 
//i/p: {2,12,8,6,5,1,2,10,3,2} 

public class ReplaceNextGreaterElement {

	public static void main(String[] args) {
		int a[] = { 2, 12, 8, 6, 5, 1, 2, 10, 3, 2 };
		greaterElement(a);
		display(a);
	}

	public static void display(int a[]) {
		for (int a1 : a) {
			System.out.print(a1 + ",");
		}
	}

	public static void greaterElement(int a[]) {
		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
			
				if (a[i] < a[i + 1]) {
					a[i] = a[i + 1];
				
			}
		}
	}
}
