package gr.codehub.bootcamp3.assignmentOne.SA.model.Store;

import gr.codehub.bootcamp3.assignmentOne.SA.Interfaces.Store;
import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleRetailStore implements Store {

    private double totalBuyBalance;
    private double totalSellBalance;
    Product p;


    @Override

    public double getTotalBuyBalance() {return totalBuyBalance;}

    @Override
    public void buy(Product prod) {
        p=prod;
        if (p.getAvailable()== true){
            totalBuyBalance= totalBuyBalance + p.getPriceWhenBuy();

        }
        else{
            System.out.println("The store cannot buy this product: "+p.getName()+" from the supplier because the supplier has run out of it.");
        }

    }
    public double getTotalSellBalance() {
        return totalSellBalance;
    }

    @Override
    public void sell(Product prod) {
        p=prod;
        if(p.getAvailable()){
            totalSellBalance= totalSellBalance +p.getPriceWhenSell();
            p.setAvailable(false);
        }
        else{
            System.out.println("The store cannot sell this product: "+ p.getName() +" because it has run out of it.");


        }


    }

    @Override
    public double getRevenue() {
        return totalSellBalance- totalBuyBalance;
    }

    @Override
    public void showInventory() {
        System.out.println("Simple retail store does not keep inventory of its products");
    }

    @Override
    public void clearOutInventory() {
        System.out.println("Simple retail store does not keep inventory of its products");
    }

    public void showSoldProducts(){
        System.out.println("This Store does not keeps inventory of its products");
    }
}
