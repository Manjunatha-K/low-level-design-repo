package com.lld.LowLevelDesign.SOLID;


//A class should have only one reason to change
public class SingleResponsibilityPrinciple {
}

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class Invoice {
    private Marker marker;   // Has a Relationship
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculate() {
        int price = ((marker.price) * quantity);
        return price;
    }

    /* with below two methods, The Invoice class is not following SINGLE RESPONSIBILITY PRINCIPLE,
    So Now,Let's create tow class to implement the below two methods.

    public void printInvoice(){
        //Implementation code
    }

    public void saveToDB(){
        //Save the Data into DB
    }
     */
}

class PrintInvoice {
    private Invoice invoice;

    public PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void PrintInvoiceImpl() {
        //Implementation of printing logic
    }
}

class SaveToDB {
    private Invoice invoice;

    public SaveToDB(Invoice invoice) {
        this.invoice = invoice;
    }

    public void SaveToDBImpl() {
        //Implementation of Saving to DB logic
    }
}
