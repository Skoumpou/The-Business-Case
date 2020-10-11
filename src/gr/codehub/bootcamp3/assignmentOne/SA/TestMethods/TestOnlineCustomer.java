package gr.codehub.bootcamp3.assignmentOne.SA.TestMethods;

import gr.codehub.bootcamp3.assignmentOne.SA.enums.CustomerCategory;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.OnlineCustomer;
import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;

public class TestOnlineCustomer {

    public static void main(String[] args){

        OnlineCustomer o= new OnlineCustomer();
        CustomerCategory c1= CustomerCategory.INDIVIDUAL;
        o.setUsername("Maria");

        TransactionType t1= TransactionType.Credit;
        o.managepayments(250, t1);
        o.manageOnlineTransactions(t1,c1);
        System.out.println("The final payment after the discounts is "+ o.getfinalPayment());
        System.out.println("The total Cash Purchase is "+o.getTotalCashPurchases());
        System.out.println("The total Credit Purchase is "+o.getTotalCreditPurchases());
        System.out.println("The total Credit Purchase is "+o.getTotalCreditPurchases());

        o.managepayments(180, t1);
        TransactionType t3= TransactionType.Cash;
        o.manageOnlineTransactions(t3,c1);
        System.out.println("The final payment after the discounts is "+ o.getfinalPayment());
        System.out.println("The total Cash Purchase is "+o.getTotalCashPurchases());
        System.out.println("The total Credit Purchase is "+o.getTotalCreditPurchases());


        OnlineCustomer k= new OnlineCustomer();
        k.setUsername("Kiki");
        CustomerCategory c2= CustomerCategory.GOVERNMENT;
        TransactionType t2= TransactionType.Credit;
        k.managepayments(250, t2);
        k.manageOnlineTransactions(t2, c2);
        System.out.println("The final payment after the discounts is "+ k.getfinalPayment());
        System.out.println("The total Cash Purchase is "+k.getTotalCashPurchases());
        System.out.println("The total Credit Purchase is "+k.getTotalCreditPurchases());

    }
}
