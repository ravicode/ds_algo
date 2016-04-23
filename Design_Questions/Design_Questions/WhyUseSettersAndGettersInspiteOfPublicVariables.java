package Design_Questions;

public class WhyUseSettersAndGettersInspiteOfPublicVariables {

}


// q- why make variable private and used by only setters and getters.
/*
 * Getters and Setters are useful in following cases. 
1. To add validation code (Already mentioned above) 
2. Making members public makes debugging very difficult. You can add breakpoints in getters and setters easily.
 */

/*
 * The answer lies in inheritence. Private members won't be inherited.
 */
