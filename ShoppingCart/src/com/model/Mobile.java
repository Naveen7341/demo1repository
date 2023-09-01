package com.model;

public class Mobile {
	private String brandName;
	private int memory;
	private String color;
	private String modelNumber;
	private int cost;
	
	
	public Mobile() {
		super();
	}
	public Mobile(String brandName, int memory, String color,String modelNumber, int cost) {
		super();
		this.brandName = brandName;
		this.memory = memory;
		this.color = color;
		this.modelNumber = modelNumber;
		this.cost = cost;
	}
	public String getBrandName() {
		return brandName;
	}
	public int getMemory() {
		return memory;
	}
	public String getColor() {
		return color;
	}
	public void setBrandName(String brandName) {
		brandName = brandName;
	}
	public void setMemory(int memory) {
		memory = memory;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public int getCost() {
		return cost;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
