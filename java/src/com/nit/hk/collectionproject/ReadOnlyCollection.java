package com.nit.hk.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyCollection {
	public int a=5;
	public static  List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) {
		try {

			list.add(5);
			list.add(2);
			list.add(4);
			list.add(8);
			list.add(6);
			list=Collections.unmodifiableList(list);
			list.add(9);
			System.out.println(list);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
