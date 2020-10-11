package gr.codehub.bootcamp3.assignmentOne.SA.enums;

public enum CustomerCategory {
    INDIVIDUAL(0.0),
    BUSINESS(0.02),
    GOVERNMENT(0.03);

    private double discount;

    private CustomerCategory(double discount){
        this.discount= discount;
    }

    public double getDiscount() {return discount;}
}
