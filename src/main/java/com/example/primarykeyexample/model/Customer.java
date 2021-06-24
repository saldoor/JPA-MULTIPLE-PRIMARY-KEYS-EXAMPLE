package com.example.primarykeyexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_TBL")
@IdClass(CustomerPk.class)
public class Customer {
    @Id
    private int custid;
    @Id
    private int deptid;
    private String name;
    private String email;
    private String phone;
}
