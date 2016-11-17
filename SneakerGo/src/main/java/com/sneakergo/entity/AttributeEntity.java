package com.sneakergo.entity;

import javax.persistence.*;

/**
 * Created by Hung on 11/17/2016.
 */
@Entity
@Table(name = "attribute", schema = "sneakergo", catalog = "")
public class AttributeEntity {
    private int attributeId;
    private Integer size;

    @Id
    @Column(name = "attributeID", nullable = false)
    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
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
