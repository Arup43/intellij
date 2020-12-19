package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private String registrationNumber;
    private String name;

    public Car(){

    }

    public Car(String registrationNumber, String name) {
        this.registrationNumber = registrationNumber;
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
