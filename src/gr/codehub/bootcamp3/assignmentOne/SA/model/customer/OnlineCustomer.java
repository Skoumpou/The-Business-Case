package gr.codehub.bootcamp3.assignmentOne.SA.model.customer;

import gr.codehub.bootcamp3.assignmentOne.SA.enums.CustomerCategory;
import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;
import gr.codehub.bootcamp3.assignmentOne.SA.model.customer.Customer;

public class OnlineCustomer extends Customer {


    private String username;
    private CustomerCategory customerCategory;
    private double finalPayment;
    private TransactionType transactiontype;

    public TransactionType getTransactiontype() {return transactiontype;}

    public void setTransactiontype(TransactionType transactiontype) {this.transactiontype = transactiontype;}
    //    public OnlineCustomer(CustomerCategory customerCategory, TransactionType transactiontype) {
//        this.customerCategory = customerCategory;
//        this.transactiontype= transactiontype;
//    }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public void managepayments(double money, TransactionType transactionType){
        if (customerCategory== CustomerCategory.INDIVIDUAL){
            finalPayment= money*(1-CustomerCategory.INDIVIDUAL.getDiscount());

        }
        else if (customerCategory== CustomerCategory.BUSINESS){
            finalPayment= money*(1-CustomerCategory.BUSINESS.getDiscount());

        }
        else{
            finalPayment= money*(1-CustomerCategory.GOVERNMENT.getDiscount());

        }
        manageOnlineTransactions(transactionType, customerCategory);

    }



    public void manageOnlineTransactions(TransactionType transactionType, CustomerCategory customerCategory){
        if (transactionType== TransactionType.Credit){
            checkCustomerCategory(customerCategory);
            System.out.println(checkCustomerCategory(customerCategory));
            finalPayment= finalPayment* (1- TransactionType.Credit.getExtradiscount());
            buyInCredit(finalPayment);

        }
        else{
            finalPayment= finalPayment* (1- TransactionType.Cash.getExtradiscount());
            buyInCash(finalPayment);
        }
        getfinalPayment();


    }

    public String checkCustomerCategory(CustomerCategory customerCategory){
        if (customerCategory== CustomerCategory.GOVERNMENT){
            return getUsername()+", A Goverment Costumer can only pay via cash. Try again.";
        }
        else{
            return getUsername()+", You have an extra 5% discount for oders paid via credit card!";
        }
    }

    public double getfinalPayment(){
        return finalPayment;
    }



}
