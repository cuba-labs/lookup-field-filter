package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "DEMO_ORDER")
@Entity(name = "demo$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 3521140519108713698L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "order")
    protected Set<OrderItem> items;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }

    public Set<OrderItem> getItems() {
        return items;
    }


}