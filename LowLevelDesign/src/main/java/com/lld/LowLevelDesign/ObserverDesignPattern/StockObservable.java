package com.lld.LowLevelDesign.ObserverDesignPattern;

public interface StockObservable {



    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyme();
    void setdata(int newStockCount);
    int getdata();
}
