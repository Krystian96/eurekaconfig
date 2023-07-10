package com.example.Eureka_server_2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "GetData"/*, url = "http://localhost:http:8762"*/)
public interface ProductServiceClient {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> getAllProducts();

    @GetMapping (value = "/product/{id}")
    Product getProduct(@PathVariable("id") int productId);

}
