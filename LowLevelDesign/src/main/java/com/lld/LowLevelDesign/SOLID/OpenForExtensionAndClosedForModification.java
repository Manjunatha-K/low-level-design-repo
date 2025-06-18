package com.lld.LowLevelDesign.SOLID;

public class OpenForExtensionAndClosedForModification {
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
