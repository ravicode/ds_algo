package Stack;
/*
Push ,pop and min operations in O(1)
http://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/
He asked me to do middle operation also and then he asked me to code 2nd problem.
http://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/

*/


/*
 * 
 * Solution: Use two stacks: one to store actual stack elements and 
 * other as an auxiliary stack to store minimum values.
 *  The idea is to do push() and pop() operations in such a way that the top of auxiliary 
 *  stack is always the minimum. Let us see how push() and pop() operations work.

Push(int x) // inserts an element x to Special Stack 
1) push x to the first stack (the stack with actual elements)
2) compare x with the top element of the second stack (the auxiliary stack). Let the top element be y.
…..a) If x is smaller than y then push x to the auxiliary stack.
…..b) If x is greater than y then push y to the auxiliary stack.

int Pop() // removes an element from Special Stack and return the removed element 
1) pop the top element from the auxiliary stack.
2) pop the top element from the actual stack and return it.

The step 1 is necessary to make sure that the auxiliary stack is also updated for future operations.

int getMin() // returns the minimum element from Special Stack 
1) Return the top element of auxiliary stack.

We can see that all above operations are O(1).
 * 
 * 
 */
public class PushPopAndMinino1 {

}
