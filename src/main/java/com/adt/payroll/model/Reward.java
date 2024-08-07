package com.adt.payroll.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(catalog = "EmployeeDB", schema = "payroll_schema", name = "rewards")
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

@Column(name="effective_date")
    private String effectiveDate;

    @Column(name = "reward_type")
    private String rewardType;

    @Column(name = "amount")
    private double amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empId", referencedColumnName = "EMPLOYEE_ID", nullable = false, insertable = false, updatable = false)
    private User user;  
    private Integer empId;

}
