package com.sneakergo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Hung on 11/13/2016.
 */
@Entity
@Table(name = "import", schema = "sneakergo", catalog = "")
public class ImportEntity {
    private int importId;
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
        if (importDate != null ? !importDate.equals(that.importDate) : that.importDate != null) return false;
        if (supplier != null ? !supplier.equals(that.supplier) : that.supplier != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = importId;
        result = 31 * result + (importDate != null ? importDate.hashCode() : 0);
        result = 31 * result + (supplier != null ? supplier.hashCode() : 0);
        return result;
    }
}
