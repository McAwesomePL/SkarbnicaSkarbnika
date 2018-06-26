package com.pureawesomness.skarbnicaskarbnika.data;

// Represents a single item in a list
public class Item {
    float amount;
    boolean isDone = false;

    Item(float amount) {
        this.amount = amount;
    }

    Item(float amount, boolean isDone) {
        this.amount = amount;
        this.isDone = isDone;
    }

    void updateState(boolean isDone) {
        this.isDone = isDone;
    }

    void updateAmount(float amount) {
        this.amount = amount;
    }
}
