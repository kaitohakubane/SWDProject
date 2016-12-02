package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/21/2016.
 */
@Entity
@Table(name = "stock", schema = "sneakergo", catalog = "")
public class StockEntity {
    private int stockId;
    private Integer attributeId;
    private Integer productId;
    private Integer quantity;
    private Boolean enabled;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stockID", nullable = false)
    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    @Basic
    @Column(name = "attributeID", nullable = true)
    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
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
    @Column(name = "enabled", nullable = true)
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockEntity that = (StockEntity) o;

        if (stockId != that.stockId) return false;
        if (attributeId != null ? !attributeId.equals(that.attributeId) : that.attributeId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockId;
        result = 31 * result + (attributeId != null ? attributeId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
