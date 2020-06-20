package main.java.items;

import main.java.gst.Gst;

public interface Item {

    double calculateTaxAmountOnEachItem(Gst gst);
    double calculateTotalAmountAfterAddingTax(Gst gst);
}
