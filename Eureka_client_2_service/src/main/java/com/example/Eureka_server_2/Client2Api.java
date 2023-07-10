package com.example.Eureka_server_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Client2Api {
    @Autowired

    ProductServiceClient productServiceClient;

    @GetMapping("/fetchProducts")
   public ResponseEntity<?> fetchProducts() {
        return ResponseEntity.ok(productServiceClient.getAllProducts());
    }

    @GetMapping("/fetchProduct/{id}")
    public ResponseEntity<?> fetchProduct(@PathVariable int id) {
        Product product = productServiceClient.getProduct(id);
        return ResponseEntity.ok(productServiceClient.getProduct(id));
    }

        public Client2Api(ProductServiceClient productServiceClient) {
            this.productServiceClient = productServiceClient;
        }



    }


