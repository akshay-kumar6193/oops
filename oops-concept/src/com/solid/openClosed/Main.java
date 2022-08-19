package com.solid.openClosed;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Subscriber subscriber=new PhoneSubscriber();
		subscriber.setBaseRate(100);
		subscriber.setSubscriberId(100L);
		System.out.println(subscriber.calculateBill());
		
		
	}

}
