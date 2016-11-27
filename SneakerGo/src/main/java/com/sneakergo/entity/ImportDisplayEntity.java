package com.sneakergo.entity;

import com.sneakergo.common.constants.UtilsConstant;

import java.sql.Date;

/**
 * Created by Hung on 11/27/2016.
 */
public class ImportDisplayEntity {
    private int importID;
    private String productName;
    private String size;
    private Integer quantity;
    private String price;
    private Date importDate;
    private String supplier;


    public ImportDisplayEntity(int importID, String productName, String size,
                               Integer quantity, String price, Date importDate, String supplier) {
        this.importID = importID;
        this.productName = productName;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.importDate = importDate;
        this.supplier = supplier;
    }

    public ImportDisplayEntity() {
    }

    public int getImportID() {
        return importID;
    }

    public void setImportID(int importID) {
        this.importID = importID;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
