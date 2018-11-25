package com.epam.mentorship.petproject.entity;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
@EqualsAndHashCode
public class ProductCategory {

    private static final AtomicInteger count = new AtomicInteger(0);
    @Setter
    private int categoryID = count.getAndIncrement();
    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
