package Design_Questions;


public class DesignClothingStore 
{

}

/*
 * I suggest using a Factory Method pattern to make the design more flexible and extendible. 
 * You can have an abstract class Clothes, 
 * which has properties such as price, brand, size, etc. 
 * and different kinds of clothes subclass it, overloading price() and brand(). 
 * This has the benefit that the store could sell objects
 *  of type Clothes, and through runtime polymorphism resolve what kind of clothes to sell. 
 *  A hash table or a map in the Store class could help finding what sizes of clothes are in-stock. 

To take this further, we might also consider Abstract Factory pattern to be able to sell families of clothes such as 
shirts, underwear,
 dresses, jackets, etc. and to account for more flexibility with respect to later additions of clothes to the store and modifications.
 */

/*
 * Class Store 
{ 
 String location 
 int phone 
 int branch_id 
 String email 

 ArrayList<Cloth> cloth; 

 add(cloth) 
 { 
 //add barcode and price to Hash 
 } 

 // for purchase and return 
 Hash<cloth.barCode, cloth.price> 

 //methods that returs arraylist of clothes 
 ArrayList<cloth> getCloth(cloth.type) 
 ArrayList<cloth> getCloth(cloth.size) 
 ArrayList<cloth> getCloth(cloth.brand) 
} 

Class Cloth 
{ 
 String brand 
 enum size {S, M, L, XL, XXL} 
 enum type {TShirt, Shirt, Pant, Jeans,..} 
 float price 
 long barCode 

 Cloth() 
 Cloth(type) 
} 

Class Customer 
{ 
 buyCloth(Cloth.barCode, PaymentObj) 
 { 
 //get price 
 //returns Payment receipt number 
 } 

 returnCloth(Cloth.barCode) {} 
} 

Class Staff{} 

Class Payment 
{ 
 int receiptN 
} 

 */
