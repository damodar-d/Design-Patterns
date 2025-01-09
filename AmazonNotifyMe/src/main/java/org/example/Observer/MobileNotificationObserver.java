package org.example.Observer;

import org.example.Observable.StocksObservable;

public class MobileNotificationObserver implements AlertNotificationObserver{
    String username;
    StocksObservable o;

    public MobileNotificationObserver(String username, StocksObservable o) {
        this.username = username;
        this.o = o;
    }

    @Override
    public void update() {
        sendMessageOnMobile(username,"Product is back in the stock hurry up");
    }

    private void sendMessageOnMobile(String emailId,String message){
        System.out.println(message);
        System.out.println("Sent message on mobile: "+emailId);
    }
}
