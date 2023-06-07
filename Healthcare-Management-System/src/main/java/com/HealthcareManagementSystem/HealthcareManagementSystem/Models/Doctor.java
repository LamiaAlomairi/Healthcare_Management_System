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
    Integer id;
    String name;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<MedicalAppointment> appointments;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<Patient> patients;

    @ManyToOne
    @JoinColumn(name = "Hospital_id", referencedColumnName = "id")
    Hospital hospital;
}
