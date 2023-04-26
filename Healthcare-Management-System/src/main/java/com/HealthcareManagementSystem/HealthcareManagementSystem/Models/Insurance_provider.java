package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
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

    @ManyToMany(mappedBy = "insurance_providers")
    @JsonIgnore
    private List<Hospital> hospitals;
}
