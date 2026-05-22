package org.testleaf.week4.ClassroomActivity;

//Concrete Class
public class Amazon extends CanaraBank {

    @Override
    public void cashOnDelivery() {
        System.out.println("Amazon cash on Delivery");
    }

    @Override
    public void upiPayments() {
        System.out.println("Amazon upiPayments");
    }

    @Override
    public void cardPayments() {
        System.out.println("Amazon cardPayments");
    }

    @Override
    public void internetBanking() {
        System.out.println("Amazon internetBanking");
    }

    @Override
    public void recordPaymentDetails() {
        System.out.println("Amazon recordPaymentDetails");
    }

    public static void main(String[] args) {
        Amazon obj = new Amazon();
        obj.cashOnDelivery();
        obj.upiPayments();
        obj.cardPayments();
        obj.internetBanking();
        obj.recordPaymentDetails();
        obj.eatingSnacks();
        Payments.watchingcinema();
    }

}
