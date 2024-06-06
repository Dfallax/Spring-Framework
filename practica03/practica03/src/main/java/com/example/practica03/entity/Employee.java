package com.example.practica03.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employess")
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    //evitar un registro con el mismo nombre el 'unite = true'
    @Column(name = "full_name", unique = true)
    private  String fullName;

    private LocalDate birthDay;

    public Employee(Long id, String fullName, LocalDate birthDay) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
