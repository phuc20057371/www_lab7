package com.example.www_lab7.pks;

import com.example.www_lab7.models.Order;
import com.example.www_lab7.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
