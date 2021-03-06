package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hagos.xml.Utils;
import com.hagos.xml.model.product.Product;
import com.hagos.xml.model.product.ProductStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product Status")
@RequestMapping("product")
public class ProductStatusController {

    @PostMapping (path = "product", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getProduct(@RequestBody String productStr) throws JsonProcessingException {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStr, Product.class));
    }

    @PostMapping (path = "product-status", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getProductStatus(@RequestBody String productStatusStr) throws JsonProcessingException {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStatusStr, ProductStatus.class));
    }
}
