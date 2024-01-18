package com.tyss.solidprinciple.interfacesegregation;

public class WalkInCustomerImpl implements PaymentInterface, OrderInterface {
    @Override
    public void placeOrder() {
        System.out.println("Order Placed");
    }

    @Override
    public void payForOrder() {
        System.out.println("Payment done");
    }
}
