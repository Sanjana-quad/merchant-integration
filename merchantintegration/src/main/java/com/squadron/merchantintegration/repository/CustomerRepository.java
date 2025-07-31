package com.squadron.merchantintegration.repository;

import com.squadron.merchantintegration.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
