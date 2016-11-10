package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/10/2016.
 */
@Entity
@Table(name = "Attribute", schema = "dbo", catalog = "SneakerGo")
public class AttributeEntity {
    private int attributeId;
    private Double size;

    @Id
    @Column(name = "attributeID", nullable = false)
    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    @Basic
    @Column(name = "size", nullable = true, precision = 0)
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributeEntity that = (AttributeEntity) o;

        if (attributeId != that.attributeId) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributeId;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
