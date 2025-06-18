package com.lld.LowLevelDesign.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    List<NotificationObserver> listofNotificationObservers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        listofNotificationObservers.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        listofNotificationObservers.remove(notificationObserver);
    }

    @Override
    public void notifyme() {
        for(NotificationObserver obj : listofNotificationObservers){
        obj.update();
        }
    }

    @Override
   public void setdata(int newStockcount){
      if(stockCount ==0) {
          notifyme();
      }
      stockCount = stockCount+newStockcount;
    }
    @Override
    public int getdata(){
        System.out.println("StockCount is : "+ stockCount);
        return stockCount;
    }
}
