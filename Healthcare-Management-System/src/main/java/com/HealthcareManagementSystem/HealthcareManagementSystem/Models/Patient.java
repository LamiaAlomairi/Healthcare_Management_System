package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
