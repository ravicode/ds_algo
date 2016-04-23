package Theory_questions;

/*
 * 1. How does stack look in function calls? Given a recursive function call, how will the stack look like?
2. When does stack (process stack) overflow? What are the remedies?
3. What are balanced BSTs.
 */

/*
 * 4. Advantages of linked list over arrays. And arrays over linked list.
5. How are vectors implemented internally in the library. 
This question revolved around dynamic implementation of arrays. 
Then discussed the amortized time of the operations using dynamic implementation of arrays.
 */

/*
 *  DHCP,DNS working protocols
 *  Ans:- http://en.wikipedia.org/wiki/Dynamic_Host_Configuration_Protocol
 *  http://en.wikipedia.org/wiki/Domain_Name_System
 */
/*
 *Three processes p1, p2, p3, p4 � each have sizes 1GB, 1.2GB, 2GB, 1GB. 
 *And each processes is executed as a time sharing fashion. Will they be executed on an operating system. 
 */

/*
 *  DNS server(full working), ARP protocol 
 *  //http://en.wikipedia.org/wiki/Address_Resolution_Protocol
 */
/*
 * What is binary search.
 */

/*
 * I have a hard disk of 100 gb.It has one and only file of 80 GB (database backup).
What happens if i delete it and it goes to recycle bin.
Follow-up questions:
Is the memory freed from the hard disk.
What happens if i move it from one drive to another.
What happens in case of permanent delete.
What happens when we format the disk.

7) What is virtual memory. 
 */

/*
 * 12) What is memory leak
13) What is the difference between instance variable and local variable
14) If i write java in command prompt from anywhere in system, will it work?If not, how to make it work.
15) Why is the class name same as filename in Java.Is there any use.
Can a file have more than two classes.What will be the name of that file?
How many class files will be generated when we compile.
16) Why is Java platform independent.
17) Is JVM platform dependant?On what factors it depends?
18) What are the best practices you have followed in your project.
 */

/*
 * Test cases for mail attachment(word doc) not being opened scenario
 */

/*
 * You had 4 gb RAM or 8 gb RAM ? how RAM size affect user perspective ?
 * (want to know i have general idea about virtual memory or not)
 * 
 */

/*
 * Process vs threads
 */
/*
 * address space of process and threads
(based upon threads share data and heap but have separate stacks )
 */
/*
 * 1. There was a question in written round that 
 * there is a global static variable �lock� initially set to 0 and there was a code segment given.

while(lock);
lock = 1;
//Critical section
lock = 0; 
Does this solve critical section problem. I answered that it will solve in uni processor system but not in multiprocessor system.
 */

/*
 * When a function is called in thread, what variables can be accessed from it.
 *  There was a long discussion on this too. I went in the wrong direction but corrected myself later. 
 *  Stack variables are copied but heap variables are same.
 */

/*
 * What is reflection? How does JVM find the right class to instantiate an object?
 * 
 * 
 */

/*
 * 2)	Why are string objects immutable in java? How are Strings structurally designed in java?

3)	When should one use merge sort and when should one use quick sort?
 */
/*
 * What do you know about Volatile keyword explain with an example code.
 */
/*
 *   a) Heavy discussion on Merge Sort, Amortized Analysis of Heap Sort � Made me solve recursion etc
 */
/*
 * What is Paging and why is it used?
 */
/*
 * �Why testing and y not developing
�Your interest (as my fav sub was os)
�What is the difference between win 8 and win 7
�What is the diff between thread and process
�When u open a new tab in browser, the new tab is a thread or process(questions related)
�Test case for bottle
�Test case for stapler
�Program to check syntax of string
 */

/*
 * �Difference between static and dynamic linking in terms of binary code.
 */

/*
 * Discussion regarding demand paging. 
 * Then the interviewer asked me to give a detailed implementation of demand paging, using object-oriented approach,
 *  considering everything from page tables to swap disk I/O to page replacement policies.
 */
/*
 * What is Synchronization? What is Mutex? Reader Writer Problem
 */

/*
 * 2. Questions regarding scheduling concepts, how cpu burst length is predicted for SJF scheduling, 
 * exponential averaging, etc.

3. The interviewer asked me to implement my own timer service in the user-space.
 Using system timer countdown was not allowed, only reading current system time was allowed.

Solution: Create a high-priority helper process P which will have some idea of flow of time(since we cannot use hardware timer) and hence will act as a sand clock for any process that requires timer service.

P will have the following operations:

t1=getSystemTime()

do dummy op(which should take very less time)

t2= getSystemTime()

(t2-t1) will be the time unit for P. Whenever any process requires a countdown of time t, it will communicate with P and request it to send a signal after time t. P will divide t by its time unit and perform dummy its operation t/(t2-t1) times and then notify the requesting process that the time period has elapsed.

The interviewer said that the solution was coarse, but still he seemed pleased with it.
 */
/*
 * Question on singleton pattern.
 */
/*
 * Comparison of BST and hashmap ( relative advantages and disadvantages ). Applications of each.
 *http://stackoverflow.com/questions/4128546/advantages-of-binary-search-trees-over-hash-tables
 *http://www.programmerinterview.com/index.php/data-structures/hash-tables-versus-binary-search-trees/
 *http://www.careercup.com/question?id=2696
 */

/*
 * Link List v/s BST
 * 
 * http://stackoverflow.com/questions/270080/difference-between-a-linkedlist-and-a-binary-search-tree
 * http://cboard.cprogramming.com/cplusplus-programming/92561-linked-lists-vs-binary-search-tree.html
 */
/*
 * The round started with a rigorous discussion about various OS concepts, 
 * specially virtual memory and demand paging.
 */
/*
 * 3. Suppose we have two functions void g() and void h().
 *  The function h() has been called somewhere in the body of g(). Now using a debugger, 
 *  we find that that the program crashes as soon as the return statement in h() ( at the end of function h() )
 *   is executed. There is nothing syntactically wrong with the program. How will you debug the code ???
My answer : The function h() has modified the return address on stack.
 */
public class TheoryQuestions1_adobe {

}
