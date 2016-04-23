package Trees_CheckAgain;

/*Check if a binary tree is subtree of another binary treeGiven two
 *  binary trees, check if the first tree is subtree of the second one.
 *   A subtree of a tree T is a tree S consisting of a node in T and all 
 *   of its descendants in T. The subtree corresponding to the root node
 *    is the entire tree; the subtree corresponding to any other node 
 *    is called a proper subtree.

For example, in the following case, tree S is a subtree of tree T.

        Tree S
          10  
        /    \ 
      4       6
       \
        30


        Tree T
              26
            /   \
          10     3
        /    \     \
      4       6      3
       \
        30
Solution: Traverse the tree T in preorder fashion. For every
 visited node in the traversal, see if the subtree rooted with 
 this node is identical to S. 

*/
public class CheckIfASumTreeIsATRee {

}
