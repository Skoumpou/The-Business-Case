package gr.codehub.bootcamp3.assignmentOne.SA.model.Store;

import gr.codehub.bootcamp3.assignmentOne.SA.Interfaces.Store;
import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryRetailStore implements Store {

    private List<Product> productList=new ArrayList<Product>();;
    private List<Product> soldProductList=new ArrayList<Product>();;
    Map<String, Integer> soldProducts =new HashMap<>();

    private double totalBuyBalance;
    private double totalSellBalance;



    public List<Product> getProductList() {return productList;}


    public double getTotalBuyBalance() {return totalBuyBalance;}

    @Override
    public void buy(Product p) {
        if (p.getAvailable()){
            productList.add(p);
            totalBuyBalance= totalBuyBalance + p.getPriceWhenBuy();

        }
        else{
            System.out.println("The product isn't available for the store to buy it.");
        }
    }


    public double getTotalSellBalance() {return totalSellBalance; }

    @Override
    public void sell(Product p) {
        if (!productList.contains(p)){
            p.setAvailable(false);
        }
        if(p.getAvailable() ) { //&& productList.contains(p)){
            productList.remove(p);
            soldProductList.add(p);
            totalSellBalance= totalSellBalance +p.getPriceWhenSell();
            }
        else{
            System.out.println("The product "+p.getName()+ " isn't available for the store to sell it.");
        }

    }

    @Override
    public double getRevenue() {
        return totalSellBalance- totalBuyBalance;
    }


    public void clearOutInventory() {
        for (Product i : productList) {
            doloop(i);
        }
        System.out.println("The inventory is empty.");

    }
    public void doloop(Product i){
        System.out.println("The product: '" +i.getName()+ "' is being sold at sales price: "+i.getPriceWhenSell()*0.1+"$ from start price: "+i.getPriceWhenSell()+"$");
        productList.remove(i);
        totalSellBalance= totalSellBalance + i.getPriceWhenSell()*0.1;
        i.setAvailable(false);


    }
    public void showInventory() {
        System.out.println("These are all the products in the inventory.");
        productList.forEach((p) -> System.out.println(p.getName()));
    }

    public void findSoldProducts(){
        for(Product p: soldProductList){
            String name=p.getName();
            Integer i =soldProducts.get(name);
            i = i ==null? 1: i+1;
            soldProducts.put(name,i);
            System.out.println(p.getName());
        }

    }

    public void showSoldProducts(){
        findSoldProducts();
        for (Map.Entry<String, Integer> entry :soldProducts.entrySet()){
            String key= entry.getKey();
            Integer value= entry.getValue();
            System.out.println("Product: "+key+" has been sold :" +value+" times.");
        }

    }



}
