package com.easybytes.accounts.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name = "customer")
@Getter @Setter @ToString
public class Customer {

    @Id
    @Column(name = "customer_id")
    private int customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobile;

    @Column(name = "create_dt")
    private LocalDate createDt;

}
