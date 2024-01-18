package com.tyss.solidprinciple.interfacesegregation;

public interface OrderInterface {
    public void placeOrder();
}

interface PaymentInterface {

    public void payForOrder();
}

interface HomeDelivery {
    public void homeDelivery();
}