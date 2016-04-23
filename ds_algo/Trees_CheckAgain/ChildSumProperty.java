package Trees_CheckAgain;

import Trees.Node;



public class ChildSumProperty {
	
	public static void main(String[] args) {
		
	}

	
	int isSumProperty(Node node) {  
		/* left_data is left child data and right_data is for right child data*/  
		int left_data = 0,  right_data = 0;   
		/* If node is NULL or it's a leaf node then      return true */ 
		if(node == null || (node.getLeft()== null && node.getRight() == null))    
			return 1;  
		else  {   
 /* If left child is not present then 0 is used        
  * as data of left child */   
			if(node.getLeft() != null)       
				left_data = node.getLeft().getKey();    
				/* If right child is not present then 0 is used  
				 *      as data of right child */    
				if(node.getRight() != null)      
					right_data = node.getRight().getKey();    
					/* if the node and both of its children satisfy the        property return 1 else 0*/   
	if((node.getKey() == left_data + right_data) &&        
		isSumProperty(node.getLeft())!=0 &&        
							isSumProperty(node.getRight())!=0)      
return 1;     
	else     
		return 0;   } 
}
}
