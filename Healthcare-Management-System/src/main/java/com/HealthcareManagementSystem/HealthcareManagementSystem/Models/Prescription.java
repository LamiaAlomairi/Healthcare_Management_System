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

//    @OneToMany(mappedBy = "prescription")
//    @JsonIgnore
//    private List<Medical_appointment> medicalAppointments;

    @ManyToMany(mappedBy = "prescription")
    @JsonIgnore
    private List<Medical_appointment> medicalAppointments;
}
