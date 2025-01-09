package org.example.Observer;

import org.example.Observable.StocksObservable;

public class EmailNotificationObserver implements AlertNotificationObserver{

    String emailId;
    StocksObservable o; // Which observable you are trying to observe

    public EmailNotificationObserver(String emailId, StocksObservable o) {
        this.emailId = emailId;
        this.o = o;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is back in the stock hurry up");
    }

    private void sendMail(String emailId,String message){
        System.out.println(message);
        System.out.println("Mail sent to: "+emailId);
    }
}
