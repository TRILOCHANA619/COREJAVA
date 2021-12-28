package com.nit.hk.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateFromIndex {

	public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	name.add("hari");
	name.add("Adlof");
	name.add("jhon");
	name.add("ram");
	name.add("syam");
	System.out.println(name);
	Collections.rotate(name, 2);
	System.out.println(name);
	}

}
