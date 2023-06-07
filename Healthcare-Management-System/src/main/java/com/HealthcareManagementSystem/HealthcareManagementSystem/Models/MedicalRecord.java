package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "MedicalRecord")
public class MedicalRecord {
    //سجلات طبية
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String visitDate;

    @ManyToOne
    @JoinColumn(name = "Patient_id")
    Patient patient;
}
