package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @OneToMany(mappedBy = "hospital")
    @JsonIgnore
    List<Doctor> doctors;

    @ManyToMany
    @JoinTable(name = "insurance_provider_hospital", joinColumns = @JoinColumn(name = "Hospital_id"), inverseJoinColumns = @JoinColumn(name = "Company_id"))
    List<InsuranceProvider> insuranceProviders;

}
