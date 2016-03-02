package com.krita.library.dto;

import org.springframework.data.annotation.Id;

/**
 * Created by soundar on 24/02/2016.
 */

public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
