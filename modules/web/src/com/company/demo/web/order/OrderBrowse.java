package com.company.demo.web.order;

import com.company.demo.entity.Customer;
import com.company.demo.entity.Order;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class OrderBrowse extends AbstractLookup {
    @Inject
    protected LookupField customerField;
    @Inject
    protected CollectionDatasource<Order, UUID> ordersDs;
    @Inject
    protected Datasource<Customer> customerDs;

    @Override
    public void init(Map<String, Object> params) {
        customerField.addValueChangeListener(e -> {
            ordersDs.refresh();
            customerDs.setItem((Customer) e.getValue());
        });
    }
}