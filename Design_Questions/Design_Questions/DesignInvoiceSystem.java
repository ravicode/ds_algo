package Design_Questions;

public class DesignInvoiceSystem {

}


/*
typedef long ID;


Class Client
{
	ID clientId;
	string Name; //This can be struct will details
	string location;  //This can be struct will details
	ID zipcode; //Again this can be part of location
	list<Transaction> transactionIDs; 

	public:
	list< Transaction > getTransactions () { return transactionIDs; }
	int getPincode () { return zipcode;}
	string getClientDetails() {return Name;} //Like: first name, last name, age, gender etc
};

class Product
{
	ID productId;
	double productCost;
	string productName;
	public:
	ID getProductID () {return productId};
	string getProductName () {return productName; }
	double getProductCost () {return productCost; }
};

class Service 
{
		ID serviceId;
	double serviceCost;
	string serviceName;
	public:
	ID getServiceID ();
	string getServiceName ();
	double getServiceCost ();
};
struct trxDetail
{
	enum typeOfTransaction;
	ID itemId;
	int itemQuatity;
};
class Transaction
{
	client clientName;
	timestamp purchaseDate;
	timestamp dueDate;
	ID transactionID;
	trxDetail purchasedItem;
public:
	client getClient ();
	ID getTransactionID ();
	date getTransactionDate ();
	date getTransactionDueDate ();
	trxDetails getTransactionDetail ();
	//long transactionCost (); // can be calculated using serviceCost/ProductCost & quantity. tax can be added at time of invoice generation
	//addTransaction (client, transactiontime, duedata, <type, id, quantity>);
};

class taxDetails
{
	ID zipcode;
	double taxAmount;
public:
	double getTax ();
};

class invoiceManagement
{
	map<ID, Client> clientMap;
	map<ID, Service> serviceMap;
	map<ID, Product> productMap;
	map<ID, Transaction> transactionMap;
	map<ID, taxDetails> taxMap;
	static invoiceManagement *instance;

public:
	static invoiceManagement  *getInstance ()
	{
		if (instance == NULL)
		{ 
			instance = new invoiceManagement;
		}
		return instance;
	}
	Client getClient ( ID clientId ) {  return clientMap[clientID]; }
	Service getService (ID serviceId ) { return serviceMap[serviceID];  }
	Product getProduct (ID productId ) { return productMap[productID];  }
	Transaction getTransaction (ID transactionId ) { return transactionMap[transactionID];  }
	taxDetails getTaxDetails (ID zipcode ) { return taxMap[zipcode];  }

};

class invoice
{
	invoiceManagement *IM;
public:
	invoice () { IM = invoiceManagement::getInstance(); }

	void generateInvoice (ID clientID)
	{
		Client *client = IM->getClient (clientID);
		list<Transaction> trxList= client-> getTransactions ();

		//print: customer details, address
		for (trx: trxList)
		{
			trxDetail td = trx. getTransactionDetail ();
			ID zipcode =  client->getzipcode();
			string clientname = client->getClientDetails ();
			timestamp duedate = trx.getDueDate ();
			timestamp trxdate = trx.getTransactionDate ();
			double unitcost = 0;
			double tax = 0;
			string name = "";
			int quantity = 0;
			if (td.type == PRODUCT)
			{
				quantity = td.quantity;
				Product product = IM->getProduct (td.itemID);
				unitcost = product.getCost ();
				name = product.getName ();
				tax = IM.->getTaxDetails (zipcode);
			}
			else if (td.type == SERVICE)
			{
				quantity = td.quantity;
				Service service = IM->getProduct (td.itemID);
				unitcost = service.getCost ();
				name = service.getName ();
			}

			int totalCost = unitcost * quantity + tax;
			//print: name, unit cost, quantity, totalcost, due date, transaction date
		}
	}
};
*/