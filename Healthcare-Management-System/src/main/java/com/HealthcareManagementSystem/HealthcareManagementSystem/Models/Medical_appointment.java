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
@Table(name = "Medical_appointment")
public class Medical_appointment {
    //المواعيد الطبية
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Medical_appointment_id")
    Integer medical_appointment_id;

    @Column(name = "Appointment_date")
    String medical_appointment_date;

//    @ManyToOne
//    @JoinColumn(name = "Prescription_id")
//    Prescription prescription;

    @ManyToMany
    @JoinTable(name = "Medical_appointment_prescription", joinColumns = @JoinColumn(name = "Medical_appointment_id"), inverseJoinColumns = @JoinColumn(name = "Prescription_id"))
    List<Prescription> prescription;

    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    Doctor doctor;
}
