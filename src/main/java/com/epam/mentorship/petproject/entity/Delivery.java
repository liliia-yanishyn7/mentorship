package com.epam.mentorship.petproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class Delivery {
    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int deliveryID = count.getAndIncrement();
    private User user;
    private Order order;

    public Delivery(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }
}
