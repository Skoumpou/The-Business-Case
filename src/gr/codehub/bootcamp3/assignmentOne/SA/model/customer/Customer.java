package gr.codehub.bootcamp3.assignmentOne.SA.model.customer;

import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;
import gr.codehub.bootcamp3.assignmentOne.SA.enums.TransactionType;

public class Customer {
    private String name;
    private double totalCashPurchases;
    private double totalCreditPurchases;
    private int totalNumberOfTransactions;
    double money;
    private TransactionType transactiontype;

    public TransactionType getTransactiontype() {return transactiontype;}

    public void setTransactiontype(TransactionType transactiontype) {this.transactiontype = transactiontype;}
    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public double getMoney() {return money;}


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

//payment method = 0 for credit purchase and 1 for cash purchase
    public void managepayments(double money, TransactionType transactionType){
        if (transactionType== TransactionType.Credit){
            buyInCredit(money);
        }else {
            buyInCash(money);
        }
    }


    public void buyInCash(double cashMoney){
        totalCashPurchases= totalCashPurchases +cashMoney;
        setTotalTrans();
    }
    public double getTotalCashPurchases(){return totalCashPurchases;}

    public void buyInCredit(double creditMoney){
        totalCreditPurchases= totalCreditPurchases +creditMoney;
        setTotalTrans();
    }
    public double getTotalCreditPurchases(){return totalCreditPurchases;}


    public void setTotalTrans(){
        totalNumberOfTransactions= totalNumberOfTransactions +1;
    }
    public int totaltrans(){
        return totalNumberOfTransactions;
    }


}



