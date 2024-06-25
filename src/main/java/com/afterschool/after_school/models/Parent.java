package com.afterschool.after_school.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String occupation;
    private String relationshipToStudent;
    private String emergencyContact;
    private String emergencyContactPhone;
    private String workAddress;
    private String workPhoneNumber;
    private String dateOfBirth;
    private String gender;

    @ManyToMany(mappedBy = "parents")
    private List<Student> students;

    // Getters and Setters
}