package com.sneakergo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Hung on 11/17/2016.
 */
public class BilldetailEntityPK implements Serializable {
    private int billId;
    private int productId;

    @Column(name = "billID", nullable = false)
    @Id
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Column(name = "productID", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BilldetailEntityPK that = (BilldetailEntityPK) o;

        if (billId != that.billId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + productId;
        return result;
    }
}
