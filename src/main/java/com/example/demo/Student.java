package com.example.demo;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {

    private String name;
    private LocalDate birthDay;
    private String address;
    private String cne;

    public Student(String name, LocalDate birthDay, String address, String cne) {
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.cne = cne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
}
