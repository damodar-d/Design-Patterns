package org.example.Observable;

import org.example.Observer.AlertNotificationObserver;

public interface StocksObservable {
    void add(AlertNotificationObserver o);
    void remove(AlertNotificationObserver o);
    void notifyAllSubscribers();
    void setStockCount( int newCount);
    int getStockCont();


}
