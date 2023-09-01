package com.model;

import java.util.List;

//POZO file
public class FlipkartCart  { 
	private String cartName;
	private int noOfItems;
	private int shippingCharges = 60;
	private int amountToBePaid;
	private List<Mobile> mobile;
	private List<Laptop> laptop;
	
	
	public FlipkartCart(String cartName, int noOfItems, int shippingCharges,int amountToBePaid) {
		super();
		this.cartName = cartName;
		this.noOfItems = noOfItems;
		this.shippingCharges = shippingCharges;
		this.amountToBePaid = amountToBePaid;
	}
	public FlipkartCart() {
		super();
	}
	
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public void setnoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public void setShippingCharges(int shippingCharges) {
		this.shippingCharges = shippingCharges;
	}
	public String getCartName() {
		return cartName;
	}
	public int getnoOfItems() {
		return noOfItems;
	}
	public int getShippingCharges() {
		return shippingCharges;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		int totalCostOfMobiles = 0;
		for (Mobile Mobile2 : mobile) {
			totalCostOfMobiles += Mobile2.getCost();
			System.out.println("Mobile brand name is --> " + Mobile2.getBrandName()); 
			System.out.println("Mobile cost is --> " + Mobile2.getCost()); 
		}
		return "Total cost of the mobiles --> "+ totalCostOfMobiles;
	}
	
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public String getLaptop() {
		int totalCostOfLaptops = 0;
		for (Laptop laptop2 : laptop) {
			totalCostOfLaptops += laptop2.getLapCost();
			System.out.println("Laptop brand name is --> " +laptop2.getLaptopBrandName());
			System.out.println("Laptop cost is --> " +laptop2.getLapCost());
		}
		return "Total cost of laptops --> " + totalCostOfLaptops;
	}
	public int getAmountToBePaid() {
		return amountToBePaid;
	}
	public void setAmountToBePaid(int amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	

}
