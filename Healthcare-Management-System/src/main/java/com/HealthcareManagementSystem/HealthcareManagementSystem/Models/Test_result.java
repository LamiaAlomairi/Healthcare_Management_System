package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Test_result")
public class Test_result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Test_id")
    Integer test_id;

    @ManyToOne
    @JoinColumn(name = "Patient_id")
    Patient patient;
}
