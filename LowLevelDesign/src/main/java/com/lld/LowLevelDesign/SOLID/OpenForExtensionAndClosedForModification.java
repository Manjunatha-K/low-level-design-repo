package com.lld.LowLevelDesign.SOLID;

public class OpenForExtensionAndClosedForModification {
}

class SaveToDatabase {
    private Invoice invoice;

    public SaveToDatabase(Invoice invoice) {
        this.invoice = invoice;
    }


    public void SaveToDatabaseImpl() {
        //Implementation of Saving to DB logic
    }
}


//Open for extension but closed for modification
/*
If a class is tested and is live in production. But, now we need to extend the
capability of the class, so instead of adding the method in the class, we are doing the below implementation

 */
interface InvoicDao{
    public void save(Invoice invoice);
}

class DataBaseInvoiceDao implements InvoicDao{

    @Override
    public void save(Invoice invoice) {

    }
}

class FileInvoiceDao implements InvoicDao{

    @Override
    public void save(Invoice invoice) {

    }
}