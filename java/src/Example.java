

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example {
	
	public static void main(String[] args) {
		try {
			//taking input from user
		Scanner sc=new Scanner(System.in);
		//create hashmap object to store key value pair format
		HashMap<String,Integer> onHandInventory=new HashMap<String,Integer>();
		//create part for one bycycle
		HashMap<String,Integer> partsForOneBycycle=new HashMap<String,Integer>();
		//create for billof material
		HashMap<String,Integer> bom=new HashMap<String,Integer>();
		//create for inventory net
		HashMap<String,Integer> inventoryNetOf=new HashMap<String,Integer>();
		System.out.println("Enter the no of bycycle :: ");
		int noOfBycycle=sc.nextInt();
		//adding all items of bycycle in key,value format
		onHandInventory.put("Seat", 50);
		onHandInventory.put("Frame", 80);
		onHandInventory.put("Brake Set",25);
		onHandInventory.put("Brake paddle", 100);
		onHandInventory.put("Brake cable",75);
		onHandInventory.put("Leaver", 60);
		onHandInventory.put("Brake Shoe",150);
		onHandInventory.put("Handle bar",100);
		onHandInventory.put("Wheel",60);
		onHandInventory.put("Tier",80);
		onHandInventory.put("Chain",100);
		onHandInventory.put("Crank set",50);
		onHandInventory.put("Paddle",150);
		System.out.println(onHandInventory);
		System.out.println(" FIRST LEVEL");
		//first level of assemble in bycycle
		
		
		partsForOneBycycle.put("seat",1);
		partsForOneBycycle.put("frame",1);
		partsForOneBycycle.put("handle bar",1);
		partsForOneBycycle.put("wheel",2);
		partsForOneBycycle.put("tier",2);
		partsForOneBycycle.put("chain",1);
		partsForOneBycycle.put("paddle",2);
		partsForOneBycycle.put("brake set", 1);
		partsForOneBycycle.put("brake paddle",2);
		partsForOneBycycle.put("brake cable",1);
		partsForOneBycycle.put("leaver",1);
		partsForOneBycycle.put("brake shoe",2);
		partsForOneBycycle.put("crank set",1);
		System.out.println(partsForOneBycycle);
		
		Set<String> itemDemo=onHandInventory.keySet();
		//create arraylist for the storing item name
		List<String> items= new ArrayList<String>(itemDemo);
		
		System.out.println(items);
		System.out.println(partsForOneBycycle.get("seat"));
		
		//bussiness logic for calculating the bill of material
		for (int i = 0; i < items.size(); i++) {
			
			Integer item_bom=(partsForOneBycycle.get(items.get(i).toLowerCase())/1)*noOfBycycle;
			bom.put(items.get(i), item_bom);
		}
	System.out.println(bom);
	//busssiness for calculating inventory net of
		for (int i = 0; i < bom.size(); i++) {
			
			Integer netof=onHandInventory.get(items.get(i))-bom.get(items.get(i));
			inventoryNetOf.put(items.get(i), Math.abs(netof));
			//System.out.println("The inventory net of "+items.get(i)+" is "+Math.abs(netof));
		}
		System.out.println(inventoryNetOf);
		//exception handling
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
