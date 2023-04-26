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
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Patient_id")
    Integer patient_id;

    @Column(name = "Patient_name")
    String patient_name;

    @Column(name = "Age")
    Integer age;

    @Column(name = "Phone_number")
    Integer phone_number;


    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Medical_record> medicalRecords;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    List<Test_result> testResults;

    @ManyToOne
    @JoinColumn(name = "Doctor_id", referencedColumnName = "Doctor_id")
    Doctor doctor;
}
