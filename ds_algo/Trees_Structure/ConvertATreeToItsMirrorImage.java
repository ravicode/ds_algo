package Trees_Structure;


import Trees.Node;
import Trees.TreeCreate;

public class ConvertATreeToItsMirrorImage {
	
	Node convertTreeIntoMirrorImage(Node root)
	{
		if(root!=null)
		{
		
		convertTreeIntoMirrorImage(root.getLeft());
		convertTreeIntoMirrorImage(root.getRight());
		
		Node temp=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		
		
	}
	return root;	
	}
	
	public static void main(String[] args) {
		
		TreeCreate tcOriginal=TreeCreate.treeCreate();
		
		TreeCreate tc=TreeCreate.treeCreate();
		ConvertATreeToItsMirrorImage convert=new ConvertATreeToItsMirrorImage();
		tcOriginal.inOrderWithoutRecursion(tc.root);
		Node d=convert.convertTreeIntoMirrorImage(tc.root);
		
		System.out.println();
		tc.inOrderWithoutRecursion(d);
		//tc.inOrderWithoutRecursion(tc.root);
		
		CheckMirrorImageOfATreeOrNot cIMge=new CheckMirrorImageOfATreeOrNot();
		System.out.println();
		System.out.println("Mirror image="+cIMge.MirrorImageOrNotIdentical(tcOriginal.root,d));
	}

}
