package mum.coffee.controller;

import mum.coffee.domain.Product;
import mum.coffee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by amal- on 5/20/2017.
 */
@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepo;

    @RequestMapping(value="/products", method = RequestMethod.GET)
    List<Product> getAll(){
        return (List<Product>) productRepo.findAll();

    }
}
