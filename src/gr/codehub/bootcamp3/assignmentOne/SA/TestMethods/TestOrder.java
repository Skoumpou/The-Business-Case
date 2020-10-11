package gr.codehub.bootcamp3.assignmentOne.SA.TestMethods;

import gr.codehub.bootcamp3.assignmentOne.SA.Interfaces.Store;
import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;
import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;
import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.InventoryRetailStore;
import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.Order;

import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.OrdersInventoryStore;
import gr.codehub.bootcamp3.assignmentOne.SA.model.Store.SimpleRetailStore;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestOrder {
    public static void main(String[] args) {

        List<Customer> customersList=new ArrayList<Customer>();


        Product x1 = new Product("Painting Picasso. Guernica", 100, 1000);
        Customer c = new Customer("Kate");
        customersList.add(c);

        Product x2 = new Product("Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product("Chair. Luis XV", 100, 1000);
        Customer c2 = new Customer("Elen");



        Store mariaStore = new SimpleRetailStore();
        Store dismosStore = new InventoryRetailStore();
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.buy(x2);
        dismosStore.buy(x1);
        dismosStore.buy(x4);
        dismosStore.buy(x2);
        dismosStore.sell(x1);
        dismosStore.sell(x4);
        dismosStore.sell(x2);
        dismosStore.sell(x1);
        dismosStore.showInventory();


        TransactionType t1 = TransactionType.Credit;
        TransactionType t2 = TransactionType.Cash;
        c.setTransactiontype(t1);
        OrdersInventoryStore s = new OrdersInventoryStore();
        s.createOrder(c,x1);
        s.createOrder(c,x2);
        c.setTransactiontype(t2);
        s.createOrder(c,x4);
        s.executeOrder();
        s.executeOrder();


        c2.setTransactiontype(t2);
        OrdersInventoryStore s2 = new OrdersInventoryStore();
        s2.createOrder(c2,x1);
        s2.createOrder(c2,x2);
        c2.setTransactiontype(t1);
        s2.createOrder(c2,x4);
        s2.executeOrder();
        s2.executeOrder();

        int totalNumberofTransactions=0;
        double totalCostofPurchases=0;

        for (Customer i : customersList) {
            System.out.println("Costumer named "+ c.getName()+"has made a total of "+ c.totaltrans()+"transactions and their total cost of purchases is "+c.getTotalCashPurchases()+c.getTotalCreditPurchases()+".");
        }


        for (Customer i : customersList) {
            totalNumberofTransactions= totalNumberofTransactions+ i.totaltrans();
            totalCostofPurchases= totalCostofPurchases + i.getTotalCreditPurchases()+i.getTotalCreditPurchases();
        }

        System.out.println("The total number of transactions for all customers is "+totalNumberofTransactions+ " and their total cost of all purchases is "+totalCostofPurchases+"€.");

        System.out.println("The total nuber of Sales for the Store is " +dismosStore.getTotalSellBalance()+ "€ and total number of buys "+dismosStore.getTotalBuyBalance()+"€.");









    }





}
