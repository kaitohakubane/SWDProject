package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/10/2016.
 */
@Entity
@Table(name = "SaleProduct", schema = "dbo", catalog = "SneakerGo")
@IdClass(SaleProductEntityPK.class)
public class SaleProductEntity {
    private int saleId;
    private int productId;

    @Id
    @Column(name = "saleID", nullable = false)
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    @Id
    @Column(name = "productID", nullable = false)
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

        SaleProductEntity that = (SaleProductEntity) o;

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
