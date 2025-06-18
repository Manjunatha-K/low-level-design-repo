package com.lld.LowLevelDesign.ObserverDesignPattern;

public class Store {
    public static void main(String[] args) {
       StockObservable iphoneStockObservable = new IphoneStockObservable();
       NotificationObserver observer1 = new EmailAlertObserverImpl("manju@gmail.com",iphoneStockObservable);
        NotificationObserver observer2 = new EmailAlertObserverImpl("manju@gmail.com",iphoneStockObservable);
        NotificationObserver observer3 = new MobileAlertObserverImpl("manju",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setdata(120);
    }
}
