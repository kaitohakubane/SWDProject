package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/13/2016.
 */
@Entity
@Table(name = "importdetail", schema = "sneakergo", catalog = "")
@IdClass(ImportdetailEntityPK.class)
public class ImportdetailEntity {
    private int importId;
    private int productId;
    private String price;
    private Integer quantity;

    @Id
    @Column(name = "importID", nullable = false)
    public int getImportId() {
        return importId;
    }

    public void setImportId(int importId) {
        this.importId = importId;
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
    @Column(name = "price", nullable = true, length = 255)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImportdetailEntity that = (ImportdetailEntity) o;

        if (importId != that.importId) return false;
        if (productId != that.productId) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = importId;
        result = 31 * result + productId;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
