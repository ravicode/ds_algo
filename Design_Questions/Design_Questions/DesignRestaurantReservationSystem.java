package Design_Questions;

/*
 * 
 * have a class restReservation, which will have method as, 
- tableIsEmpty( int) , will take the number of person for which emtpy table has to find, 
it will return 0 if all are full, otherwise table number. 
- tableBookFor(int start time, int endtime) 


it will have following member,: 
- array of elements. 
each element will have, table number, table capacity, isBooked, int startime, int endTime,.
 */



/*
 * 1. One superClass - Individuals (Name, Cell No., designation, etc) 
2. Two subClasses - Employee and Guests should extend the Individual superclass and implement the corresponding methods. 
3. Class - Table{} which will contain the guest object. 
4. SuperClass - Menu {} 
5. Class - Order should extend the superclass, Menu. and Order objects should be stored in a queue for processing. 
6. A hashMap<Table No., Order index in the Queue> to track the status of object. 
7. Class - Bill should also extend the super class Menu for processing the bills. 
8. An additional queue to track the guests who have not been allocated the table as all tables might get busy some time.
 So when a table is freed, next guest from the queue is dequeued. 
9. When a person is allocated a table, it should be assigned a waiter 
// we can use a queue to keep track of available waiters.....
 */
public class DesignRestaurantReservationSystem {

}
