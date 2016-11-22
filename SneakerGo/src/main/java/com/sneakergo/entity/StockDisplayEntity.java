package com.sneakergo.entity;

/**
 * Created by Hung on 11/21/2016.
 */
public class StockDisplayEntity {
    private int stockID;
    private int productID;
    private int quantity;
    private String size;
    private String productName;

    public StockDisplayEntity(int stockID, int productID, int quantity, String size, String productName) {
        this.stockID = stockID;
        this.productID = productID;
        this.quantity = quantity;
        this.size = size;
        this.productName = productName;
    }

    public StockDisplayEntity() {
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
