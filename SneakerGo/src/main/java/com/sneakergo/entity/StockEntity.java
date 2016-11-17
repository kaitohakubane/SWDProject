package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/17/2016.
 */
@Entity
@Table(name = "stock", schema = "sneakergo", catalog = "")
public class StockEntity {
    private int stockId;
    private Integer quantity;

    @Id
    @Column(name = "stockID", nullable = false)
    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
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

        StockEntity that = (StockEntity) o;

        if (stockId != that.stockId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stockId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
