package com.example.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/products")
public class ProductEndpoint {

    @GetMapping(value = "")
    public String findAllProducts() {
        return "products " + LocalDateTime.now();
    }
}
