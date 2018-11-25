package com.epam.mentorship.petproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class Order {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int orderID = count.getAndIncrement();
    private List<Item> items;
    @Setter
    private int countOfItems;
    @Setter
    private double totalPrice = 0;


    public Order(List<Item> items) {
        this.items = items;
        totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        countOfItems = items.size();
    }

    public int getOrderID() {
        return orderID;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


}
