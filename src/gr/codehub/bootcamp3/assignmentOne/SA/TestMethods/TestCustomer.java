package gr.codehub.bootcamp3.assignmentOne.SA.TestMethods;

import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;

public class TestCustomer {

//    private static void testCode() {
//        assert (chooseRandomNumber());
//
//    }

    public static void main(String[] args) {
//        testCode();
        Customer c = new Customer("Kate");
        c.setName("Kate");
        TransactionType t1= TransactionType.Credit;
        TransactionType t2= TransactionType.Cash;
        c.managepayments( 120, t1);
        c.managepayments( 100,t1);
        c.managepayments( 60,t2);
        System.out.println(c.getName()+" has payed "+c.getTotalCashPurchases()+" $ via cash and "+ c.getTotalCreditPurchases()+" $ via credit card.");
        System.out.println("The total number of transactions is "+ c.totaltrans());

    }

}
