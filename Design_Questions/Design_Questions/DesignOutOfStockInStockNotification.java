package Design_Questions;

/*
 * customers want to buy some products but products are out of stock, 
 * design a system to notify them when those products are again available?
 */


/*
 * . when a product is added to system it would generate an event. 
2. Customer notification module will register and receive this event. 
3. Customer wishlist table will list of customer id with product id they wish for. 
4. The event processing will look for customer list for the product id, event is generated for. 
5. It would notify those customers. 
6. and remove them from the wishlist table.
 */

/*
 * 
 * here we have a class Store which having list of product and its availability if any customer want any product it is there give him other wise 
 * register him for notification for particular product notification list when item is added notify all customer who is available in notification 
 * list and remove customer from that notification list."observer pattern"
 */
public class DesignOutOfStockInStockNotification {

}

//OBSERVER PATTERN :- 

/*
 * The Observer pattern allows an object (an Observer) to watch another object (a Subject). 
 * The subject and observer to have a publish/subscribe relationship. Observers can register to receive events from the Subject.
 *  When the subject can update the Observers when certain expected events occur. In Design Patterns,
 *   the Observer Pattern is defined asDefine a one-to-many dependency between objects so that when one object changes state,
 *   all its dependents are notified and updated automatically.The Observer pattern helps create a family of cooperating classes,
 *    while maintaining consistency and avoiding tight-coupling.
When To Use

In a mailing list, where every time an event happens (a new product, a gathering, etc.) a message is sent to the people subscribed to
 the list.
When a change to one object requires changing others, and you don't know how many objects need to be changed.
When an object should be able to notify other objects without making assumptions about who these objects are (avoid tight-coupling).

Pros and Cons

Loose coupling between Subject and Observer: The subject knows only a list of observers,
 that implement the Observer interface, it does no know the concrete implementation of the Observer.
Broadcast communication: An event notification is broadcast observers irrespective of the number of Observers
Unexpected updates: The can be blind to the cost of changing the subject.

*/
