package com.hagos.xml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductStatus {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Product> product = new ArrayList<>();
}