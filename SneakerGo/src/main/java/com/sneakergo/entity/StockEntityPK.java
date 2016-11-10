package com.sneakergo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Hung on 11/10/2016.
 */
public class StockEntityPK implements Serializable {
    private int attributeId;
    private int productId;

    @Column(name = "attributeID", nullable = false)
    @Id
    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
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

        StockEntityPK that = (StockEntityPK) o;

        if (attributeId != that.attributeId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributeId;
        result = 31 * result + productId;
        return result;
    }
}
