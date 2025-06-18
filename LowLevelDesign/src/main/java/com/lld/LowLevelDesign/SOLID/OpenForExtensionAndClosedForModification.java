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
