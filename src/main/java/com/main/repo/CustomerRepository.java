package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.beans.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{


}
