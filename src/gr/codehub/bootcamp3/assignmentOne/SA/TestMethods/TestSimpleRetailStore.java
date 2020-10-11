package gr.codehub.bootcamp3.assignmentOne.SA.TestMethods;

import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;
import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.SimpleRetailStore;
import gr.codehub.bootcamp3.assignmentOne.SA.Interfaces.Store;

public class TestSimpleRetailStore {
    public static void main(String[] args) {
        Product x1 = new Product("Painting Picasso.Guernica",100,1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV");
        x4.setPriceWhenBuy(100);
        x4.setPriceWhenSell(1000);
        Store mariaStore = new SimpleRetailStore();
        x1.setAvailable(false);
        mariaStore.buy(x1);
        mariaStore.buy(x2);
        mariaStore.buy(x2);
        mariaStore.buy(x4);
        mariaStore.sell(x1);
        x4.setAvailable(false);
        mariaStore.sell(x1);
        mariaStore.sell(x4);
        System.out.println(mariaStore.getRevenue());
        mariaStore.sell(x1);
        mariaStore.sell(x1);
        mariaStore.sell(x2);
        System.out.println(mariaStore.getRevenue());


    }
}
