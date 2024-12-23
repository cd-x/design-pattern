package org.example.usecase.carrental.services;

import org.example.usecase.carrental.models.Bill;
import org.example.usecase.carrental.models.Invoice;

public class PaymentSystem {
    public Invoice pay(Bill bill){
        Invoice invoice = new Invoice();
        invoice.setAmount("500.00");
        invoice.setTransactionId("ff3434-23324-123");
        return invoice;
    }
}
