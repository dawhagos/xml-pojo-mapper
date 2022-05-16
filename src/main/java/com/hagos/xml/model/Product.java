package com.hagos.xml.model;

import lombok.Data;

@Data
public class Product {
    private String identifier;
    private String identifierTypeCode;
    private String statusCode;
    private String statusValue;
    private String createdBy;
    private String createDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
}
