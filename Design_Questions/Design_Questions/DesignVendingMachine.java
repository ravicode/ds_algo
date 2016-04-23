package Design_Questions;

/*
 * 
 * class VendingMachine
	- boolean takeMoney(Money money);
	//Here item will contain type & quantity, no smart search required 
	//say user need half litere Coke.
	- Item pickItem(Item item); 
	- boolean isAvilable(Item item)
	- Double askForAmount(Input input);
	- Double valiDateAndReturnBalance(Money money);
class Money
	-CurrencyType type;
	-Double amount	
class MoneyValidator
    - boolean validate(Money amount);
class Item
	-ItemType type;
	-Double quantity
	-String barcode; // May be anything else to identify it
class Input
    - CommandType type;
    - Double quantity
	- ItemType type;
class display
    - void updateDisplay(String instructions)
class KeyPad
    - Input readUserInput(Key key);
class Key
    -KeyType type
    -Double value
	
enum CurrencyType
enum ItemType
enum KeyType
enum CommandType


Item's availability (more specifically nos. available) is one of the keys information here. 
And considering that, storing Items with available count in a structure similar to Map (i.e. Hashtable or Hashmap in Java) 
makes more sense.
 This ways, when you implement isAvailable(Item item), you can validate Item's Stock.
 */

public class DesignVendingMachine {

}
