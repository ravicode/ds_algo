package Trees;

/*Given a binary tree to be passed through a network. 
How to pass this tree in minimum space.
It was an open ended question and he asked me for many solutions and 
finally asked me to write the code.*/

/*
Assume we have a binary tree below:

    _30_ 
   /    \    
  10    20
 /     /  \ 
50    45  35Using pre-order traversal, the algorithm should write the following to a file:

30 10 50 # # # 20 45 # # 35 # #The pre-order traversal code below does all the job to serialize a binary tree, believe it or not!

void writeBinaryTree(BinaryTree *p, ostream &out) {
  if (!p) {
    out << "# ";
  } else {
    out << p->data << " ";
    writeBinaryTree(p->left, out);
    writeBinaryTree(p->right, out);
  }
}
123456789 void writeBinaryTree(BinaryTree *p, ostream &out) {  if (!p) {    out << "# ";  } else {    out << p->data << " ";    writeBinaryTree(p->left, out);    writeBinaryTree(p->right, out);  }} 

Deserializing a Binary Tree:

Reading the binary tree from the file is similar. We read tokens one at a time using pre-order traversal. If the token is a sentinel, we ignore it. If the token is a number, we insert it to the current node, and traverse to its left child, then its right child.

void readBinaryTree(BinaryTree *&p, ifstream &fin) {
  int token;
  bool isNumber;
  if (!readNextToken(token, fin, isNumber)) 
    return;
  if (isNumber) {
    p = new BinaryTree(token);
    readBinaryTree(p->left, fin);
    readBinaryTree(p->right, fin);
  }
}

Alternative Solution:
We may also use level-order traversal to write/read binary tree. Level-order traversal works because like pre-order traversal, we see the parent node before its child nodes. The implementation of it using level-order traversal is left as an exercise to the reader. Read my post: Printing a Binary Tree in Level Order on how to traverse a binary tree in level-order.

Further Thoughts:
There is an obvious shortcoming in this method, that is: a sentinel is required to represent empty nodes. What if we need to store strings that can contain any characters (including the sentinel) in the binary tree? Could you come up with a solution to overcome this shortcoming?

Please note that this is not the only way to serialize a binary tree, and also probably not the most compact way. But this is good enough for a standard interview question. 

*/
public class PassTreeThroughNetwork {

}
