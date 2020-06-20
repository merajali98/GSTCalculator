package main.java.gst;

public class GstImplementation implements Gst{

    int taxRate;
    public GstImplementation(){}
    public GstImplementation(int taxRate){
        this.taxRate=taxRate;
    }
    public double calculateTaxOnItem(double priceOfItem){
        return ((priceOfItem*taxRate)/100) ;

    }
    public double calculateTaxOnItem(double priceOfItem,int quantity){
        return ((priceOfItem*taxRate*quantity)/100);

    }
}
