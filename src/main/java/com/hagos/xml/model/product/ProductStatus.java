package com.hagos.xml.model.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.hagos.xml.model.product.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductStatus {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Product> product = new ArrayList<>();
}