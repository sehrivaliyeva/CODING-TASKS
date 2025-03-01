package project.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.model.Customer;
import project.ecommerce.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/v/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/{name}")
    public List<Customer> findByName(@PathVariable String name) {
        return customerService.findByName(name);
    }

}
