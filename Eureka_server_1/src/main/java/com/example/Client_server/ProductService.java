package com.example.Client_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    @Autowired
    ProductInterface productInterface;



    public  List<Product> getCustomerByName(String name) {
       // log.info("Getting customer {} from the repository.", name);

        List<Product> customerList = productInterface.findByName(name);

        if (CollectionUtils.isEmpty(customerList)) {
           // log.info("No customer found by name {}", name);
            return new ArrayList<Product>();
        }
        //log.info("found {} customers by name {}", customerList.size(), name);
        return customerList;
    }






  /*  public Product addCustomer(Product product) {
        log.info("Adding customer {} to database", product.getName());
        Product customer2 = customerRepository.save(product);
        log.info("Added customer {} successfully", customer2.getName());
        return customer2;*/
    }

