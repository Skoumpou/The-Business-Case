package gr.codehub.bootcamp3.assignmentOne.SA.Interfaces;

import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;

public interface Store {
    void buy(Product p);
    void sell(Product p);
    double getRevenue();
    void showInventory();
    void clearOutInventory();
    double getTotalBuyBalance();
    double getTotalSellBalance();

}

