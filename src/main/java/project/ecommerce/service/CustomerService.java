package project.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ecommerce.model.Customer;
import project.ecommerce.repository.CustomerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);

    }
}
