package com.sanduo.architecture.entity;

public class OrderQueryModel extends OrderModel {
	
	
	
	public String toString(){
		return "Model"+this.getClass().getName()+","+super.toString()+" ,[]";
	}
}
