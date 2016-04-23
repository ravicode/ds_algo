package Array;
public class ImplementArrayList {

	private Object store[];
	private int i;

	public ImplementArrayList(int count) {
		store = new Object[count];
		i = 0;
	}

	public void add(Object element) {
		// System.out.println(i);
		store[i++] = element;

	}

	public Object get(int index) {

		return store[index];
	}

	public void remove(int index) {
		store[index] = null;
		int k = 0;
		int a = 0;
		boolean nullTrue = false;
		while (k < i) {

			if (store[k] == null) {
				nullTrue = true;
				i--;
			}
			if (nullTrue) {
				store[k] = store[k + 1];
			}

			k++;

		}

	}

	public void display() {
		for (int l = 0; l < i; l++) {
			System.out.print(store[l]);
		}
	}

	public static void main(String[] args) {

		ImplementArrayList ia = new ImplementArrayList(10);
		ia.add("r");
		ia.add("a");
		ia.add("v");
		ia.add("i");

		System.out.println("******* added data *******");

		ia.display();

		ia.remove(1);

		System.out.println("\n\n******* list after removing data *******");

		ia.display();
		// System.out.println(ia.store);
		// System.out.println(ia.get(2));

	}

}
