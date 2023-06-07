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
    Integer id;
    String name;
    Integer age;
    Integer phoneNumber;


    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<MedicalRecord> medicalRecords;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    List<Test_result> testResults;

    @ManyToOne
    @JoinColumn(name = "Doctor_id", referencedColumnName = "id")
    Doctor doctor;
}
