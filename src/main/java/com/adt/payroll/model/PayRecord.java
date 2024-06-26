package com.adt.payroll.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(catalog = "EmployeeDB", schema = "payroll_schema", name = "pay_record")
public class PayRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "empId")
    private Integer empId;

    @Column(name = "employee")
    private String empName;

    @Column(name = "month")
    private String month;

    @Column(name = "year")
    private String year;

    @Column(name = "pdf")
    private byte[] pdf;


}
