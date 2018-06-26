package com.pureawesomness.skarbnicaskarbnika.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Represents a single list
public class Lists {
    List<Item> items = new ArrayList<>();
    float totalAmount;
    Date deadline;

    void addItem(float amount) {
        items.add(new Item(amount));
    }

    float returnTotalAmount() {
        totalAmount = 0;
        for (Item i : items) {
            totalAmount += i.amount;
        }
        return totalAmount;
    }

}
