package com.tyss.solidprinciple.interfacesegregation;

public class OnlineCustomerImpl implements PaymentInterface, OrderInterface, HomeDelivery {
    @Override
    public void placeOrder() {
        System.out.println("Order Placed");
    }

    @Override
    public void payForOrder() {
        System.out.println("Payment done");
    }

    @Override
    public void homeDelivery() {
        System.out.println("Home delivery taken");
    }
}