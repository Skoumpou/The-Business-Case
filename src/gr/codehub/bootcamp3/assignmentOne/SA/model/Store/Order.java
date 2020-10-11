package gr.codehub.bootcamp3.assignmentOne.SA.model.Store;

import gr.codehub.bootcamp3.assignmentOne.SA.model.product.Product;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;

import java.util.Date;

public class Order {
    private Product p;
    private Customer c;
    private Date date;
    private String deliveryStatus;

    public Order(Product p, Customer c, Date date, String deliveryStatus) {
        this.p = p;
        this.c = c;
        this.date = date;
        this.deliveryStatus = deliveryStatus;
    }

    public Product getP() {
        return p;
    }

    public Customer getC() {
        return c;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Date getDate() {
        return date;
    }
}
