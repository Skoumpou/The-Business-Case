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
    Map<String, List<Object>> soldProducts =new HashMap<>();

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
            Integer i;
            Double totalPrice;
            if (soldProducts.get(name)== null){
                i=1;
                totalPrice = (Double)p.getPriceWhenSell();
                List<Object> lst=new ArrayList<Object>();;
                lst.add(i);
                lst.add(totalPrice);
                soldProducts.put(name,lst);

            }else{
                List<Object> lst=new ArrayList<Object>();;
                lst=soldProducts.get(name);
                Object value=lst.get(0);
                Object t =lst.get(1);
                totalPrice= (Double)t;
                i= (Integer)value;
                i= i+1;
                totalPrice= totalPrice + p.getPriceWhenSell();
                lst.set(0,i);
                lst.set(1,totalPrice);
                soldProducts.put(name,lst);
            }



            //Integer i=soldProducts.get(name);
            //i = i ==null? 1: i+1;
            //soldProducts.put(name,i);

           // System.out.println(p.getName());
        }

    }


    public void showSoldProducts(){
        findSoldProducts();
        //for (Map.Entry<String, Integer> entry :soldProducts.entrySet()){
        for (Map.Entry<String, List<Object>> entry :soldProducts.entrySet()){
            String key= entry.getKey();
            List value= entry.getValue();

            System.out.println("Product: "+key+" has been sold :" +value.get(0)+" times and the total cost of sales is "+ value.get(1)+"€.");
        }

    }



}
