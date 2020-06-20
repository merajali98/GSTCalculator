package main.java.demo;

import main.java.gst.slabs.GstFor0Slab;
import main.java.gst.slabs.GstFor28Slab;
import main.java.gst.slabs.GstFor5Slab;
import main.java.items.Item;
import main.java.items.itemcategories.Cosmetics;
import main.java.items.itemcategories.Electronics;
import main.java.gst.Gst;
import main.java.gst.slabs.GstFor18Slab;
import main.java.items.itemcategories.FoodGrains;
import main.java.items.itemcategories.Furniture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double taxPerUnit=0;
        double totalAmount=0;
        Item item=null;Gst gst=null;
        List<String> listOfElectronicItems= Arrays.asList("mobile", "tv", "tablet");
        List<String> listOfFurnitureItems=Arrays.asList("table", "sofa", "chair");
        List<String> listOfFoodGrainsItems=Arrays.asList("rice", "wheat", "dal");
        List<String> listOfCosmeticItems=Arrays.asList("cream", "perfume", "lotion");

        System.out.println("Enter space separated units,commodity,initial unit price");

        String [] userInputs=scanner.nextLine().split(" ");
        int quantity=Integer.parseInt(userInputs[0]);
        String userEnteredItem=userInputs[1].toLowerCase();
        double unitPrice=Double.parseDouble(userInputs[2]);

        if(quantity<=0 || unitPrice<0){
            System.out.println("You have entered wrong set of values");
        }
        else {
            if (listOfElectronicItems.contains(userEnteredItem)) {
                item = new Electronics(quantity, unitPrice);
                gst = new GstFor18Slab();

            } else if (listOfFoodGrainsItems.contains(userEnteredItem)) {
                item = new FoodGrains(quantity, unitPrice);
                gst = new GstFor0Slab();

            } else if (listOfFurnitureItems.contains(userEnteredItem)) {
                item = new Furniture(quantity, unitPrice);
                gst = new GstFor5Slab();

            } else if (listOfCosmeticItems.contains(userEnteredItem)) {
                item = new Cosmetics(quantity, unitPrice);
                gst = new GstFor28Slab();
            } else {

                System.out.println("Item you entered is not registered yet");

            }
            if (gst != null && item != null) {
                taxPerUnit = item.calculateTaxAmountOnEachItem(gst);
                totalAmount = item.calculateTotalAmountAfterAddingTax(gst);
                System.out.println("taxPerUnit:" + taxPerUnit);
                System.out.println("totalAmount:" + totalAmount);

            }

        }

    }

}
