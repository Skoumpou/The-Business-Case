package gr.codehub.bootcamp3.assignmentOne.SA.TestMethods;

import gr.codehub.bootcamp3.assignmentOne.SA.Interfaces.Store;
import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.InventoryRetailStore;
import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;

public class testInventoryStore {
    public static void main(String[] args) {
        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV", 100, 1000);
        System.out.println(x1.getName() + " has id=" + x1.getId());
        System.out.println(x2.getName() + " has id=" + x2.getId());
        System.out.println(x4.getName() + " has id=" + x4.getId());
        Store dismosStore = new InventoryRetailStore();
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.sell(x1);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.sell(x1);
        dismosStore.sell(x2);
        x4.setAvailable(false);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.buy(x4);
        dismosStore.sell(x4);
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
        dismosStore.clearOutInventory();
        dismosStore.showInventory();
        System.out.println(dismosStore.getRevenue());
    }

}
