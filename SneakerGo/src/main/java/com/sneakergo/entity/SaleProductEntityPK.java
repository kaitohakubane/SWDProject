package com.sneakergo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Hung on 11/10/2016.
 */
public class SaleProductEntityPK implements Serializable {
    private int saleId;
    private int productId;

    @Column(name = "saleID", nullable = false)
    @Id
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
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

        SaleProductEntityPK that = (SaleProductEntityPK) o;

        if (saleId != that.saleId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = saleId;
        result = 31 * result + productId;
        return result;
    }
}
