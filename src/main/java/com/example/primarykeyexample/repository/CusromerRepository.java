package com.example.primarykeyexample.repository;

import com.example.primarykeyexample.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CusromerRepository extends JpaRepository<Customer, CustomerPk> {
}
