package com.HealthcareManagementSystem.HealthcareManagementSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "MedicalAppointment")
public class MedicalAppointment {
    //المواعيد الطبية
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String date;

    @ManyToMany
    @JoinTable(name = "Medical_appointment_prescription", joinColumns = @JoinColumn(name = "Medical_appointment_id"), inverseJoinColumns = @JoinColumn(name = "Prescription_id"))
    List<Prescription> prescription;

    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    Doctor doctor;
}
