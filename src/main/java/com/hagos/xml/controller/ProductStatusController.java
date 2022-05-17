package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hagos.xml.Utils;
import com.hagos.xml.model.Product;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductStatusController {

    @PostMapping (path = "product-xml", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getProductXML(@RequestBody String productStr) throws JsonProcessingException {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStr, Product.class));
    }
}
