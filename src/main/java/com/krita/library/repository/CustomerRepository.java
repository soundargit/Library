package com.krita.library.repository;

import com.krita.library.dto.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by soundar on 24/02/2016.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
