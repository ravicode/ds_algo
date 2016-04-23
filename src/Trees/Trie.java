package Trees;



class Nodes {
	int value;
	Nodes child[];

	Nodes() {
		value = 0;
		child = new Nodes[26];

		for (int i = 0; i < 26; i++) {
			child[i] = null;
		}
	}
}

public class Trie {

	String str = "abcdefghijklmnopqrstuvwxyz";
	Nodes root = null;
	int count;

	public void insert(Nodes r, char key[]) {
		if (root == null) {
			root = new Nodes();
			count = 0;
		}

		else {

			int len = key.length;
			int index;
			Nodes current = r;
			count++;

			for (int level = 0; level < len; level++) {
				index = str.indexOf(key[level]);
				if (current.child[index] == null) {
					current.child[index] = new Nodes();
				}

				current = current.child[index];
			}
			current.value = count;
		}

	}

	public int search(Nodes r, char key[]) {

		int len = key.length;
		int index;
		Nodes current = r;
		// count++;

		for (int level = 0; level < len; level++) {
			index = str.indexOf(key[level]);
			if (current.child[index] == null) {
				return 0;
			}

			current = current.child[index];
		}

		if (current != null && current.value > 0)
			return 1;

		else
			return 0;
	}

	void print(Nodes current, int index) {

		if (current.child[index] == null)
			return;

		for (int i = 0; i < 26; i++) {

			if (current.child[i] != null) 
			{

				System.out.println(str.charAt(i));

				current = current.child[i];

				i = -1;

			}

		}

	}

	void autoComplete(char ch[], Nodes current) {
		int index;
		if (current == null) {

			return;
		}

		index = str.indexOf(ch[0]);

		for (int i = 0; i < 26; i++) {
			if (current.child[i] != null) {

				if (index == i)
					break;
				current = current.child[i];
				i = -1;

			}

		}

		print(current, index);

	}
	public static void main(String[] args) {
		// Input keys (use only 'a' through 'z' and lower case)
		String keys[] = { "the", "a", "there", "answer", "any", "by", "bye","their" };
		
		Trie t = new Trie();
		String output[] = { "Not present in trie", "Present in trie" };

		
		t.insert(null, "".toCharArray());
		for (int i = 0; i < keys.length; i++) {
			t.insert(t.root, keys[i].toCharArray());
		}

		// Search for different keys
		System.out.println("the="
				+ output[t.search(t.root, "the".toCharArray())]);
		System.out.println("these="
				+ output[t.search(t.root, "these".toCharArray())]);
		System.out.println("their="
				+ output[t.search(t.root, "their".toCharArray())]);
		System.out.println("thaw="
				+ output[t.search(t.root, "thaw".toCharArray())]);

		/*
		 * printf("%s --- %s\n", "these", output[search(&trie, "these")] );
		 * printf("%s --- %s\n", "their", output[search(&trie, "their")] );
		 * printf("%s --- %s\n", "thaw", output[search(&trie, "thaw")] );
		 */

	}
}
