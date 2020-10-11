package gr.codehub.bootcamp3.assignmentOne.SA.enums;

public enum TransactionType {
    Credit(0.05),
    Cash(0.0);

    private double extradiscount;

    private TransactionType(double extradiscount){
        this.extradiscount= extradiscount;
    }

    public double getExtradiscount() {return extradiscount;}
}
