package gr.codehub.bootcamp3.assignmentOne.SA.model.product;

import java.util.UUID;

public class Product {
    private int id;
    private static int count;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;
    private boolean available=true;
    private double  Purchaces;


    public int getId() {return id;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getPriceWhenBuy() {return priceWhenBuy;}

    public Product(String name, double priceWhenBuy, double priceWhenSell) {
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
        id=count++;


    }


    public Product(String name) {
        this.name = name;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        if(this.priceWhenBuy == 0) {
            this.priceWhenBuy = priceWhenBuy;
        } else{
            demo();
        }
    }
    public void demo() {
        String msg = "You cannot change the value of the price of the product.";
        throw new RuntimeException(msg);
    }

    public double getPriceWhenSell() {return priceWhenSell;}


    public void setPriceWhenSell(double priceWhenSell) {
        if(this.priceWhenSell == 0) {
            this.priceWhenSell = priceWhenSell;
        } else{
            demo();
        }
    }

    public void setAvailable(boolean available){
        this.available= available;
    }

    public boolean getAvailable(){
        showMessage();
        return available;

    }
    public String showMessage(){
        if (available==true){

            return "The product is still available.";
        }
        else{
            return "The product isn't available anymore";
        }
    }


}
