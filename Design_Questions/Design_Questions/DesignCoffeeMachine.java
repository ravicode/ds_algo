package Design_Questions;

/*
 * For Coffee machine -- Use Decorator. 
For Coffee Shops -- Use Builder as multiple shops needs to be opened.
 */

/*
 * 
 * typedef long ID;

enum Roll {CASHIER, MANAGER, WAITER};
class Employee
{
	ID empID;
	string name;
	Roll roll;
	public:
	setRoll ();
}

class Waiter: public Employee
{
	public:
	waiter() {	setRoll (WAITOR); }
}

class Cashier: public Employee
{
	public:
	cashier () {	setRoll (CASHIER); }
}

class Table
{
	ID tableId;
	bool isAvailable;
	int capacity;
	int used;

	public:
	Table(ID id) {tableId = id; // set other params also}

	bool isAvailable ();
	void reserveTable ();
	void freeTable ();
}

Class Item
{
	ID itemID;
	double itemCost;
	public:
	getItemCost ();
}

class Order
{
	Table tableID;
	Waiter waiterID;
	Cashier cashierID;

	vector<item, int> request; // item, quantity
	public:
	void placeOrder (itemID, quantity) ;// push_back in request vector
	double getBill (); // call Invoice Class's generateBill()
}

class Menu
{
	map<item, double> itemCostMap; //
	map<item, int> itermQuantityMap; //

	public:
	double getItemCost (Item itemID);
	int getItemQuantity (Item itemID);
	bool isItemAvailable (Item itemID);
}

class invoice
{
	Menu menu;
	public:
	generateBill (vector<itemID, quantity>); // uses Menu class getItemCost () to get cost and generate bill
}


class coffeeShop
{
	List<Table> tables;
	List<Waiter> waiters;
	List<Cashier> cashiers;
	map<Table, Order> orders;

	public:
	coffeeShop ()
	{
		//initialise each table with ID and capacity; and other member also;
	}
	void addWaiter ();
	void removeWaiter ();
	void addCashier();
	void removeCashier ();
	//similar for other employees, like manager 

	void addTable ();
	void removeTable():

	void getOrder (Table tableId, Item itemID, int quantity); // this will order object and place in map

	double getBill (Table tableId)
	{ 
		Order order = orders[tableId]; 
		order.getBill ();
	}
}
 */
public class DesignCoffeeMachine {

}
