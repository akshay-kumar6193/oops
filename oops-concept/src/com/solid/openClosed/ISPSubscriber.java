package com.solid.openClosed;

import java.util.List;

import com.solid.openClosed.InternetSessionHistory.InternetSession;
//open for extension
public class ISPSubscriber extends Subscriber {

    
    private long freeUsage;
    @Override
    public double calculateBill() {
        List<InternetSession> sessions = InternetSessionHistory.getCurrentSessions(super.getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*super.getBaseRate()/100;
    }
   
}