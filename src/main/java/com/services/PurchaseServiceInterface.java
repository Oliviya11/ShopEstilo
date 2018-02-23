package com.services;

import com.users.Purchase;

import java.util.Date;
import java.util.List;

public interface PurchaseServiceInterface {

    void addPurchase(Purchase purchase);
    void updatePurchase(Purchase purchase);
    void deletePurchase(long id);
    List<Purchase> getPurchaseByCustomer(long customerId);
    List<Purchase> getPurchaseByDate(Date from, Date to);
}
