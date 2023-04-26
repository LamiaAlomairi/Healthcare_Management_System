package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Insurance_provider")
public class Insurance_provider {
    //مزودي التأمين.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Company_id")
    Integer company_id;

    @Column(name = "Company_name")
    String company_name;
}
