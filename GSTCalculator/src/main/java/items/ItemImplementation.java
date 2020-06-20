package main.java.items;

import main.java.gst.Gst;

public class ItemImplementation implements Item {

    int quantity;
    double unitPrice;
    public ItemImplementation(){}
    public ItemImplementation(int quantity, double unitPrice){
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }
    public double calculateTaxAmountOnEachItem(Gst gst){
        return gst.calculateTaxOnItem(unitPrice);
    }
    public double calculateTotalAmountAfterAddingTax(Gst gst){
        return (quantity*unitPrice)+(gst.calculateTaxOnItem(unitPrice,quantity));
    }
}
