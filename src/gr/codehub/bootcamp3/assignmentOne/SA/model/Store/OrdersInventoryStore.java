package gr.codehub.bootcamp3.assignmentOne.SA.model.Store;

import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;

import java.util.*;


public class OrdersInventoryStore extends InventoryRetailStore {
    private Queue<Order> ordersList = new LinkedList<Order>();


    public Queue<Order> getOrdersList() {
        return ordersList;
    }

    public void createOrder(Customer c, Product p) {

        Date date= new Date();
        Order o= new Order(p,c ,date,"is not delivered");
        ordersList.add(o);
        System.out.println(o.getP().getName());

    }

    public void executeOrder(){
        Order o=ordersList.remove();
        System.out.println(o.getP().getName());
        Product p= o.getP();
        sell(p);
        o.setDeliveryStatus("delivered");
        System.out.println("The order is executed. The product '"+p.getName()+"' which was bought at: "+ o.getDate().toString()+" has been: "+o.getDeliveryStatus());

    }



}
