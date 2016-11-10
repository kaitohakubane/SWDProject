package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/10/2016.
 */
@Entity
@Table(name = "BillDetail", schema = "dbo", catalog = "SneakerGo")
@IdClass(BillDetailEntityPK.class)
public class BillDetailEntity {
    private int billId;
    private int productId;
    private Integer quantity;
    private String price;

    @Id
    @Column(name = "billID", nullable = false)
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Id
    @Column(name = "productID", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "price", nullable = true, length = 255)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillDetailEntity that = (BillDetailEntity) o;

        if (billId != that.billId) return false;
        if (productId != that.productId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + productId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
