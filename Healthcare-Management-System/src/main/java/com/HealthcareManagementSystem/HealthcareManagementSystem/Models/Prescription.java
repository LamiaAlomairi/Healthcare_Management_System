package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Prescription")
public class Prescription {
    //الوصفات الطبية
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Prescription_id")
    Integer prescription_id;

    @Column(name = "Prescription_name")
    String prescription_name;

    @Column(name = "Description")
    String description;
}
