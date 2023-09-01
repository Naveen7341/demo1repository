package com.model;

public class Laptop {
	private String laptopBrandName;
	private int laptopMemory;
	private String laptopcolor; 
	private boolean isAttchedMouse;
	private int lapCost;
	public Laptop() {
		super();
	}
	public Laptop(String brandName, int memory, String color, boolean attchedMouse,int cost) {
		super();
		this.laptopBrandName = brandName;
		this.laptopMemory = memory;
		this.laptopcolor = color;
		this.isAttchedMouse = attchedMouse;
		this.lapCost = cost;
	}

	public String getLaptopBrandName() {
		return laptopBrandName;
	}
	public int getLaptopMemory() {
		return laptopMemory;
	}
	public String getLaptopcolor() {
		return laptopcolor;
	}
	public boolean isAttchedMouse() {
		return isAttchedMouse;
	}
	public int getLapCost() {
		return lapCost;
	}
	public void setLaptopBrandName(String laptopBrandName) {
		this.laptopBrandName = laptopBrandName;
	}
	public void setLaptopMemory(int laptopMemory) {
		this.laptopMemory = laptopMemory;
	}
	public void setLaptopcolor(String laptopcolor) {
		this.laptopcolor = laptopcolor;
	}
	public void setAttchedMouse(boolean isAttchedMouse) {
		this.isAttchedMouse = isAttchedMouse;
	}
	public void setLapCost(int lapCost) {
		this.lapCost = lapCost;
	}

}
