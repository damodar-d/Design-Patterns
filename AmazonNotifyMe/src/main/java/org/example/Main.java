package org.example;

import org.example.Observable.IPhoneObservableImpl;
import org.example.Observable.StocksObservable;
import org.example.Observer.AlertNotificationObserver;
import org.example.Observer.EmailNotificationObserver;
import org.example.Observer.MobileNotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        StocksObservable iPhoneObservable = new IPhoneObservableImpl();

        AlertNotificationObserver o = new EmailNotificationObserver("abhitejpooja@gmail.com",iPhoneObservable);
        AlertNotificationObserver o1 = new EmailNotificationObserver("damodardesh00@gmail.com",iPhoneObservable);
        AlertNotificationObserver o2 = new MobileNotificationObserver("+91 8805090027",iPhoneObservable);

        iPhoneObservable.add(o);
        iPhoneObservable.add(o1);
        iPhoneObservable.add(o2);

        iPhoneObservable.setStockCount(10);
        System.out.println("---------");
        iPhoneObservable.setStockCount(0);
        iPhoneObservable.setStockCount(1000);
        System.out.println("---------");
    }
}