package com.sneakergo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Hung on 11/21/2016.
 */
@Entity
@Table(name = "import", schema = "sneakergo", catalog = "")
public class ImportEntity {
    private int importId;
    private Integer stockId;
    private String price;
    private Integer quantity;
    private Date importDate;
    private String supplier;

    @Id
    @Column(name = "importID", nullable = false)
    public int getImportId() {
        return importId;
    }

    public void setImportId(int importId) {
        this.importId = importId;
    }

    @Basic
    @Column(name = "stockID", nullable = true)
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
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

    @Basic
    @Column(name = "importDate", nullable = true)
    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    @Basic
    @Column(name = "Supplier", nullable = true, length = 255)
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImportEntity that = (ImportEntity) o;

        if (importId != that.importId) return false;
        if (stockId != null ? !stockId.equals(that.stockId) : that.stockId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (importDate != null ? !importDate.equals(that.importDate) : that.importDate != null) return false;
        if (supplier != null ? !supplier.equals(that.supplier) : that.supplier != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = importId;
        result = 31 * result + (stockId != null ? stockId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (importDate != null ? importDate.hashCode() : 0);
        result = 31 * result + (supplier != null ? supplier.hashCode() : 0);
        return result;
    }
}
