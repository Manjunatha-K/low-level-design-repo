package com.lld.LowLevelDesign.ObserverDesignPattern;

public class MobileAlertObserverImpl implements NotificationObserver {

    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String name, StockObservable stockObservable) {
        this.userName = name;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock. Hurry up !!");
    }
    private void sendMsgOnMobile(String name, String msg){
        System.out.println("Message sent to : "+ name);
    }

}
