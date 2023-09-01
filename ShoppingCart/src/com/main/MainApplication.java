package com.main;

import java.util.ArrayList;
import java.util.List;

import com.dao.DAOMobile;
import com.dao.DAOMobileImpl;
import com.model.FlipkartCart;
import com.model.Laptop;
import com.model.Mobile;

public class MainApplication {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("Motto",8,"Black","IME12365",2000);
		Mobile mobile2 = new Mobile("1+",8,"Black","IME82782",12300);
		Mobile mobile3 = new Mobile("Oppo",8,"Black","IME434625",15000);
		
		Laptop laptop1 = new Laptop("Dell",4,"black",false,45000);
		Laptop laptop2 = new Laptop("HP",4,"white",true,52000);
		Laptop laptop3 = new Laptop("Asus",8,"silver",true,61000);
		
		DAOMobile DAOMobileApp = new DAOMobileImpl();
		DAOMobileApp.createMobile(mobile1);
		
		FlipkartCart FlipkartCart = new FlipkartCart();
		List<Mobile> mobiles = new ArrayList();
		mobiles.add(mobile1);
		mobiles.add(mobile2);
		mobiles.add(mobile3);
		
		List<Laptop> laptops = new ArrayList();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		
		
		FlipkartCart.setCartName("Flipkart Cart Items are listed below ");
		System.out.println(FlipkartCart.getCartName());
		System.out.println("---------");
		//for Mobiles
		FlipkartCart.setMobile(mobiles);
		System.out.println(FlipkartCart.getMobile());
		//for Laptops
		
		System.out.println("---------");
		FlipkartCart.setLaptop(laptops);
		System.out.println(FlipkartCart.getLaptop());
		
		
		
		FlipkartCart.setnoOfItems(mobiles.size()+  laptops.size());
		System.out.println("No of items in Cart --> " + FlipkartCart.getnoOfItems());
		
//		for (Mobile mobile : mobiles) {
//			System.out.println("Mobile Brand Name : " + mobile.getBrandName());
//			System.out.println("Mobile Cost : " + mobile.getCost());
//			System.out.println("Mobile Brand Name : " + mobile.getColor());
//			System.out.println("Mobile Cost : " + mobile.getModelNumber());
//			System.out.println("Mobile Memory : " + mobile.getMemory());
//			
//		}
		
		

	}

}
