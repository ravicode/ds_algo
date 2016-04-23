package Theory_questions;
//Three mislabeled jars problem.

/*
 * Puzzles:
�Cut round cake into 8 equal pieces u can use knife only 3 times
ans:- 
a)he �correct� answer is to cut the cake in quarters (4 pieces) using 2 of the cuts � one horizontally down the center of the cake and the other vertically down the center of the cake. This will leave you with 4 pieces (or slices) of cake. Then, you can take all 4 pieces and arrange them in a stack that is 4 pieces high. Finally, you can just cut that stack of 4 pieces in half � using your third and final cut � and then you will end up with 8 pieces of cake!

b) 1. First stroke:Straight from the middle, dividing the cake in two equal halves 
2. 2nd stroke: Similar cut at 90 degrees, so that cake is now in 4 equal parts 
3. 3rd: From the side throughout the cake ;) (you will need a knife longer than cake)

�8 marbles puzzle(very famous)
Suppose you have 8 marbles and a two-pan balance used to compare the weight of 2 things. All of the marbles weigh the same except for one, which is heavier than all of the others. How would you find the heaviest marble if you are only allowed to weigh the marbles 2 times?
Ans:- 
we put 3 marbles on each pan � for a total of 6 marbles on the pan, and we leave 2 marbles off the pan. Then, we compare the 6 marbles on the pan � if one side is heavier than the other then we only have 3 marbles left. We can compare 2 of those 3 marbles to each other, and if they are the same weight then the 3rd is the heaviest, and if one is heavier than the other then we have the heaviest in just 2 weighings. If, when comparing the 6 marbles we find that both sides are equal, then we know that the heaviest marble has to be in the 2 marbles that are not on the pan. This then means that we only have to compare those 2 remaining marbles and we have the heaviest marble. So, we have found our answer!
generalized solution:-
given n marbles, it takes ceiling (log3n) weighings to find the heavy marble.

One interesting thing to note here is how much easier it would have been to solve the previous problem if the number of marbles was 9, because you are able to split the marbles into 3 groups of 3. But, with 8 marbles, the problem becomes more difficult and forces you to think a bit more. So, it�s always good to remember to try out different scenarios, and not to be misled into thinking about the problem in the wrong way because of a small detail in the problem.

�Given a crescent moon shape. Cut it into 7 parts with 2 cuts at max.
 */
// Ans:- https://www.rain.org/~mkummel/stumpers/14dec01a.html

/*
 * �Rope puzzle(famous)
 * Q:- 
 * A man has two ropes of varying thickness (Those two ropes are not identical, they aren�t the same density nor the same length nor the same width). Each rope burns in 60 minutes. He actually wants to measure 45 mins. How can he measure 45 mins using only these two ropes.
He can�t cut the one rope in half because the ropes are non-homogeneous and he can�t be sure how long it will burn.
 * Ans:-
 * He will burn one of the rope at both the ends and the second rope at one end. After half an hour, the first one burns completely and at this point of time, he will burn the other end of the second rope so now it will take 15 mins more to completely burn. so total time is 30+15 i.e. 45mins.
 * 

�Given n people in a room. Each one shakes hands with only those people who are known to him. You have to prove that there will be at-least two people among them, having same number of shake hands.
 */

/*
 * King�s poisonous wine cellars
 * 
 * Ans:- http://sbjoshi.wordpress.com/2008/06/03/puzzle-kings-poisonous-wine-cellar/
 */

/*
 * a)There are 2 people A and B. Both A and B have equal speed of walking. Both A and B have equal speed of running. Now assume that A runs for half the time and walks for half the time. While, B runs for half the distance and walks for half the distance. Can we tell conclusively who will win in a race?
 */

/*
 * A puzzle was given where three tires are given which can travel 14, 20, 26 kms . Two tires are required for travelling. Find the maximum distance which can be travelled.
 */

/*
 * Puzzle:10 containers with 100 balls each but one container defective.Find out the defective container in minimum weighings.
 */

/*
 * 4th round :
Puzzles:
�25 horses puzzles(famous)
Ans:- http://www.programmerinterview.com/index.php/puzzles/25-horses-3-fastest-5-races-puzzle/
�Hour glass puzzle(famous)
Ans:- http://www.mathsisfun.com/puzzles/hourglasses-1-solution.html
�You have to assemble a computer, with minimum cost. check if it is running the boot strap program.
 */

/*
 * There are 25 horses and a track which can race 5 horses at a time. Find the top 5 horses in minimum number of races. Assuming best horse always wins.
 */

/*
 *  You have 7 coins out of which one is fake. Find the fake coin in minimum number of weightings.
 */

/*
 * 1. This round started with a puzzle: There are two buckets- one having 100L water and another 
 * having 50L milk.
 *  A spoonful of water is taken from 1st bucket and added to 2nd bucket and the mixture is stirred, 
 *  now a spoonful of the mixture is taken from the 2nd bucket and added to the 1st. 
 *  Compare the final volume of milk in 1st bucket to the final volume of water in 2nd bucket.

2. Defective ball puzzle: Find defective ball among 7 balls using minimum no of measures.
 */
public class Puzzles {

}
