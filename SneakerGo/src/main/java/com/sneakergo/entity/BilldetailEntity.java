package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/21/2016.
 */
@Entity
@Table(name = "billdetail", schema = "sneakergo", catalog = "")
public class BilldetailEntity {
    private int billDetailId;
    private Integer billId;
    private Integer productId;
    private Integer quantity;
    private String price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billDetailID", nullable = false)
    public int getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(int billDetailId) {
        this.billDetailId = billDetailId;
    }

    @Basic
    @Column(name = "billID", nullable = true)
    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "productID", nullable = true)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

        BilldetailEntity that = (BilldetailEntity) o;

        if (billDetailId != that.billDetailId) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billDetailId;
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
