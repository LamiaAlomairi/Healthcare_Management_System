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
@Table(name = "Doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Doctor_id")
    Integer id;

    @Column(name = "Doctor_name")
    String doctor_name;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<Medical_appointment> appointments;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<Patient> patients;

    @ManyToOne
    @JoinColumn(name = "Hospital_id", referencedColumnName = "Hospital_id")
    Hospital hospital;
}
