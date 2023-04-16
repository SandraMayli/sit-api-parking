package com.parking.apiparking.entities;

import java.time.LocalDateTime;

public class Car {
    private String licencePlate;
    private String color;
    private LocalDateTime entryTime;

    public Car(String licencePlate, String color) {
        this.licencePlate = licencePlate;
        this.color = color;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
