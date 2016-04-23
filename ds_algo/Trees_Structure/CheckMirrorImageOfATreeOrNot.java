package Trees_Structure;


import Trees.Node;
import Trees.TreeCreate;

//check two tress whether they are mirror image of each other or not ??


// same tree cannot be mirror image of each other if data comparision is included.

public class CheckMirrorImageOfATreeOrNot {

	boolean MirrorImageOrNotIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		if (root1.getKey() != root2.getKey()) {

			return false;
		}

		return (MirrorImageOrNotIdentical(root1.getLeft(), root2.getRight()) && MirrorImageOrNotIdentical(
				root1.getRight(), root2.getLeft()));

	}

	public static void main(String[] args) {

		TreeCreate tc = TreeCreate.treeCreate();
		CheckMirrorImageOfATreeOrNot img = new CheckMirrorImageOfATreeOrNot();

		System.out.println(img.MirrorImageOrNotIdentical(tc.root, tc.root));
	}

}
