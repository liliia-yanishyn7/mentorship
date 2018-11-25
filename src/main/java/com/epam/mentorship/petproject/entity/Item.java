package com.epam.mentorship.petproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class Item {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int itemID = count.getAndIncrement();
    private String itemName;
    private double price;
    private ProductCategory productCategory;
    private String aboutItem;

    public Item(String itemName, double price, ProductCategory productCategory, String aboutItem) {
        this.itemName = itemName;
        this.price = price;
        this.productCategory = productCategory;
        this.aboutItem = aboutItem;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public String getAboutItem() {
        return aboutItem;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setAboutItem(String aboutItem) {
        this.aboutItem = aboutItem;
    }
}
