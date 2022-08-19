package com.solid.openClosed;


import java.util.List;
//open for extension
public class PhoneSubscriber extends Subscriber {

	@Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(super.getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        System.out.println(super.getBaseRate()+" "+super.getSubscriberId());
        return totalDuration*super.getBaseRate()/100;
    }

 
}