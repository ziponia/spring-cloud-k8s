package com.example.display;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/displays")
public class ProductDisplayEndpoint {

    private final ProductClient productClient;

    @GetMapping
    public String findProducts() {
        return productClient.getProducts();
    }
}
