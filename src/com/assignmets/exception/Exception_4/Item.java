package com.assignmets.exception.Exception_4;

/*You are having a class with name Item which store the item name, price, and maximum no of item 
	can bought, Class Category it has catid, and categoryname. Class ItemBought it will have itemid, 
	itemqty. User will input the item list which will be store by the item class object array, user also 
	input how many item he has purchased and what is the quantity. On the basis of these input you 
	need to print the all item in the bill and if user input the quantity of item which is more than 
	maximum number of item can be bought limit you have to throw the exception 
	ItemPurchaseLimitExceed. It may be possible user input the price or maximum limit 0 in that case 
	also throw the exception. If all good print the total amount and all items list on console. */

public class Item {

	String itemName;
	double price;
	int maximumNumberOfItem;

	Object[] itemList = { itemName, price, maximumNumberOfItem };

	public Item(String itemName, double price, int maximumNumberOfItem) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem + "]";
	}

}
