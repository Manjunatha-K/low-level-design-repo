package com.lld.LowLevelDesign.ObserverDesignPattern;

public class EmailAlertObserverImpl implements NotificationObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId,StockObservable stockObservable) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in Stock Hurry up!!!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to : "+emailId);
    }

}
