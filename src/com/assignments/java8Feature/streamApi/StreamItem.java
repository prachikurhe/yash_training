package com.assignments.java8Feature.streamApi;
/*1)Class Item
{ 
int itemid; 
String iname; 
LocalDateTime date_of_manufacturing, date_of_expiry;
float price;
//setter and getter and constructor 
}
1. WAP to find the average price of item from the list of given items. 
2. WAP to print detail of item which is having highest and lowest price. 
(separate programs should be used.
3. WAP to print the item with maximum price and not having any expiry 
date(item like water bottle, and dresses not having any expiry date)
4. WAP to store item name and price from list to set. 
5. WAP to remove duplicate prices from the list of the items
*/
import java.time.LocalDateTime;

public class StreamItem {

	private int iteamId;
	private String itemName;
	private LocalDateTime date_of_manufacturing;
	private LocalDateTime date_of_expiry;
	private float price;

	public int getIteamId() {
		return iteamId;
	}

	public void setIteamId(int iteamId) {
		this.iteamId = iteamId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public StreamItem(int iteamId, String itemName, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.iteamId = iteamId;
		this.itemName = itemName;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	@Override
	public String toString() {
		return "StreamItem [iteamId=" + iteamId + ", itemName=" + itemName + ", date_of_manufacturing="
				+ date_of_manufacturing + ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}

}
