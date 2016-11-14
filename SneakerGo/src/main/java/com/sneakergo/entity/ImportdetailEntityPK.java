package com.sneakergo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Hung on 11/13/2016.
 */
public class ImportdetailEntityPK implements Serializable {
    private int importId;
    private int productId;

    @Column(name = "importID", nullable = false)
    @Id
    public int getImportId() {
        return importId;
    }

    public void setImportId(int importId) {
        this.importId = importId;
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

        ImportdetailEntityPK that = (ImportdetailEntityPK) o;

        if (importId != that.importId) return false;
        if (productId != that.productId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = importId;
        result = 31 * result + productId;
        return result;
    }
}
