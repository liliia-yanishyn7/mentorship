package com.epam.mentorship.petproject.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class Payment {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int paymentID = count.getAndIncrement();
    private PaymentType paymentType;
    private Order order;
    @Setter
    private double price;

    public Payment(PaymentType paymentType, Order order) {
        this.paymentType = paymentType;
        this.order = order;
        price = order.getTotalPrice();
    }

    public int getPaymentID() {
        return paymentID;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public Order getOrder() {
        return order;
    }

    public double getPrice() {
        return price;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
