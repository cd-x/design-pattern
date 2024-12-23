package org.example.usecase.carrental.models;

public class Invoice {
    String transactionId;
    String amount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "transactionId='" + transactionId + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
