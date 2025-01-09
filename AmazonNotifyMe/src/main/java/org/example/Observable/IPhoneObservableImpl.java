package org.example.Observable;

import org.example.Observer.AlertNotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable{

    List<AlertNotificationObserver> observerList = new ArrayList<AlertNotificationObserver>();
    int iPhoneCount = 0;

    @Override
    public void add(AlertNotificationObserver o) {
        this.observerList.add(o);
    }

    @Override
    public void remove(AlertNotificationObserver o) {

    }

    @Override
    public void notifyAllSubscribers() {
        for(AlertNotificationObserver o:this.observerList){
            o.update();
        }
    }

    @Override
    public void setStockCount(int newCount) {

        if(this.iPhoneCount==0){
            notifyAllSubscribers();
        }
        this.iPhoneCount=newCount;
    }

    @Override
    public int getStockCont() {
        return 0;
    }
}
