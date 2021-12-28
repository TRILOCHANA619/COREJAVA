package com.nit.hk.collectionproject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CylinderDistribute {

	private	List<String> customerName=new ArrayList<String>();
	private Set<Integer> custId=new LinkedHashSet<Integer>();

	
	public List<String> getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String name) {
		customerName.add(name);
	}


	public Set<Integer> getCustId() {
		return custId;
	}


	public void setCustId(Integer custId) {
		this.custId.add(custId);
	}


	public void distributeByName() {
		for (String str : customerName) {
			System.out.println(str+"  Got Cylinder");
		}
		
	}
	public void distributeById() {
		for (Integer id : custId) {
			System.out.println(id+" people Got Cylinder");
		}
	}
	public static void main(String[] args) {


	}

}
