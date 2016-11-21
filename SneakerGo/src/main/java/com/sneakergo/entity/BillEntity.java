package com.sneakergo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Hung on 11/21/2016.
 */
@Entity
@Table(name = "bill", schema = "sneakergo", catalog = "")
public class BillEntity {
    private int billId;
    private String accountId;
    private String totalPrice;
    private Date date;
    private Boolean enabled;

    @Id
    @Column(name = "billID", nullable = false)
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "accountID", nullable = true, length = 255)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "totalPrice", nullable = true, length = 255)
    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

        BillEntity that = (BillEntity) o;

        if (billId != that.billId) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (totalPrice != null ? !totalPrice.equals(that.totalPrice) : that.totalPrice != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
